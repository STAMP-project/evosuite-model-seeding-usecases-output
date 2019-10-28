var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":5288,"methods":[{"el":25,"sc":2,"sl":21},{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31},{"el":37,"sc":2,"sl":35},{"el":41,"sc":2,"sl":39},{"el":45,"sc":2,"sl":43},{"el":49,"sc":2,"sl":47},{"el":53,"sc":2,"sl":51},{"el":57,"sc":2,"sl":55},{"el":61,"sc":2,"sl":59},{"el":65,"sc":2,"sl":63},{"el":69,"sc":2,"sl":67},{"el":73,"sc":2,"sl":71},{"el":77,"sc":2,"sl":75},{"el":82,"sc":2,"sl":79},{"el":86,"sc":2,"sl":84},{"el":91,"sc":2,"sl":88},{"el":96,"sc":2,"sl":94}],"name":"CustomerImage","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_144":{"methods":[{"sl":21}],"name":"testStar","pass":true,"statements":[{"sl":24}]},"test_2":{"methods":[{"sl":21}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":24}]},"test_286":{"methods":[{"sl":21}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":24}]},"test_290":{"methods":[{"sl":21}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_301":{"methods":[{"sl":21}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":24}]},"test_335":{"methods":[{"sl":21}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_360":{"methods":[{"sl":21}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":24}]},"test_550":{"methods":[{"sl":21}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":24}]},"test_571":{"methods":[{"sl":21}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":24}]},"test_588":{"methods":[{"sl":21}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_607":{"methods":[{"sl":21}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":24}]},"test_9":{"methods":[{"sl":21}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2, 550, 286, 9, 571, 301, 144, 588, 607, 335, 290, 360], [], [], [2, 550, 286, 9, 571, 301, 144, 588, 607, 335, 290, 360], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]