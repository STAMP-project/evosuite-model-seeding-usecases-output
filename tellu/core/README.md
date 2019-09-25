# Core
EvoSuite Behavioral Models Seeding experiments

Running in Git Bash on Windows 10.
Running in core project folder, with a copy of botsing-model-generation and evosuite in bin sub-folder, taken from the evosuite-model-seeding-tutorial.
Coverage computed with OpenClover 4.3.1 Eclipse plugin.
Mutation score computed with PIT 1.4.7, Descartes 1.2.5 mutation engine (from Maven, with stamp profile).

## Procedure
Based on tutorial. Commands in core project folder.

```bash
mvn clean install

mvn org.apache.maven.plugins:maven-dependency-plugin:copy-dependencies

mvn dependency:build-classpath
```
The classpath refers to the local maven repo, and we export this as core_classpath.

We generate models for the main sub-packages of no.tellu.findit in this project: cmd, domain, services, util
```bash
java -d64 -Xmx10000m -jar bin/botsing-model-generation-1.0.4-SNAPSHOT-jar-with-dependencies.jar \
	-project_cp "$core_classpath" \
	-project_prefix "no.tellu.findit.util" \
	-out_dir "results/core"
```

We selected a number of classes to generate tests for. We select substantial classes for which we do not have existing unit tests. Example below. See Results for list of selected classes.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-class "no.tellu.findit.domain.ServiceProviderImpl" \
	-projectCP "$core_classpath" \
	-generateMOSuite \
	-Dalgorithm=DynaMOSA \
	-Dsearch_budget=120 \
	-Dseed_clone="0.5" \
	-Donline_model_seeding=TRUE \
	-Dmodel_path="results/core/models" \
	-Dtest_dir="results/core/evosuite-tests" \
	-Dreport_dir="results/core/evosuite-report" \
	-Dno_runtime_dependency=true
```

We try to run on two complete packages with the prefix argument, no.tellu.findit.util and no.tellu.findit.domain.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-prefix "no.tellu.findit.domain" \
	-projectCP "$core_classpath" \
	-generateMOSuite \
	-Dalgorithm=DynaMOSA \
	-Dsearch_budget=120 \
	-Dseed_clone="0.5" \
	-Donline_model_seeding=TRUE \
	-Dmodel_path="results/tellulib/models" \
	-Dtest_dir="results/tellulib/evosuite-tests" \
	-Dreport_dir="results/tellulib/evosuite-report" \
	-Dno_runtime_dependency=true
```

We run Clover from Eclipse and PIT/Descartes from Maven.

```bash
mvn org.pitest:pitest-maven:mutationCoverage -Pstamp
```

All generated tests are copied into the project and checked, removing faulty tests. Some generated tests have EvoSuite dependencies.
A test dependency to evosuite-master 1.0.6 was added to the pom file.

We run Clover and PIT/Descartes again, for scores with the new tests included.

## Results
A total of 220 model files were generated.

As in the tellulib experiment, test generation for a whole package did not work (evosuite-master with prefix argument). Test generation for specific classes always worked well. We know from the tellulib experiment that some tests fail when run, and these are removed from the test suite.

no.tellu.findit.services.AsyncServiceImpl:
Generated 6 tests. 4 working.

no.tellu.findit.services.BillingLogServiceImpl:
Generated 39 tests. 26 working.

no.tellu.findit.services.cassandra.ActivityLogItem:
Generated 48 tests. 48 working.

no.tellu.findit.services.cassandra.ActivityLogServiceImpl:
Generated 24 tests. 24 working.

no.tellu.findit.services.cassandra.DeviceHistoryServiceImpl:
Generated 8 tests. 8 working.

no.tellu.findit.services.cassandra.EventHistoryServiceImpl:
Generated 11 tests. 10 working.

no.tellu.findit.services.cassandra.HistoryDatabaseServiceImpl:
Generated 26 tests. 25 working.

no.tellu.findit.services.cassandra.StatisticsCQLServiceImpl:
Generated 19 tests. 16 working.

no.tellu.findit.util.ConvertToJson:
Generated 34 tests. 33 working.

no.tellu.findit.util.TrackingUtilities:
Generated 36 tests. 36 working.

no.tellu.findit.domain.AssetImpl:
Generated 68 tests. 68 working.

no.tellu.findit.domain.CustomerImpl:
Generated 225 tests. 220 working.

no.tellu.findit.domain.ServiceProviderImpl:
Generated 134 tests. 134 working.

Total tests after adding all generated tests which pass: 375

Coverage by Clover - before
Unit tests: 83
Coverage: 26,2%

Mutation score by Descartes - before
Mutation score: 14%
Issues: 105 (0 paritally-tested, 105 pseudo-tested)

Coverage by Clover - after
Unit tests: 375
Coverage: 34,9%
Improvement: 33,2%

Mutation score by Descartes - after
Mutation score: 26%
Improvement: 85,7%
Issues: -

Running Descartes with issue reporting turned on failed. It creates files with filenames based on method signatures, and stopped with an error which indicate the file name/path was too long for the system. We therefore could only run without issue reporting on this project.
