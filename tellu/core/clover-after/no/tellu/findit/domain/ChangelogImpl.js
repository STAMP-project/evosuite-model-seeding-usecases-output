var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":84,"id":4985,"methods":[{"el":23,"sc":5,"sl":18},{"el":27,"sc":2,"sl":25},{"el":32,"sc":5,"sl":29},{"el":37,"sc":5,"sl":34},{"el":43,"sc":5,"sl":39},{"el":47,"sc":5,"sl":45},{"el":52,"sc":5,"sl":49},{"el":56,"sc":5,"sl":54},{"el":61,"sc":5,"sl":58},{"el":65,"sc":5,"sl":63},{"el":70,"sc":5,"sl":67},{"el":74,"sc":5,"sl":72},{"el":79,"sc":5,"sl":76},{"el":83,"sc":5,"sl":81}],"name":"ChangelogImpl","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_182":{"methods":[{"sl":18}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":22}]},"test_252":{"methods":[{"sl":18}],"name":"testStar","pass":true,"statements":[{"sl":22}]},"test_292":{"methods":[{"sl":18}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":22}]},"test_315":{"methods":[{"sl":18}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":22}]},"test_35":{"methods":[{"sl":18}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":22}]},"test_386":{"methods":[{"sl":18}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":22}]},"test_408":{"methods":[{"sl":18}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":22}]},"test_538":{"methods":[{"sl":18}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22}]},"test_58":{"methods":[{"sl":18}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":22}]},"test_602":{"methods":[{"sl":18}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22}]},"test_693":{"methods":[{"sl":18}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":22}]},"test_732":{"methods":[{"sl":18}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [35, 58, 386, 252, 602, 182, 732, 292, 538, 693, 408, 315], [], [], [], [35, 58, 386, 252, 602, 182, 732, 292, 538, 693, 408, 315], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]