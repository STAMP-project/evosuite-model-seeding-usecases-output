var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":306,"id":7931,"methods":[{"el":88,"sc":2,"sl":45},{"el":96,"sc":2,"sl":90},{"el":110,"sc":2,"sl":98},{"el":116,"sc":2,"sl":112},{"el":142,"sc":2,"sl":118},{"el":164,"sc":2,"sl":144},{"el":189,"sc":2,"sl":166},{"el":238,"sc":2,"sl":191},{"el":250,"sc":2,"sl":240},{"el":268,"sc":2,"sl":252},{"el":280,"sc":2,"sl":270},{"el":305,"sc":2,"sl":282}],"name":"DataNodeTest","sl":20},{"el":43,"id":7931,"methods":[{"el":31,"sc":3,"sl":27},{"el":36,"sc":3,"sl":33},{"el":42,"sc":3,"sl":38}],"name":"DataNodeTest.TestTraverser","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_21":{"methods":[{"sl":191}],"name":"testGetValue","pass":true,"statements":[{"sl":193},{"sl":195},{"sl":196},{"sl":198},{"sl":199},{"sl":200},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":214},{"sl":216},{"sl":217},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":232},{"sl":233},{"sl":236},{"sl":237}]},"test_31":{"methods":[{"sl":112}],"name":"testValid","pass":true,"statements":[{"sl":115}]},"test_33":{"methods":[{"sl":98}],"name":"testModified","pass":true,"statements":[{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_46":{"methods":[{"sl":27},{"sl":33},{"sl":38},{"sl":90}],"name":"testTraverser","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":35},{"sl":40},{"sl":41},{"sl":92},{"sl":93},{"sl":94},{"sl":95}]},"test_47":{"methods":[{"sl":270}],"name":"testRemovePredicate","pass":true,"statements":[{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279}]},"test_54":{"methods":[{"sl":144}],"name":"testGetPath","pass":true,"statements":[{"sl":146},{"sl":147},{"sl":149},{"sl":150},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163}]},"test_56":{"methods":[{"sl":166}],"name":"testPredicate","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":172},{"sl":173},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":183},{"sl":184},{"sl":185},{"sl":187},{"sl":188}]},"test_6":{"methods":[{"sl":240}],"name":"testSetValue","pass":true,"statements":[{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249}]},"test_73":{"methods":[{"sl":118}],"name":"testGetNodes","pass":true,"statements":[{"sl":120},{"sl":121},{"sl":122},{"sl":124},{"sl":125},{"sl":127},{"sl":128},{"sl":129},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141}]},"test_8":{"methods":[{"sl":252}],"name":"testRemoveNodes","pass":true,"statements":[{"sl":255},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":261},{"sl":262},{"sl":263},{"sl":265},{"sl":266},{"sl":267}]},"test_9":{"methods":[{"sl":282}],"name":"testCloneNode","pass":true,"statements":[{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":296},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":302},{"sl":303},{"sl":304}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [46], [], [46], [46], [], [], [46], [], [46], [], [], [46], [], [46], [46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [46], [], [46], [46], [46], [46], [], [], [33], [], [33], [33], [33], [33], [33], [33], [33], [33], [33], [33], [], [], [31], [], [], [31], [], [], [73], [], [73], [73], [73], [], [73], [73], [], [73], [73], [73], [], [73], [73], [73], [73], [73], [73], [73], [73], [73], [73], [73], [], [], [54], [], [54], [54], [], [54], [54], [], [54], [54], [54], [54], [], [54], [54], [54], [54], [], [54], [54], [], [], [56], [], [], [56], [56], [], [56], [56], [], [56], [56], [56], [56], [56], [56], [56], [], [56], [56], [56], [], [56], [56], [], [], [21], [], [21], [], [21], [21], [], [21], [21], [21], [], [21], [21], [21], [21], [], [], [21], [21], [21], [21], [21], [], [21], [], [21], [21], [], [], [21], [21], [21], [21], [], [21], [], [21], [21], [21], [], [], [21], [21], [], [], [21], [21], [], [], [6], [], [6], [6], [6], [6], [6], [6], [6], [6], [], [], [8], [], [], [8], [8], [8], [8], [8], [], [8], [8], [8], [], [8], [8], [8], [], [], [47], [], [], [47], [47], [47], [47], [47], [47], [47], [], [], [9], [], [], [9], [9], [9], [9], [9], [9], [9], [9], [9], [], [], [9], [9], [9], [9], [9], [], [9], [9], [9], [], []]
