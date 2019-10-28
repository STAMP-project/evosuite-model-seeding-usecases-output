var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":3601,"methods":[{"el":23,"sc":5,"sl":21},{"el":29,"sc":2,"sl":25},{"el":33,"sc":5,"sl":31},{"el":38,"sc":5,"sl":35},{"el":42,"sc":5,"sl":40},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":49},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":66,"sc":5,"sl":62},{"el":70,"sc":5,"sl":68},{"el":76,"sc":5,"sl":72},{"el":80,"sc":5,"sl":78},{"el":84,"sc":5,"sl":82},{"el":88,"sc":5,"sl":86},{"el":94,"sc":5,"sl":90},{"el":98,"sc":5,"sl":96}],"name":"AssetDeviceLinkImpl","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_144":{"methods":[{"sl":21},{"sl":25}],"name":"testStar","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_2":{"methods":[{"sl":21},{"sl":25}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_286":{"methods":[{"sl":21},{"sl":25}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_290":{"methods":[{"sl":21},{"sl":25}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_301":{"methods":[{"sl":21},{"sl":25}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_335":{"methods":[{"sl":21},{"sl":25}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_360":{"methods":[{"sl":21},{"sl":25}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_550":{"methods":[{"sl":21},{"sl":25}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_571":{"methods":[{"sl":21},{"sl":25}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_588":{"methods":[{"sl":21},{"sl":25}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_607":{"methods":[{"sl":21},{"sl":25}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_9":{"methods":[{"sl":21},{"sl":25}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [286, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [286, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [], [286, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [], [286, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]