# Analyse evosuite-model-seeding tests generation results

## Generated files

Evosuite-model-seeding generated 291 models from the [catalog](https://github.com/ow2-proactive/catalog) project. Those models can be accessed in the directory [models](models).
Evosuite succeeded to generate 149 tests classes from those models. Those tests can be accessed in the directory [evosuite-tests](evosuite-tests).

## Tests analysis

### [BucketController_ESTest](evosuite-tests/org/ow2/proactive/catalog/rest/controller/BucketController_ESTest.java)

In the BucketController_ESTest file, 14 tests were generated. The purpose of the class BucketController is to expose the REST API to the client and to call the right services regarding the client request.

#### Compilation

Several new dependencies are introduced by the generated classes. The following lines were added in the build.gradle in order to compile the generated test class:
```
testCompile group: 'org.evosuite', name: 'evosuite-runtime', version: '1.0.6'
testCompile group: 'org.evosuite', name: 'evosuite-client', version: '1.0.6'
testCompile group: 'org.evosuite', name: 'evosuite-master', version: '1.0.6'
```

The test 01, 02, 03 and 06 compile without issues.
The tests 00, 04, 05, 07, 08, 09, 10, 11, 12 do not compile because the code `mock(Project_Class.class, ViolatedAssumptionAnswer())` throws the exception
```
java: no suitable method found for mock(java.lang.Class<org.ow2.proactive.Project_Class>,org.evosuite.runtime.ViolatedAssumptionAnswer)
    method org.evosuite.shaded.org.mockito.Mockito.<T>mock(java.lang.Class<T>,org.evosuite.shaded.org.mockito.MockSettings) is not applicable
      (cannot infer type-variable(s) T
        (argument mismatch; org.evosuite.runtime.ViolatedAssumptionAnswer cannot be converted to org.evosuite.shaded.org.mockito.MockSettings))
    method org.evosuite.shaded.org.mockito.Mockito.<T>mock(java.lang.Class<T>,org.evosuite.shaded.org.mockito.stubbing.Answer) is not applicable
      (cannot infer type-variable(s) T
        (argument mismatch; org.evosuite.runtime.ViolatedAssumptionAnswer cannot be converted to org.evosuite.shaded.org.mockito.stubbing.Answer))
    method org.evosuite.shaded.org.mockito.Mockito.<T>mock(java.lang.Class<T>,java.lang.String) is not applicable
      (cannot infer type-variable(s) T
        (argument mismatch; org.evosuite.runtime.ViolatedAssumptionAnswer cannot be converted to java.lang.String))
    method org.evosuite.shaded.org.mockito.Mockito.<T>mock(java.lang.Class<T>) is not applicable
      (cannot infer type-variable(s) T
        (actual and formal argument lists differ in length))
```
The mock has four implementations `mock(Class<T>)`, `mock(Class<T>,String)`, `mock(Class<T>,Answer)`, `mock(Class<T>,MockSettings)` and none of them handle ViolatedAssumptionAnswer as the second argument.

The tests 10, 11, 13 do not compile due to the code `bucketController0.list(Param_1,Param_2,Param_3,Param_4)`. The method `list` in the generated test and in the BucketController class argument lists differ in length. This issue can be solved by adding a fifth parameter in the generated test such as `bucketController0.list(Param_1,Param_2,Param_3,Param_4, Param_5)`.

#### Conclusion

The tests 01, 02, 03, 06 and 13 (after fixing compilation issue) run successfully. Those tests check that if the service bean was not instantiated the methods will return a NullPointer exception. The spring framework ensure that those bean are always instantiated as a consequence those tests do not bring values to our test suite. They will not be integrated.

