var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":2406,"methods":[{"el":11,"sc":5,"sl":9}],"name":"GenericHibernateDAO","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_134":{"methods":[{"sl":9}],"name":"testClearGroup","pass":true,"statements":[{"sl":10}]},"test_144":{"methods":[{"sl":9}],"name":"testStar","pass":true,"statements":[{"sl":10}]},"test_178":{"methods":[{"sl":9}],"name":"testDeleteAllByOwner","pass":true,"statements":[{"sl":10}]},"test_183":{"methods":[{"sl":9}],"name":"testSaveNotUnique","pass":true,"statements":[{"sl":10}]},"test_192":{"methods":[{"sl":9}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":10}]},"test_196":{"methods":[{"sl":9}],"name":"testFindByNameAndOwnerNotFound","pass":true,"statements":[{"sl":10}]},"test_199":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_216":{"methods":[{"sl":9}],"name":"testDeleteAssetsByOwner","pass":true,"statements":[{"sl":10}]},"test_230":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_237":{"methods":[{"sl":9}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":10}]},"test_245":{"methods":[{"sl":9}],"name":"testSaveOrUpdateAndFindAllBySensorDevice","pass":true,"statements":[{"sl":10}]},"test_26":{"methods":[{"sl":9}],"name":"doAddressLookupInnerZoneString","pass":true,"statements":[{"sl":10}]},"test_286":{"methods":[{"sl":9}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":10}]},"test_301":{"methods":[{"sl":9}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":10}]},"test_302":{"methods":[{"sl":9}],"name":"testSaveOrUpdateNoCustomer","pass":true,"statements":[{"sl":10}]},"test_317":{"methods":[{"sl":9}],"name":"testSaveOrUpdateNoName","pass":true,"statements":[{"sl":10}]},"test_331":{"methods":[{"sl":9}],"name":"test10","pass":true,"statements":[{"sl":10}]},"test_341":{"methods":[{"sl":9}],"name":"testDeleteCustomer","pass":true,"statements":[{"sl":10}]},"test_360":{"methods":[{"sl":9}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":10}]},"test_375":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_390":{"methods":[{"sl":9}],"name":"doAddressLookupInnerZone","pass":true,"statements":[{"sl":10}]},"test_398":{"methods":[{"sl":9}],"name":"doAddressLookup","pass":true,"statements":[{"sl":10}]},"test_435":{"methods":[{"sl":9}],"name":"testSaveOrUpdateAndFindByNameAndOwner","pass":true,"statements":[{"sl":10}]},"test_469":{"methods":[{"sl":9}],"name":"testFindDueForTimeout","pass":true,"statements":[{"sl":10}]},"test_476":{"methods":[{"sl":9}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":10}]},"test_481":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_494":{"methods":[{"sl":9}],"name":"testSaveOrUpdateAndFindById","pass":true,"statements":[{"sl":10}]},"test_527":{"methods":[{"sl":9}],"name":"testFindByUserAndAckNeeded","pass":true,"statements":[{"sl":10}]},"test_535":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_574":{"methods":[{"sl":9}],"name":"doAddressLookupOuterZone","pass":true,"statements":[{"sl":10}]},"test_579":{"methods":[{"sl":9}],"name":"testFindByOwnerAndAckNeeded","pass":true,"statements":[{"sl":10}]},"test_58":{"methods":[{"sl":9}],"name":"testDeleteGroupsByOwner","pass":true,"statements":[{"sl":10}]},"test_584":{"methods":[{"sl":9}],"name":"testAddSameName","pass":true,"statements":[{"sl":10}]},"test_596":{"methods":[{"sl":9}],"name":"testFindByUser","pass":true,"statements":[{"sl":10}]},"test_60":{"methods":[{"sl":9}],"name":"testSetUpData","pass":true,"statements":[{"sl":10}]},"test_607":{"methods":[{"sl":9}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":10}]},"test_614":{"methods":[{"sl":9}],"name":"testDeleteRecordsByOwner","pass":true,"statements":[{"sl":10}]},"test_658":{"methods":[{"sl":9}],"name":"testAddSensorDevice","pass":true,"statements":[{"sl":10}]},"test_663":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_677":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_682":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_699":{"methods":[{"sl":9}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":10}]},"test_714":{"methods":[{"sl":9}],"name":"testConstructor","pass":true,"statements":[{"sl":10}]},"test_717":{"methods":[{"sl":9}],"name":"checkIndoorLocationHierarchy","pass":true,"statements":[{"sl":10}]},"test_719":{"methods":[{"sl":9}],"name":"testFindByNameAndOwner","pass":true,"statements":[{"sl":10}]},"test_85":{"methods":[{"sl":9}],"name":"doAddressLookupNoZoneString","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [245, 196, 658, 183, 682, 494, 614, 60, 237, 144, 574, 719, 26, 481, 134, 717, 584, 85, 216, 375, 699, 178, 527, 663, 535, 714, 199, 302, 579, 596, 286, 341, 476, 677, 360, 390, 607, 331, 230, 192, 398, 435, 317, 58, 301, 469], [245, 196, 658, 183, 682, 494, 614, 60, 237, 144, 574, 719, 26, 481, 134, 717, 584, 85, 216, 375, 699, 178, 527, 663, 535, 714, 199, 302, 579, 596, 286, 341, 476, 677, 360, 390, 607, 331, 230, 192, 398, 435, 317, 58, 301, 469], [], [], []]
