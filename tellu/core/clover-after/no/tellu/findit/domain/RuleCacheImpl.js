var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":79,"id":8852,"methods":[{"el":25,"sc":5,"sl":21},{"el":28,"sc":5,"sl":26},{"el":33,"sc":5,"sl":30},{"el":38,"sc":5,"sl":35},{"el":45,"sc":5,"sl":41},{"el":48,"sc":5,"sl":46},{"el":54,"sc":5,"sl":50},{"el":57,"sc":5,"sl":55},{"el":63,"sc":5,"sl":59},{"el":67,"sc":2,"sl":65},{"el":73,"sc":5,"sl":69},{"el":78,"sc":5,"sl":75}],"name":"RuleCacheImpl","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_182":{"methods":[{"sl":21}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_252":{"methods":[{"sl":21}],"name":"testStar","pass":true,"statements":[{"sl":24}]},"test_292":{"methods":[{"sl":21}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":24}]},"test_315":{"methods":[{"sl":21}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":24}]},"test_35":{"methods":[{"sl":21}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":24}]},"test_386":{"methods":[{"sl":21}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":24}]},"test_408":{"methods":[{"sl":21}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":24}]},"test_538":{"methods":[{"sl":21}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_58":{"methods":[{"sl":21}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":24}]},"test_602":{"methods":[{"sl":21}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_693":{"methods":[{"sl":21}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_732":{"methods":[{"sl":21}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [252, 732, 292, 408, 602, 182, 538, 315, 35, 693, 58, 386], [], [], [252, 732, 292, 408, 602, 182, 538, 315, 35, 693, 58, 386], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]