var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":187,"id":5986,"methods":[{"el":36,"sc":5,"sl":32},{"el":40,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48},{"el":56,"sc":5,"sl":53},{"el":61,"sc":5,"sl":58},{"el":66,"sc":5,"sl":63},{"el":71,"sc":5,"sl":68},{"el":76,"sc":5,"sl":73},{"el":81,"sc":5,"sl":78},{"el":86,"sc":5,"sl":83},{"el":91,"sc":5,"sl":88},{"el":96,"sc":5,"sl":93},{"el":101,"sc":5,"sl":98},{"el":106,"sc":5,"sl":103},{"el":111,"sc":5,"sl":108},{"el":116,"sc":5,"sl":113},{"el":121,"sc":5,"sl":118},{"el":126,"sc":5,"sl":123},{"el":131,"sc":5,"sl":128},{"el":136,"sc":5,"sl":133},{"el":141,"sc":5,"sl":138},{"el":146,"sc":5,"sl":143},{"el":151,"sc":5,"sl":148},{"el":157,"sc":5,"sl":153},{"el":162,"sc":5,"sl":159},{"el":168,"sc":5,"sl":164},{"el":173,"sc":5,"sl":170},{"el":179,"sc":5,"sl":175},{"el":184,"sc":5,"sl":181}],"name":"DecorationImpl","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":32}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":35}]},"test_20":{"methods":[{"sl":32}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":35}]},"test_21":{"methods":[{"sl":32}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":35}]},"test_27":{"methods":[{"sl":32}],"name":"testStar","pass":true,"statements":[{"sl":35}]},"test_28":{"methods":[{"sl":32}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":35}]},"test_29":{"methods":[{"sl":32}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":35}]},"test_47":{"methods":[{"sl":32}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":35}]},"test_48":{"methods":[{"sl":32}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":35}]},"test_67":{"methods":[{"sl":32}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":35}]},"test_73":{"methods":[{"sl":32}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":35}]},"test_75":{"methods":[{"sl":32}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":35}]},"test_79":{"methods":[{"sl":32}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [20, 28, 67, 1, 47, 48, 21, 27, 75, 29, 79, 73], [], [], [20, 28, 67, 1, 47, 48, 21, 27, 75, 29, 79, 73], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]