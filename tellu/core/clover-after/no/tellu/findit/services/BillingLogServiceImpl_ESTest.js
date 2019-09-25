var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":343,"id":21308,"methods":[{"el":27,"sc":3,"sl":19},{"el":37,"sc":3,"sl":29},{"el":47,"sc":3,"sl":39},{"el":57,"sc":3,"sl":49},{"el":67,"sc":3,"sl":59},{"el":77,"sc":3,"sl":69},{"el":87,"sc":3,"sl":79},{"el":97,"sc":3,"sl":89},{"el":107,"sc":3,"sl":99},{"el":117,"sc":3,"sl":109},{"el":127,"sc":3,"sl":119},{"el":137,"sc":3,"sl":129},{"el":147,"sc":3,"sl":139},{"el":162,"sc":3,"sl":149},{"el":177,"sc":3,"sl":164},{"el":192,"sc":3,"sl":179},{"el":207,"sc":3,"sl":194},{"el":222,"sc":3,"sl":209},{"el":237,"sc":3,"sl":224},{"el":252,"sc":3,"sl":239},{"el":267,"sc":3,"sl":254},{"el":282,"sc":3,"sl":269},{"el":297,"sc":3,"sl":284},{"el":312,"sc":3,"sl":299},{"el":327,"sc":3,"sl":314},{"el":342,"sc":3,"sl":329}],"name":"BillingLogServiceImpl_ESTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":39}],"name":"test02","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]},"test_106":{"methods":[{"sl":89}],"name":"test07","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96}]},"test_126":{"methods":[{"sl":49}],"name":"test03","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56}]},"test_151":{"methods":[{"sl":254}],"name":"test28","pass":true,"statements":[{"sl":256},{"sl":258},{"sl":259}]},"test_172":{"methods":[{"sl":119}],"name":"test10","pass":true,"statements":[{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_194":{"methods":[{"sl":69}],"name":"test05","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76}]},"test_229":{"methods":[{"sl":239}],"name":"test26","pass":true,"statements":[{"sl":241},{"sl":243},{"sl":244}]},"test_255":{"methods":[{"sl":224}],"name":"test24","pass":true,"statements":[{"sl":226},{"sl":228},{"sl":229}]},"test_327":{"methods":[{"sl":149}],"name":"test13","pass":true,"statements":[{"sl":151},{"sl":153},{"sl":154}]},"test_332":{"methods":[{"sl":284}],"name":"test32","pass":true,"statements":[{"sl":286},{"sl":288},{"sl":289}]},"test_393":{"methods":[{"sl":19}],"name":"test00","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_397":{"methods":[{"sl":79}],"name":"test06","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_421":{"methods":[{"sl":269}],"name":"test30","pass":true,"statements":[{"sl":271},{"sl":273},{"sl":274}]},"test_449":{"methods":[{"sl":139}],"name":"test12","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146}]},"test_471":{"methods":[{"sl":129}],"name":"test11","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_495":{"methods":[{"sl":314}],"name":"test36","pass":true,"statements":[{"sl":316},{"sl":318},{"sl":319}]},"test_509":{"methods":[{"sl":329}],"name":"test38","pass":true,"statements":[{"sl":331},{"sl":333},{"sl":334}]},"test_553":{"methods":[{"sl":109}],"name":"test09","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116}]},"test_554":{"methods":[{"sl":179}],"name":"test17","pass":true,"statements":[{"sl":181},{"sl":183},{"sl":184}]},"test_581":{"methods":[{"sl":209}],"name":"test22","pass":true,"statements":[{"sl":211},{"sl":213},{"sl":214}]},"test_601":{"methods":[{"sl":299}],"name":"test34","pass":true,"statements":[{"sl":301},{"sl":303},{"sl":304}]},"test_624":{"methods":[{"sl":194}],"name":"test20","pass":true,"statements":[{"sl":196},{"sl":198},{"sl":199}]},"test_645":{"methods":[{"sl":59}],"name":"test04","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66}]},"test_649":{"methods":[{"sl":29}],"name":"test01","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_7":{"methods":[{"sl":164}],"name":"test15","pass":true,"statements":[{"sl":166},{"sl":168},{"sl":169}]},"test_728":{"methods":[{"sl":99}],"name":"test08","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [393], [], [393], [393], [393], [393], [393], [393], [], [], [649], [], [649], [649], [649], [649], [649], [649], [], [], [0], [], [0], [0], [0], [0], [0], [0], [], [], [126], [], [126], [126], [126], [126], [126], [126], [], [], [645], [], [645], [645], [645], [645], [645], [645], [], [], [194], [], [194], [194], [194], [194], [194], [194], [], [], [397], [], [397], [397], [397], [397], [397], [397], [], [], [106], [], [106], [106], [106], [106], [106], [106], [], [], [728], [], [728], [728], [728], [728], [728], [728], [], [], [553], [], [553], [553], [553], [553], [553], [553], [], [], [172], [], [172], [172], [172], [172], [172], [172], [], [], [471], [], [471], [471], [471], [471], [471], [471], [], [], [449], [], [449], [449], [449], [449], [449], [449], [], [], [327], [], [327], [], [327], [327], [], [], [], [], [], [], [], [], [], [7], [], [7], [], [7], [7], [], [], [], [], [], [], [], [], [], [554], [], [554], [], [554], [554], [], [], [], [], [], [], [], [], [], [624], [], [624], [], [624], [624], [], [], [], [], [], [], [], [], [], [581], [], [581], [], [581], [581], [], [], [], [], [], [], [], [], [], [255], [], [255], [], [255], [255], [], [], [], [], [], [], [], [], [], [229], [], [229], [], [229], [229], [], [], [], [], [], [], [], [], [], [151], [], [151], [], [151], [151], [], [], [], [], [], [], [], [], [], [421], [], [421], [], [421], [421], [], [], [], [], [], [], [], [], [], [332], [], [332], [], [332], [332], [], [], [], [], [], [], [], [], [], [601], [], [601], [], [601], [601], [], [], [], [], [], [], [], [], [], [495], [], [495], [], [495], [495], [], [], [], [], [], [], [], [], [], [509], [], [509], [], [509], [509], [], [], [], [], [], [], [], [], []]
