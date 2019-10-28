var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":96,"id":127,"methods":[{"el":19,"sc":3,"sl":15},{"el":24,"sc":3,"sl":21},{"el":32,"sc":3,"sl":28},{"el":37,"sc":3,"sl":34},{"el":43,"sc":3,"sl":41},{"el":48,"sc":3,"sl":45},{"el":54,"sc":3,"sl":52},{"el":59,"sc":3,"sl":56},{"el":74,"sc":2,"sl":74}],"name":"BooleanOp","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_34":{"methods":[{"sl":15}],"name":"test123","pass":true,"statements":[{"sl":16}]},"test_377":{"methods":[{"sl":15}],"name":"test085","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_389":{"methods":[{"sl":15},{"sl":74}],"name":"testCopyModel","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":74}]},"test_428":{"methods":[{"sl":41}],"name":"test086","pass":true,"statements":[{"sl":42}]},"test_437":{"methods":[{"sl":15}],"name":"testSubscribers","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_438":{"methods":[{"sl":15}],"name":"testRemovePredicate","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_47":{"methods":[{"sl":15}],"name":"testGetNodes","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_478":{"methods":[{"sl":41},{"sl":45}],"name":"testGreater","pass":true,"statements":[{"sl":42},{"sl":46},{"sl":47}]},"test_502":{"methods":[{"sl":15},{"sl":21}],"name":"testEquals","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":22},{"sl":23}]},"test_514":{"methods":[{"sl":15}],"name":"testXmlSerializer","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_515":{"methods":[{"sl":15}],"name":"testJsonSerializer","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_571":{"methods":[{"sl":15},{"sl":45}],"name":"testProcessor","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_572":{"methods":[{"sl":15}],"name":"test090","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_574":{"methods":[{"sl":45}],"name":"test134","pass":true,"statements":[{"sl":46}]},"test_586":{"methods":[{"sl":28},{"sl":34}],"name":"testNotEquals","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":35},{"sl":36}]},"test_648":{"methods":[{"sl":15}],"name":"testPredicate","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_668":{"methods":[{"sl":15}],"name":"testGetPath","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_673":{"methods":[{"sl":15},{"sl":45}],"name":"testRuleTrigger","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_686":{"methods":[{"sl":41}],"name":"test101","pass":true,"statements":[{"sl":42}]},"test_706":{"methods":[{"sl":41}],"name":"test154","pass":true,"statements":[{"sl":42}]},"test_707":{"methods":[{"sl":28}],"name":"test017","pass":true,"statements":[{"sl":29},{"sl":30}]},"test_722":{"methods":[{"sl":56}],"name":"test087","pass":true,"statements":[{"sl":57},{"sl":58}]},"test_743":{"methods":[{"sl":56}],"name":"testLess","pass":true,"statements":[{"sl":57},{"sl":58}]},"test_75":{"methods":[{"sl":15},{"sl":45}],"name":"testRuleCondition","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_760":{"methods":[{"sl":52},{"sl":56}],"name":"test135","pass":true,"statements":[{"sl":53},{"sl":57},{"sl":58}]},"test_800":{"methods":[{"sl":15}],"name":"testAddWithMeta","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_83":{"methods":[{"sl":28}],"name":"test083","pass":true,"statements":[{"sl":29},{"sl":30}]},"test_837":{"methods":[{"sl":15}],"name":"test114","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [514, 377, 837, 437, 668, 571, 800, 438, 515, 75, 47, 502, 34, 572, 389, 673, 648], [514, 377, 837, 437, 668, 571, 800, 438, 515, 75, 47, 502, 34, 572, 389, 673, 648], [514, 377, 837, 437, 668, 571, 800, 438, 515, 75, 47, 502, 572, 389, 673, 648], [514, 377, 837, 437, 668, 571, 800, 438, 515, 75, 47, 502, 572, 389, 673, 648], [], [], [502], [502], [502], [], [], [], [], [586, 707, 83], [586, 707, 83], [586, 707, 83], [586], [], [], [586], [586], [586], [], [], [], [], [478, 428, 706, 686], [478, 428, 706, 686], [], [], [478, 574, 571, 75, 673], [478, 574, 571, 75, 673], [478, 571, 75, 673], [], [], [], [], [760], [760], [], [], [722, 760, 743], [722, 760, 743], [722, 760, 743], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [389], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]