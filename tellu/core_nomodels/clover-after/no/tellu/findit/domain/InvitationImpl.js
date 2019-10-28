var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":141,"id":7291,"methods":[{"el":27,"sc":5,"sl":24},{"el":33,"sc":5,"sl":29},{"el":36,"sc":5,"sl":34},{"el":41,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43},{"el":52,"sc":5,"sl":48},{"el":56,"sc":5,"sl":53},{"el":62,"sc":5,"sl":58},{"el":67,"sc":5,"sl":64},{"el":73,"sc":5,"sl":69},{"el":77,"sc":5,"sl":74},{"el":83,"sc":5,"sl":79},{"el":88,"sc":5,"sl":85},{"el":94,"sc":5,"sl":90},{"el":99,"sc":5,"sl":96},{"el":105,"sc":5,"sl":101},{"el":110,"sc":5,"sl":107},{"el":115,"sc":5,"sl":112},{"el":120,"sc":5,"sl":117},{"el":125,"sc":5,"sl":122},{"el":130,"sc":5,"sl":127},{"el":136,"sc":5,"sl":132},{"el":140,"sc":5,"sl":137}],"name":"InvitationImpl","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_144":{"methods":[{"sl":24},{"sl":29}],"name":"testStar","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_2":{"methods":[{"sl":24},{"sl":29}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_286":{"methods":[{"sl":24},{"sl":29}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_290":{"methods":[{"sl":24},{"sl":29}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_301":{"methods":[{"sl":24},{"sl":29}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_335":{"methods":[{"sl":24},{"sl":29}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_360":{"methods":[{"sl":24},{"sl":29}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_550":{"methods":[{"sl":24},{"sl":29}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_571":{"methods":[{"sl":24},{"sl":29}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_588":{"methods":[{"sl":24},{"sl":29}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_607":{"methods":[{"sl":24},{"sl":29}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]},"test_9":{"methods":[{"sl":24},{"sl":29}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [], [], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [], [], [286, 588, 2, 9, 290, 360, 335, 571, 301, 550, 607, 144], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]