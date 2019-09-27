# FilterStore
EvoSuite Behavioral Models Seeding experiments

Running in Git Bash on Windows 10.
Running in filterstore project folder, with a copy of botsing-model-generation and evosuite in bin sub-folder, taken from the evosuite-model-seeding-tutorial.
Coverage computed with OpenClover 4.3.1 Eclipse plugin.
Mutation score computed with PIT 1.4.7, Descartes 1.2.5 mutation engine (from Maven, with stamp profile).

## Procedure
Based on tutorial, and on previous experiments on tellulib and core. Commands in filterstore project folder.

```bash
mvn clean install

mvn dependency:build-classpath
```
No need to copy dependencies into the project. The classpath refers to the local maven repo, and we export this as fs_classpath.

We generate models for no.tellu.cloud.filterstore, which contains all classes in this project.
```bash
java -d64 -Xmx10000m -jar bin/botsing-model-generation-1.0.4-SNAPSHOT-jar-with-dependencies.jar \
	-project_cp "$fs_classpath" \
	-project_prefix "no.tellu.cloud.filterstore" \
	-out_dir "results/filterstore"
```

We selected some of the classes for which models were generated, for generating tests. Example below.
```bash
java -d64 -Xmx4000m -jar bin/evosuite-master-1.0.7-SNAPSHOT.jar \
	-class "no.tellu.cloud.filterstore.devicecommand.HandleDeviceCommandResponseCmd" \
	-projectCP "$fs_classpath" \
	-generateMOSuite \
	-Dalgorithm=DynaMOSA \
	-Dsearch_budget=240 \
	-Dseed_clone="0.5" \
	-Donline_model_seeding=TRUE \
	-Dmodel_path="results/filterstore/models" \
	-Dtest_dir="results/filterstore/evosuite-tests" \
	-Dreport_dir="results/filterstore/evosuite-report" \
	-Dno_runtime_dependency=true
```

We run Clover from Eclipse and PIT/Descartes from Maven.

```bash
mvn org.pitest:pitest-maven:mutationCoverage -Pstamp
```

All generated tests are copied into the project and checked, removing faulty tests.

We run Clover and PIT/Descartes again, for scores with the new tests included.

## Results
A total of 95 model files were generated, 14 for classes in this package.

EvoSuite was not able to generate tests. Running for no.tellu.cloud.filterstore.ObservationEncoder, after starting with Progress 0% there was no output for 10 minutes. Then we got the following error:

```
[MASTER] 10:43:00.093 [main] ERROR ExternalProcessGroupHandler - Class no.tellu.cloud.filterstore.ObservationEncoder. Clients have not finished yet, although a timeout occurred.
```

At this point the Java process hangs. We tried with -Xmx8000m, with the same result. We tried  no.tellu.cloud.filterstore.FilterStoreService and no.tellu.cloud.filterstore.devicecommand.HandleDeviceCommandResponseCmd, with exactly the same result.

Based on experiments with other tools on FilterStore, we know this project is problematic. It is a high-level project with a very large dependency tree. The classpath has 214 jar files with a total size of 87,5 megabytes. The classpath is included in these results, in classpath.txt.