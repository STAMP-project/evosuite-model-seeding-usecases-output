# Analyse evosuite-model-seeding tests generation results

## Generated files

Evosuite-model-seeding generated 291 models from the [catalog](https://github.com/ow2-proactive/catalog) project. Those models can be accessed in the directory [models](models).
Evosuite succeeded to generate 149 tests classes from those models. Those tests can be accessed in the directory [evosuite-tests](evosuite-tests).

## Compilation
New dependencies are introduced by the generated classes. The following lines was added in the build.gradle in order to compile the generated test class:
```
testCompile group: 'org.evosuite', name: 'evosuite-master', version: '1.0.6'
```

## Tests analysis

### [BucketController_ESTest](evosuite-tests/org/ow2/proactive/catalog/rest/controller/BucketController_ESTest.java)

In the BucketController_ESTest file, 14 tests were generated. The purpose of the class BucketController is to expose the REST API to the client and to call the right services regarding the client request.

#### Compilation and execution results

All the tests except 04,10, 11 and 13 compile without issues.

The test 04 do not compile due to the following line:
```doReturn("GROUP:public-objects").when(bucketRepository0).save(nullable(java.lang.Object.class));```
I had to replace `java.lang.Object.class` by `BucketEntity`.

The tests 10, 11, 13 do not compile due to the code `bucketController0.list(Param_1,Param_2,Param_3,Param_4)`. The method `list` in the generated test and in the BucketController class argument lists differ in length. This issue can be solved by adding a fifth parameter in the generated test such as `bucketController0.list(Param_1,Param_2,Param_3,Param_4, Param_5)`.

Every tests run successfully except the test 10.

#### Test 00

The aim of the test 00 is to ensure that the returned bucket owner field is null when a bucket with a null owner field is deleted.

#### Tests 01, 02, 03, 06, 11 and 13

Those tests check that if the service bean was not instantiated the methods will return a `NullPointerException`. The spring framework ensure that those bean are always instantiated as a consequence those tests do not bring value to the test suite.

#### Test 04

The test 04 ensure that if a String is returned by the save method, it will throw a ClassCastException. However this method should always return a BucketEntity not a String.
Here is the line where String object is used instead of a BucketEntity object on the mock:
`doReturn("GROUP:public-objects").when(bucketRepository0).save(nullable(BucketEntity.class));`
By replacing `GROUP:public-objects` by `new ObjectEntity()`, we remove the issue detected by the test.
This test highlights an issue that cannot exist outside the test.

It seems that there is an issue in the test 04 with the model where in the following code `bucketController0.create("GROUP:public-objects", "GROUP:", "FmoL8P13M7O");` :
 - `GROUP:public-objects` is the sessionId
 - `GROUP` is the bucketName
 - `FmoL8P13M7O is the ownerName

#### Tests 05, 07, 08 and 09

The tests 05, 07, 08, and 09 ensure that `RuntimeException` are thrown. Those tests can be improved manually by replacing the `RuntimeException` by existing custom exceptions that extends `RuntimeException`. By doing so, it enables the tests to ensure that custom exceptions are thrown when client provides bad inputs.
After updating the tests:
 - The test 05 ensure that `BucketNameIsNotValidException` is thrown when the bucket name is invalid.
 - The test 07 ensure that `DeleteNonEmptyBucketException` is thrown when the delete method is applied on a non empty bucket. (However it seems that an hibernate issue make the test crash, it throws `LazyInitializationException`.
 - The test 08 ensure that `BucketNotFoundException` is thrown when the user try to delete a bucket with the wrong name.
 - The test 09 ensure that `BucketNotFoundException` is thrown when the user try to retrieve the data of a bucket with the wrong name.

#### Test 10

The test 10 has a missing assignation which makes the test throws a `NullPointerException`.
I fix it by replacing `ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0);`
by `List<BucketEntity> entities = ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0);`
and `doReturn((List) null).when(bucketRepository0).findByOwnerIn(anyList());`
by `doReturn((List) entities).when(bucketRepository0).findByOwnerIn(anyList());
This test ensure that the the list method works well.
We can observe in this test that the argument provided do not match the parameter required:
 - `GROUP:public-objects` is the sessionId
 - `GROUP:public-objects` it the ownerName

#### Test 12

The test 12 does not contain assertions. It ensure that the method `cleanEmpty` works well with an empty repository.


