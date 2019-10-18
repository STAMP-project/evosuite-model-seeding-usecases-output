var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":7661,"methods":[{"el":23,"sc":2,"sl":15},{"el":31,"sc":2,"sl":25},{"el":38,"sc":2,"sl":33},{"el":44,"sc":2,"sl":40}],"name":"BooleanOpTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_478":{"methods":[{"sl":33}],"name":"testGreater","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37}]},"test_502":{"methods":[{"sl":15}],"name":"testEquals","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]},"test_586":{"methods":[{"sl":25}],"name":"testNotEquals","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_743":{"methods":[{"sl":40}],"name":"testLess","pass":true,"statements":[{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [502], [], [502], [502], [502], [502], [502], [502], [], [], [586], [], [586], [586], [586], [586], [], [], [478], [], [478], [478], [478], [], [], [743], [], [743], [743], [], []]
