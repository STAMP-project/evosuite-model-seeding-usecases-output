var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":365,"id":10731,"methods":[{"el":69,"sc":2,"sl":24},{"el":92,"sc":2,"sl":71},{"el":146,"sc":2,"sl":94},{"el":170,"sc":2,"sl":148},{"el":182,"sc":2,"sl":172},{"el":217,"sc":2,"sl":184},{"el":254,"sc":2,"sl":219},{"el":280,"sc":2,"sl":256},{"el":294,"sc":2,"sl":282},{"el":343,"sc":2,"sl":296},{"el":364,"sc":2,"sl":345}],"name":"DataHandleTest","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_136":{"methods":[{"sl":219}],"name":"testSetPath","pass":true,"statements":[{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":228},{"sl":230},{"sl":232},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253}]},"test_155":{"methods":[{"sl":296}],"name":"testMergeNodes","pass":true,"statements":[{"sl":298},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":306},{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":322},{"sl":323},{"sl":324},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":338},{"sl":340},{"sl":341},{"sl":342}]},"test_158":{"methods":[{"sl":172}],"name":"testSetValue","pass":true,"statements":[{"sl":174},{"sl":175},{"sl":176},{"sl":178},{"sl":179},{"sl":180},{"sl":181}]},"test_205":{"methods":[{"sl":256}],"name":"testRemoveValue","pass":true,"statements":[{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":268},{"sl":269},{"sl":270},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278}]},"test_267":{"methods":[{"sl":148}],"name":"testGetPath","pass":true,"statements":[{"sl":150},{"sl":151},{"sl":152},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":167},{"sl":169}]},"test_306":{"methods":[{"sl":71}],"name":"testNextNode","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91}]},"test_54":{"methods":[{"sl":184}],"name":"testSetArray","pass":true,"statements":[{"sl":186},{"sl":188},{"sl":189},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216}]},"test_542":{"methods":[{"sl":345}],"name":"testChangeName","pass":true,"statements":[{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":356},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363}]},"test_854":{"methods":[{"sl":282}],"name":"testAddNode","pass":true,"statements":[{"sl":284},{"sl":285},{"sl":287},{"sl":288},{"sl":289},{"sl":291},{"sl":292},{"sl":293}]},"test_882":{"methods":[{"sl":94}],"name":"testGetValue","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":99},{"sl":100},{"sl":102},{"sl":103},{"sl":104},{"sl":107},{"sl":108},{"sl":109},{"sl":111},{"sl":113},{"sl":114},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":123},{"sl":125},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":144},{"sl":145}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [306], [], [306], [306], [306], [306], [306], [306], [306], [306], [306], [306], [], [], [306], [306], [306], [306], [306], [306], [306], [], [], [882], [], [882], [882], [], [882], [882], [], [882], [882], [882], [], [], [882], [882], [882], [], [882], [], [882], [882], [], [], [882], [882], [882], [882], [882], [], [882], [], [882], [882], [], [], [882], [882], [882], [882], [], [882], [], [882], [882], [], [], [882], [882], [], [], [882], [882], [], [], [267], [], [267], [267], [267], [], [267], [267], [267], [267], [], [267], [267], [], [267], [267], [267], [267], [], [267], [], [267], [], [], [158], [], [158], [158], [158], [], [158], [158], [158], [158], [], [], [54], [], [54], [], [54], [54], [], [], [54], [54], [54], [54], [54], [54], [], [], [54], [54], [54], [54], [54], [54], [54], [54], [], [], [54], [54], [54], [54], [54], [54], [54], [], [], [136], [], [], [136], [136], [136], [136], [136], [], [136], [], [136], [], [136], [], [136], [136], [136], [136], [136], [136], [136], [136], [136], [], [], [136], [136], [136], [136], [136], [136], [136], [136], [136], [], [], [205], [], [], [205], [205], [205], [205], [205], [205], [], [], [], [205], [205], [205], [], [], [205], [205], [205], [205], [205], [205], [], [], [], [854], [], [854], [854], [], [854], [854], [854], [], [854], [854], [854], [], [], [155], [], [155], [155], [155], [155], [155], [155], [155], [], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [155], [], [155], [155], [155], [], [155], [155], [155], [155], [], [], [155], [155], [155], [155], [155], [], [155], [], [155], [155], [155], [], [], [542], [], [542], [542], [542], [542], [], [542], [542], [542], [542], [542], [], [542], [542], [542], [542], [542], [542], [], []]