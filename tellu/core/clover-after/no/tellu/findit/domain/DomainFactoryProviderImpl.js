var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":353,"id":6315,"methods":[{"el":28,"sc":5,"sl":20},{"el":46,"sc":5,"sl":30},{"el":65,"sc":5,"sl":49},{"el":79,"sc":5,"sl":67},{"el":93,"sc":5,"sl":81},{"el":104,"sc":5,"sl":95},{"el":114,"sc":5,"sl":106},{"el":119,"sc":5,"sl":116},{"el":140,"sc":5,"sl":121},{"el":149,"sc":5,"sl":142},{"el":161,"sc":5,"sl":151},{"el":205,"sc":5,"sl":163},{"el":227,"sc":2,"sl":207},{"el":252,"sc":2,"sl":229},{"el":267,"sc":2,"sl":254},{"el":276,"sc":2,"sl":268},{"el":289,"sc":2,"sl":278},{"el":299,"sc":2,"sl":291},{"el":306,"sc":5,"sl":302},{"el":312,"sc":5,"sl":308},{"el":318,"sc":5,"sl":314},{"el":330,"sc":2,"sl":320},{"el":351,"sc":2,"sl":332}],"name":"DomainFactoryProviderImpl","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_132":{"methods":[{"sl":121},{"sl":151}],"name":"testSaveNotUnique","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":127},{"sl":130},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160}]},"test_160":{"methods":[{"sl":106}],"name":"testSaveOrUpdateAndFindById","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_231":{"methods":[{"sl":106}],"name":"testFindByNameAndOwner","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_276":{"methods":[{"sl":142}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148}]},"test_292":{"methods":[{"sl":30},{"sl":67},{"sl":81}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92}]},"test_293":{"methods":[{"sl":106},{"sl":268}],"name":"testClearGroup","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":275}]},"test_305":{"methods":[{"sl":106},{"sl":254}],"name":"testDeleteRecordsByOwner","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":266}]},"test_315":{"methods":[{"sl":30},{"sl":67},{"sl":81}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92}]},"test_328":{"methods":[{"sl":278}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":288}]},"test_336":{"methods":[{"sl":81},{"sl":207}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92},{"sl":210},{"sl":213},{"sl":216},{"sl":219},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":226}]},"test_337":{"methods":[{"sl":320}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":329}]},"test_408":{"methods":[{"sl":30},{"sl":67},{"sl":81}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92}]},"test_489":{"methods":[{"sl":268}],"name":"testDeleteGroupsByOwner","pass":true,"statements":[{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":275}]},"test_511":{"methods":[{"sl":163}],"name":"testCreateRule","pass":true,"statements":[{"sl":165},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":174},{"sl":175},{"sl":177},{"sl":178},{"sl":182},{"sl":186},{"sl":188},{"sl":189},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204}]},"test_539":{"methods":[{"sl":320}],"name":"checkIndoorLocationHierarchy","pass":true,"statements":[{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":329}]},"test_543":{"methods":[{"sl":106}],"name":"testSaveOrUpdateNoCustomer","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_595":{"methods":[{"sl":106}],"name":"testDeleteAssetsByOwner","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_678":{"methods":[{"sl":106}],"name":"testSaveOrUpdateNoName","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_709":{"methods":[{"sl":121},{"sl":151}],"name":"testSaveOrUpdateAndFindAllBySensorDevice","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":127},{"sl":130},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160}]},"test_77":{"methods":[{"sl":163}],"name":"testSaveOrUpdateAndFindByNameAndOwner","pass":true,"statements":[{"sl":165},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":174},{"sl":175},{"sl":177},{"sl":178},{"sl":182},{"sl":186},{"sl":188},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [292, 408, 315], [], [292, 408, 315], [], [], [292, 408, 315], [], [], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [292, 408, 315], [], [], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [292, 408, 315], [], [], [336, 292, 408, 315], [], [336, 292, 408, 315], [336, 292, 408, 315], [336, 292, 408, 315], [336, 292, 408, 315], [336, 292, 408, 315], [336, 292, 408, 315], [336, 292, 408, 315], [], [], [336, 292, 408, 315], [], [], [], [], [], [], [], [], [], [], [], [], [], [595, 305, 160, 231, 293, 543, 678], [], [595, 305, 160, 231, 293, 543, 678], [595, 305, 160, 231, 293, 543, 678], [595, 305, 160, 231, 293, 543, 678], [595, 305, 160, 231, 293, 543, 678], [595, 305, 160, 231, 293, 543, 678], [595, 305, 160, 231, 293, 543, 678], [], [], [], [], [], [], [], [132, 709], [], [132, 709], [132, 709], [132, 709], [], [132, 709], [], [], [132, 709], [], [], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [], [], [276], [], [276], [276], [276], [276], [276], [], [], [132, 709], [], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [132, 709], [], [], [77, 511], [], [77, 511], [], [], [], [77, 511], [77, 511], [77, 511], [77, 511], [], [77, 511], [77, 511], [], [77, 511], [77, 511], [], [], [], [77, 511], [], [], [], [77, 511], [], [77, 511], [511], [], [], [], [], [], [], [], [77, 511], [77, 511], [77, 511], [77, 511], [77, 511], [77, 511], [77, 511], [77, 511], [], [], [336], [], [], [336], [], [], [336], [], [], [336], [], [], [336], [], [336], [336], [336], [336], [], [336], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [305], [], [305], [305], [305], [305], [305], [305], [305], [305], [305], [], [305], [], [489, 293], [], [489, 293], [489, 293], [489, 293], [489, 293], [], [489, 293], [], [], [328], [], [], [328], [328], [328], [328], [328], [328], [], [328], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [337, 539], [], [337, 539], [337, 539], [337, 539], [337, 539], [337, 539], [337, 539], [], [337, 539], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
