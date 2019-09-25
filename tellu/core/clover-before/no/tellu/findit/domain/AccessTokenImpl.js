var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":3408,"methods":[{"el":19,"sc":2,"sl":15},{"el":22,"sc":5,"sl":20},{"el":26,"sc":2,"sl":23},{"el":31,"sc":2,"sl":28},{"el":35,"sc":2,"sl":32},{"el":40,"sc":2,"sl":37},{"el":44,"sc":2,"sl":41},{"el":49,"sc":2,"sl":46},{"el":55,"sc":2,"sl":51},{"el":60,"sc":2,"sl":57}],"name":"AccessTokenImpl","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":15}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":18}]},"test_10":{"methods":[{"sl":15},{"sl":20},{"sl":23},{"sl":28},{"sl":32},{"sl":37},{"sl":41},{"sl":46},{"sl":51},{"sl":57}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":18},{"sl":21},{"sl":25},{"sl":30},{"sl":34},{"sl":39},{"sl":43},{"sl":48},{"sl":54},{"sl":59}]},"test_20":{"methods":[{"sl":15}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":18}]},"test_21":{"methods":[{"sl":15}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":18}]},"test_27":{"methods":[{"sl":15}],"name":"testStar","pass":true,"statements":[{"sl":18}]},"test_28":{"methods":[{"sl":15}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":18}]},"test_29":{"methods":[{"sl":15}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":18}]},"test_47":{"methods":[{"sl":15}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":18}]},"test_48":{"methods":[{"sl":15}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":18}]},"test_67":{"methods":[{"sl":15}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":18}]},"test_73":{"methods":[{"sl":15}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":18}]},"test_75":{"methods":[{"sl":15}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":18}]},"test_79":{"methods":[{"sl":15}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 67, 47, 48, 10, 21, 29, 73, 20, 1, 27, 75, 79], [], [], [28, 67, 47, 48, 10, 21, 29, 73, 20, 1, 27, 75, 79], [], [10], [10], [], [10], [], [10], [], [], [10], [], [10], [], [10], [], [10], [], [], [10], [], [10], [], [10], [], [10], [], [], [10], [], [10], [], [], [10], [], [], [10], [], [], [10], [], [10], [], []]
