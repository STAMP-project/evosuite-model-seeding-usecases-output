var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":102,"id":5101,"methods":[{"el":32,"sc":2,"sl":27},{"el":37,"sc":2,"sl":34},{"el":42,"sc":5,"sl":39},{"el":47,"sc":5,"sl":44},{"el":52,"sc":2,"sl":49},{"el":57,"sc":2,"sl":54},{"el":62,"sc":2,"sl":59},{"el":67,"sc":2,"sl":64},{"el":72,"sc":2,"sl":69},{"el":77,"sc":2,"sl":74},{"el":83,"sc":2,"sl":79},{"el":88,"sc":2,"sl":85},{"el":93,"sc":2,"sl":90},{"el":98,"sc":2,"sl":95}],"name":"ContactListItemImpl","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_144":{"methods":[{"sl":27}],"name":"testStar","pass":true,"statements":[{"sl":31}]},"test_2":{"methods":[{"sl":27}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":31}]},"test_286":{"methods":[{"sl":27}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":31}]},"test_290":{"methods":[{"sl":27}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":31}]},"test_301":{"methods":[{"sl":27}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":31}]},"test_335":{"methods":[{"sl":27}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":31}]},"test_360":{"methods":[{"sl":27}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":31}]},"test_550":{"methods":[{"sl":27}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":31}]},"test_571":{"methods":[{"sl":27}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":31}]},"test_588":{"methods":[{"sl":27}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":31}]},"test_607":{"methods":[{"sl":27}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":31}]},"test_9":{"methods":[{"sl":27}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [], [], [], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]