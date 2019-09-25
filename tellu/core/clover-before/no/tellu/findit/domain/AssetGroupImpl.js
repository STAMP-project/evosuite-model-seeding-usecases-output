var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":181,"id":3635,"methods":[{"el":33,"sc":5,"sl":31},{"el":38,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39},{"el":47,"sc":5,"sl":43},{"el":50,"sc":5,"sl":48},{"el":55,"sc":5,"sl":52},{"el":60,"sc":5,"sl":57},{"el":67,"sc":5,"sl":62},{"el":72,"sc":5,"sl":69},{"el":78,"sc":5,"sl":74},{"el":84,"sc":5,"sl":80},{"el":89,"sc":5,"sl":86},{"el":92,"sc":5,"sl":90},{"el":97,"sc":5,"sl":94},{"el":101,"sc":5,"sl":99},{"el":108,"sc":5,"sl":104},{"el":111,"sc":5,"sl":109},{"el":117,"sc":5,"sl":113},{"el":120,"sc":5,"sl":118},{"el":134,"sc":5,"sl":122},{"el":137,"sc":5,"sl":135},{"el":146,"sc":5,"sl":140},{"el":154,"sc":5,"sl":148},{"el":166,"sc":5,"sl":156},{"el":172,"sc":5,"sl":169},{"el":177,"sc":5,"sl":174},{"el":180,"sc":5,"sl":178}],"name":"AssetGroupImpl","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":31},{"sl":43}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_20":{"methods":[{"sl":31},{"sl":43}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_21":{"methods":[{"sl":31},{"sl":43}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_27":{"methods":[{"sl":31},{"sl":43},{"sl":48},{"sl":52},{"sl":86},{"sl":90},{"sl":140}],"name":"testStar","pass":true,"statements":[{"sl":32},{"sl":46},{"sl":49},{"sl":54},{"sl":88},{"sl":91},{"sl":142},{"sl":143}]},"test_28":{"methods":[{"sl":31},{"sl":43}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_29":{"methods":[{"sl":31},{"sl":43}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_4":{"methods":[{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":48},{"sl":52},{"sl":57},{"sl":62},{"sl":69},{"sl":86},{"sl":90},{"sl":94},{"sl":99},{"sl":104},{"sl":109},{"sl":113},{"sl":118},{"sl":122},{"sl":135},{"sl":174},{"sl":178}],"name":"testClearGroup","pass":true,"statements":[{"sl":32},{"sl":37},{"sl":40},{"sl":46},{"sl":49},{"sl":54},{"sl":59},{"sl":65},{"sl":66},{"sl":71},{"sl":88},{"sl":91},{"sl":96},{"sl":100},{"sl":107},{"sl":110},{"sl":116},{"sl":119},{"sl":133},{"sl":136},{"sl":176},{"sl":179}]},"test_47":{"methods":[{"sl":31},{"sl":43}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_48":{"methods":[{"sl":31},{"sl":43}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_67":{"methods":[{"sl":31},{"sl":43}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_73":{"methods":[{"sl":31},{"sl":43}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_75":{"methods":[{"sl":31},{"sl":43}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_79":{"methods":[{"sl":31},{"sl":43}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":32},{"sl":46}]},"test_82":{"methods":[{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":48},{"sl":52},{"sl":57},{"sl":62},{"sl":69},{"sl":86},{"sl":90},{"sl":94},{"sl":99},{"sl":104},{"sl":109},{"sl":113},{"sl":118},{"sl":122},{"sl":135},{"sl":174},{"sl":178}],"name":"testDeleteGroupsByOwner","pass":true,"statements":[{"sl":32},{"sl":37},{"sl":40},{"sl":46},{"sl":49},{"sl":54},{"sl":59},{"sl":65},{"sl":66},{"sl":71},{"sl":88},{"sl":91},{"sl":96},{"sl":100},{"sl":107},{"sl":110},{"sl":116},{"sl":119},{"sl":133},{"sl":136},{"sl":176},{"sl":179}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 67, 47, 48, 21, 29, 73, 20, 1, 82, 27, 75, 79, 4], [28, 67, 47, 48, 21, 29, 73, 20, 1, 82, 27, 75, 79, 4], [], [], [82, 4], [], [82, 4], [], [82, 4], [82, 4], [], [], [28, 67, 47, 48, 21, 29, 73, 20, 1, 82, 27, 75, 79, 4], [], [], [28, 67, 47, 48, 21, 29, 73, 20, 1, 82, 27, 75, 79, 4], [], [82, 27, 4], [82, 27, 4], [], [], [82, 27, 4], [], [82, 27, 4], [], [], [82, 4], [], [82, 4], [], [], [82, 4], [], [], [82, 4], [82, 4], [], [], [82, 4], [], [82, 4], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [82, 27, 4], [], [82, 27, 4], [], [82, 27, 4], [82, 27, 4], [], [], [82, 4], [], [82, 4], [], [], [82, 4], [82, 4], [], [], [], [82, 4], [], [], [82, 4], [], [82, 4], [82, 4], [], [], [82, 4], [], [], [82, 4], [], [82, 4], [82, 4], [], [], [82, 4], [], [], [], [], [], [], [], [], [], [], [82, 4], [], [82, 4], [82, 4], [], [], [], [27], [], [27], [27], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [82, 4], [], [82, 4], [], [82, 4], [82, 4], [], []]
