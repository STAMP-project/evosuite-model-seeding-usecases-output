var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":116,"id":10187,"methods":[{"el":35,"sc":5,"sl":33},{"el":42,"sc":5,"sl":37},{"el":45,"sc":5,"sl":43},{"el":50,"sc":5,"sl":47},{"el":55,"sc":5,"sl":52},{"el":61,"sc":5,"sl":58},{"el":65,"sc":5,"sl":63},{"el":70,"sc":5,"sl":67},{"el":73,"sc":5,"sl":71},{"el":78,"sc":5,"sl":75},{"el":81,"sc":5,"sl":79},{"el":87,"sc":5,"sl":83},{"el":90,"sc":5,"sl":88},{"el":96,"sc":5,"sl":92},{"el":99,"sc":5,"sl":97},{"el":105,"sc":5,"sl":101},{"el":108,"sc":5,"sl":106},{"el":112,"sc":5,"sl":110},{"el":115,"sc":2,"sl":113}],"name":"TemplateImpl","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":33},{"sl":37}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":41}]},"test_20":{"methods":[{"sl":33},{"sl":37}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":41}]},"test_21":{"methods":[{"sl":33},{"sl":37}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":41}]},"test_27":{"methods":[{"sl":33},{"sl":37}],"name":"testStar","pass":true,"statements":[{"sl":41}]},"test_28":{"methods":[{"sl":33},{"sl":37}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":41}]},"test_29":{"methods":[{"sl":33},{"sl":37}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":41}]},"test_47":{"methods":[{"sl":33},{"sl":37}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":41}]},"test_48":{"methods":[{"sl":33},{"sl":37}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":41}]},"test_67":{"methods":[{"sl":33},{"sl":37}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":41}]},"test_73":{"methods":[{"sl":33},{"sl":37}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":41}]},"test_75":{"methods":[{"sl":33},{"sl":37}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":41}]},"test_79":{"methods":[{"sl":33},{"sl":37}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [20, 28, 67, 1, 47, 48, 21, 27, 75, 29, 79, 73], [], [], [], [20, 28, 67, 1, 47, 48, 21, 27, 75, 29, 79, 73], [], [], [], [20, 28, 67, 1, 47, 48, 21, 27, 75, 29, 79, 73], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
