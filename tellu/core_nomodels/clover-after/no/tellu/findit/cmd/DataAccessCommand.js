var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":739,"methods":[{"el":12,"sc":5,"sl":10},{"el":19,"sc":5,"sl":14},{"el":23,"sc":5,"sl":21},{"el":27,"sc":5,"sl":25}],"name":"DataAccessCommand","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":10}],"name":"testSaveNewAssetNotAllowed","pass":true,"statements":[]},"test_144":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testStar","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_153":{"methods":[{"sl":10}],"name":"test16","pass":true,"statements":[]},"test_192":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_203":{"methods":[{"sl":10}],"name":"test09","pass":true,"statements":[]},"test_220":{"methods":[{"sl":10}],"name":"test07","pass":true,"statements":[]},"test_26":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doAddressLookupInnerZoneString","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_286":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_290":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_301":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_331":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"test10","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_335":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_341":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testDeleteCustomer","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_360":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_38":{"methods":[{"sl":10}],"name":"test04","pass":true,"statements":[]},"test_390":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doAddressLookupInnerZone","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_396":{"methods":[{"sl":10}],"name":"testConstructor","pass":true,"statements":[]},"test_398":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doAddressLookup","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_456":{"methods":[{"sl":10}],"name":"test01","pass":true,"statements":[]},"test_457":{"methods":[{"sl":10}],"name":"test20","pass":true,"statements":[]},"test_47":{"methods":[{"sl":10}],"name":"test13","pass":true,"statements":[]},"test_504":{"methods":[{"sl":10}],"name":"test11","pass":true,"statements":[]},"test_534":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doInvalidAddressLookup","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_56":{"methods":[{"sl":10}],"name":"test18","pass":true,"statements":[]},"test_563":{"methods":[{"sl":10}],"name":"test24","pass":true,"statements":[]},"test_574":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doAddressLookupOuterZone","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_588":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_607":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_644":{"methods":[{"sl":10}],"name":"test22","pass":true,"statements":[]},"test_658":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testAddSensorDevice","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_660":{"methods":[{"sl":10}],"name":"testConstructorAssetWithoutName","pass":true,"statements":[]},"test_661":{"methods":[{"sl":10}],"name":"test03","pass":true,"statements":[]},"test_85":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"doAddressLookupNoZoneString","pass":true,"statements":[{"sl":22},{"sl":26}]},"test_9":{"methods":[{"sl":10},{"sl":21},{"sl":25}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [644, 504, 121, 220, 153, 457, 534, 658, 56, 588, 203, 456, 335, 144, 396, 661, 47, 286, 38, 341, 9, 290, 574, 360, 26, 390, 607, 331, 85, 192, 398, 660, 301, 563], [], [], [], [], [], [], [], [], [], [], [534, 658, 588, 335, 144, 286, 341, 9, 290, 574, 360, 26, 390, 607, 331, 85, 192, 398, 301], [534, 658, 588, 335, 144, 286, 341, 9, 290, 574, 360, 26, 390, 607, 331, 85, 192, 398, 301], [], [], [534, 658, 588, 335, 144, 286, 341, 9, 290, 574, 360, 26, 390, 607, 331, 85, 192, 398, 301], [534, 658, 588, 335, 144, 286, 341, 9, 290, 574, 360, 26, 390, 607, 331, 85, 192, 398, 301], [], []]