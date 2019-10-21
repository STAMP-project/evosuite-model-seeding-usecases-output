# Core Nomodels
Control experiments - EvoSuite test generation without Botsing model generation

Running in Git Bash on Windows 10.
Running in core project folder, with a copy of evosuite in bin sub-folder, taken from the evosuite-model-seeding-tutorial.
Coverage computed with OpenClover 4.3.1 Eclipse plugin.
Mutation score computed with PIT 1.4.7, Descartes 1.2.5 mutation engine (from Maven, with stamp profile).

## Procedure
We follow the same procedure as in the EvoSuite Behavioral Models Seeding experiments, with the exception of Botsing model generation. Commands in tellulib project folder.

```bash
mvn clean install

mvn dependency:build-classpath
```

The classpath refers to the local maven repo, and we export this as core_classpath.

We generate tests with EvoSuite, for the same classes as in the Botsing model seeding experiments, just leaving out the model_path argument. Example below for ServiceProviderImpl. See Results for list of selected classes.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-class "no.tellu.findit.domain.ServiceProviderImpl" \
	-projectCP "$core_classpath" \
	-generateMOSuite \
	-Dalgorithm=DynaMOSA \
	-Dsearch_budget=120 \
	-Dseed_clone="0.5" \
	-Donline_model_seeding=TRUE \
	-Dtest_dir="results/core/evosuite-tests" \
	-Dreport_dir="results/core/evosuite-report" \
	-Dno_runtime_dependency=true
```

All generated tests are copied into the project and checked, removing faulty tests. Some generated tests have EvoSuite dependencies. A test dependency to evosuite-master 1.0.6 was added to the pom file.

We run Clover from Eclipse and PIT/Descartes from Maven, to compute scores to compare with the Botsing model seeding results.

```bash
mvn org.pitest:pitest-maven:mutationCoverage -Pstamp
```

## Results
Test generation was successful for all selected classes in data.

no.tellu.findit.services.AsyncServiceImpl:
Generated 5 tests. 4 working.

no.tellu.findit.services.BillingLogServiceImpl:
Generated 25 tests. 12 working.

no.tellu.findit.services.cassandra.ActivityLogItem:
Generated 53 tests. 53 working.

no.tellu.findit.services.cassandra.ActivityLogServiceImpl:
Generated 25 tests. 25 working.

no.tellu.findit.services.cassandra.DeviceHistoryServiceImpl:
Generated 8 tests. 8 working.

no.tellu.findit.services.cassandra.EventHistoryServiceImpl:
Generated 13 tests. 11 working.

no.tellu.findit.services.cassandra.HistoryDatabaseServiceImpl:
Generated 28 tests. 18 working.

no.tellu.findit.services.cassandra.StatisticsCQLServiceImpl:
Generated 19 tests. 17 working.

no.tellu.findit.util.ConvertToJson:
Generated 35 tests. 34 working.

no.tellu.findit.util.TrackingUtilities:
Generated 39 tests. 39 working.

no.tellu.findit.domain.AssetImpl:
Generated 71 tests. 71 working.

no.tellu.findit.domain.CustomerImpl:
Generated 225 tests. 224 working.

no.tellu.findit.domain.ServiceProviderImpl:
Generated 138 tests. 138 working.

Total tests after adding all generated tests which pass: 742

Coverage by Clover - after
Unit tests: 742
Coverage: 34,7%	(vs 34,9% with model seeding)

Mutation score by Descartes - after
Mutation score: 26% (same as with model seeding)
Issues: -

The differences from the model seeding experiments are small. With models we got slightly fewer tests, but slightly better coverage. The mutation score is the same, but it has just two significant digits, and the difference in coverage only appears in the third digit. Testing of BillingLogServiceImpl proved especially problematic without model, with only 12 of 25 tests working. Overall we prefer the result with model seeding.
