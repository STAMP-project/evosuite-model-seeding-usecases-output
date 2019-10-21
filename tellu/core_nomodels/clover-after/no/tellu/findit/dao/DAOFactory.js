var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":1605,"methods":[{"el":15,"sc":5,"sl":9}],"name":"DAOFactory","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_290":{"methods":[{"sl":9}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_335":{"methods":[{"sl":9}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_588":{"methods":[{"sl":9}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_9":{"methods":[{"sl":9}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [588, 9, 290, 335], [588, 9, 290, 335], [588, 9, 290, 335], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
