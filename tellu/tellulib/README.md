# TelluLib 
EvoSuite Behavioral Models Seeding experiments

Running in Git Bash on Windows 10.
Running in tellulib project folder, with a copy of botsing-model-generation and evosuite in bin sub-folder, taken from the evosuite-model-seeding-tutorial.
Coverage computed with OpenClover 4.3.1 Eclipse plugin.
Mutation score computed with PIT 1.4.7, Descartes 1.2.5 mutation engine (from Maven, with stamp profile).

## Procedure
Based on tutorial. Commands in tellulib project folder.

```bash
mvn clean install

mvn org.apache.maven.plugins:maven-dependency-plugin:copy-dependencies

mvn dependency:build-classpath

export tellulib_classpath="target/classes;target/dependency/commons-codec-1.9.jar;target/dependency/httpclient-4.5.5.jar;target/dependency/httpcore-4.4.9.jar;target/dependency/commons-logging-1.2.jar;target/dependency/junit-4.12.jar;target/dependency/hamcrest-core-1.3.jar"
```

We generate models for two sub-packages, data and util, as this is where most of the code is:
```bash
java -d64 -Xmx10000m -jar bin/botsing-model-generation-1.0.4-SNAPSHOT-jar-with-dependencies.jar \
	-project_cp "$tellulib_classpath" \
	-project_prefix "no.tellu.lib.data" \
	-out_dir "results/tellulib"
	
java -d64 -Xmx10000m -jar bin/botsing-model-generation-1.0.4-SNAPSHOT-jar-with-dependencies.jar \
	-project_cp "$tellulib_classpath" \
	-project_prefix "no.tellu.lib.util" \
	-out_dir "results/tellulib"
```

Within the data package, we select one class at a time to generate tests for. Example below for DataModel. We select the top-level classes, other classes are used by these. See Results for list of selected classes.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-class "no.tellu.lib.data.model.DataModel" \
	-projectCP "$tellulib_classpath" \
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

For util we try with thr whole package, as the classes are small.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-prefix "no.tellu.lib.util" \
	-projectCP "$tellulib_classpath" \
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

All generated tests are copied into the project and checked, removing faulty tests. Some generated tests have EvoSuite dependencies, such as:
org.evosuite.shaded.org.mockito.Mockito.*
org.evosuite.runtime.ViolatedAssumptionAnswer
org.evosuite.runtime.mock.java.io.MockFile
A test dependency to evosuite-master 1.0.6 was added to the pom file.

We run Clover and PIT/Descartes again, for scores with the new tests included.

## Results
A total of 115 model files were generated.

Models were only generated for some of the classes in the util package, and no tests could be generated for this package. Same type of error for every class:
```
[Progress:>                             0%] [Cov:>                                  0%]* Initialsss Number of Goals in DynMOSA = 3 / 8
[MASTER] 13:28:13.474 [logback-2] ERROR ClientNodeImpl - Error when generating tests for: no.tellu.lib.util.FormatUtils with seed 1569324490913. Configuration id : null
java.lang.ClassCastException: org.evosuite.testsuite.TestSuiteChromosome cannot be cast to org.evosuite.testcase.TestChromosome
        at org.evosuite.ga.metaheuristics.mosa.structural.MultiCriteriatManager.calculateFitness(MultiCriteriatManager.java:363) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.ga.metaheuristics.mosa.DynaMOSA.calculateFitness(DynaMOSA.java:237) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.ga.metaheuristics.GeneticAlgorithm.calculateFitness(GeneticAlgorithm.java:601) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.ga.metaheuristics.mosa.AbstractMOSA.initializePopulation(AbstractMOSA.java:335) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.ga.metaheuristics.mosa.DynaMOSA.generateSolution(DynaMOSA.java:148) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.strategy.WholeTestSuiteStrategy.generateTests(WholeTestSuiteStrategy.java:113) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.TestSuiteGenerator.generateTests(TestSuiteGenerator.java:676) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:244) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at org.evosuite.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:160) ~[evosuite-master-1.0.7-SNAPSHOT.jar:1.0.7-SNAPSHOT]
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_172]
        at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_172]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_172]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_172]
        at java.lang.Thread.run(Thread.java:748) [na:1.8.0_172]
```

Test generation was successful for all selected classes in data.

DataModel:
Generated 152 tests. test030 and test133 fails on IO (creating temp file). test075 fails expecting a nullpointer. test110 runs out of memory because it attempts to allocate a very large structure with a constructor argument. These were removed.
Result: 148 tests.

DataHandleImpl:
Generated 158 tests. Two tests (045 and 048) fails with stack overflow, were removed.
Result: 156 tests.

DataModelHandle:
Generated 103 tests

DataTemplate:
Generated 24 tests. test19 fails with stack overflow, was removed.
Result: 23 tests.

MultiLevelHandle:
Generated 27 tests. All pass.
Result: 27 tests.

MergeHandle:
Generated 57 tests. Four tests (05, 19, 31 and 51) fails with stack overflow, were removed.
Result: 53 tests.

DataGroupNode:
Generated 115 tests. test005 fails with stack overflow, was removed.
Result: 114 tests.

DataValueNode:
Generated 134 tests. test100 fails trying an invalid operation. 086 and 109 fails its assertion.
Result: 131 tests.

Total tests after adding all generated tests which pass: 832

Coverage by Clover - before
Unit tests: 77
Coverage: 51,9%

Mutation score by Descartes - before
Mutation score: 49%
Issues: 30 (3 paritally-tested, 27 pseudo-tested)

Coverage by Clover - after
Unit tests: 832
Coverage: 64,6%
Improvement: 24,47%

Mutation score by Descartes - after
Mutation score: 58%
Improvement: 18,37%
Issues: 52 (13 paritally-tested, 39 pseudo-tested)

We have an increase in methods which are pseudo-/partially tested. Looking at the issues in the Descartes log, we see most importantly that these methods are typically each covered by a number of generated test methods. We suspect that many of the generated tests are redundant. Indeed, going from 77 to 832 tests is a much larger increase than is necessary for the improvements in coverage and mutation score. But these tests take hardly any time to run, and running the complete test suit still takes less than 4 seconds, so we are happy with the result.

We also wanted to compare existing manually written tests with generated tests. We have both an existing and a generated set of tests for the classes DataModel and DataTemplate, and compute coverage for these. Both classes are top-level classes in their respective packages, and should be able to execute much of the code in these packages.

DataModel_ESTest (generated):
148 tests
49,2% coverage in package no.tellu.lib.data.model, 21,9% for whole project.

ModelTest (manual):
12 tests
47,4% coverage in package no.tellu.lib.data.model, 33,1% for whole project.

DataTemplate_ESTest (generated):
23 tests
56,9% coverage in package no.tellu.lib.data.template, 4,7% for whole project.

TemplateTest (manual):
5 tests
73,5% coverage in package no.tellu.lib.data.template, 7,8% for whole project.

While there are a lot more test methods in the generated suites, they tend to be much simpler than the manually written ones. The test coverage is comparable, although the manually written ones provide a bit more coverage, at least for the project as a whole.