var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":158,"id":4269,"methods":[{"el":33,"sc":5,"sl":29},{"el":37,"sc":5,"sl":35},{"el":43,"sc":5,"sl":39},{"el":49,"sc":5,"sl":45},{"el":54,"sc":5,"sl":51},{"el":60,"sc":5,"sl":56},{"el":65,"sc":5,"sl":62},{"el":71,"sc":5,"sl":67},{"el":77,"sc":5,"sl":73},{"el":83,"sc":5,"sl":79},{"el":89,"sc":5,"sl":85},{"el":95,"sc":5,"sl":91},{"el":101,"sc":5,"sl":97},{"el":107,"sc":5,"sl":103},{"el":112,"sc":5,"sl":109},{"el":118,"sc":5,"sl":114},{"el":123,"sc":5,"sl":120},{"el":129,"sc":5,"sl":125},{"el":134,"sc":5,"sl":131},{"el":140,"sc":5,"sl":136},{"el":145,"sc":5,"sl":142},{"el":151,"sc":5,"sl":147},{"el":155,"sc":5,"sl":152}],"name":"AssetRelationImpl","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":29}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":32}]},"test_20":{"methods":[{"sl":29}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":32}]},"test_21":{"methods":[{"sl":29}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":32}]},"test_27":{"methods":[{"sl":29}],"name":"testStar","pass":true,"statements":[{"sl":32}]},"test_28":{"methods":[{"sl":29}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_29":{"methods":[{"sl":29}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":32}]},"test_47":{"methods":[{"sl":29}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_48":{"methods":[{"sl":29}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":32}]},"test_67":{"methods":[{"sl":29}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":32}]},"test_73":{"methods":[{"sl":29}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_75":{"methods":[{"sl":29}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_79":{"methods":[{"sl":29}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 67, 47, 48, 21, 29, 73, 20, 1, 27, 75, 79], [], [], [28, 67, 47, 48, 21, 29, 73, 20, 1, 27, 75, 79], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
