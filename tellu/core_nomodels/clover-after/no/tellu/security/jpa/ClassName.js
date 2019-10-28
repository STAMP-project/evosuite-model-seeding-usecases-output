var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":16432,"methods":[{"el":16,"sc":2,"sl":15},{"el":19,"sc":2,"sl":17},{"el":24,"sc":5,"sl":20},{"el":28,"sc":5,"sl":26},{"el":32,"sc":5,"sl":30},{"el":36,"sc":5,"sl":34},{"el":46,"sc":5,"sl":39},{"el":53,"sc":5,"sl":48}],"name":"ClassName","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_144":{"methods":[{"sl":15},{"sl":20}],"name":"testStar","pass":true,"statements":[{"sl":23}]},"test_2":{"methods":[{"sl":15},{"sl":20}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":23}]},"test_286":{"methods":[{"sl":15},{"sl":20}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":23}]},"test_290":{"methods":[{"sl":15},{"sl":20}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":23}]},"test_301":{"methods":[{"sl":15},{"sl":20}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":23}]},"test_335":{"methods":[{"sl":15},{"sl":20}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":23}]},"test_360":{"methods":[{"sl":15},{"sl":20}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":23}]},"test_44":{"methods":[{"sl":17},{"sl":20}],"name":"test173","pass":true,"statements":[{"sl":18},{"sl":23}]},"test_550":{"methods":[{"sl":15},{"sl":20}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":23}]},"test_571":{"methods":[{"sl":15},{"sl":20}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":23}]},"test_588":{"methods":[{"sl":15},{"sl":20}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":23}]},"test_607":{"methods":[{"sl":15},{"sl":20}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":23}]},"test_9":{"methods":[{"sl":15},{"sl":20}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [286, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [44], [44], [], [286, 44, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [], [286, 44, 9, 290, 360, 571, 607, 588, 2, 335, 301, 550, 144], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]