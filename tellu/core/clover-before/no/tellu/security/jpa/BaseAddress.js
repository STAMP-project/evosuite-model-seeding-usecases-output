var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":112,"id":16216,"methods":[{"el":33,"sc":5,"sl":29},{"el":40,"sc":5,"sl":38},{"el":44,"sc":5,"sl":42},{"el":48,"sc":5,"sl":46},{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":61,"sc":5,"sl":58},{"el":66,"sc":5,"sl":63},{"el":71,"sc":5,"sl":68},{"el":76,"sc":5,"sl":73},{"el":81,"sc":5,"sl":78},{"el":86,"sc":5,"sl":83},{"el":90,"sc":5,"sl":88},{"el":94,"sc":5,"sl":92},{"el":98,"sc":5,"sl":96},{"el":102,"sc":5,"sl":100},{"el":106,"sc":5,"sl":104},{"el":110,"sc":5,"sl":108}],"name":"BaseAddress","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_11":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testFindByNameAndOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_12":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteAssetsByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_20":{"methods":[{"sl":29}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":32}]},"test_21":{"methods":[{"sl":29}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":32}]},"test_26":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testSaveOrUpdateAndFindByNameAndOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_27":{"methods":[{"sl":29}],"name":"testStar","pass":true,"statements":[{"sl":32}]},"test_28":{"methods":[{"sl":29}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_29":{"methods":[{"sl":29}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":32}]},"test_32":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteRecordsByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_37":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_4":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testClearGroup","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_47":{"methods":[{"sl":29}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_48":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_50":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testSaveOrUpdateAndFindAllBySensorDevice","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_53":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testFindByNameAndOwnerNotFound","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_6":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testSaveNotUnique","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_61":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_64":{"methods":[{"sl":29},{"sl":46},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83}],"name":"testDeleteAllByOwner","pass":true,"statements":[{"sl":32},{"sl":47},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85}]},"test_65":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"checkIndoorLocationHierarchy","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_67":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_73":{"methods":[{"sl":29}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_75":{"methods":[{"sl":29}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_78":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testSaveOrUpdateAndFindById","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_79":{"methods":[{"sl":29}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":32}]},"test_81":{"methods":[{"sl":29},{"sl":46},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83}],"name":"testFindByOwnerAndAckNeeded","pass":true,"statements":[{"sl":32},{"sl":47},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85}]},"test_82":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteGroupsByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]},"test_9":{"methods":[{"sl":29},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":63},{"sl":68},{"sl":73},{"sl":78},{"sl":83},{"sl":88},{"sl":92},{"sl":96},{"sl":100},{"sl":104},{"sl":108}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":32},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":60},{"sl":65},{"sl":70},{"sl":75},{"sl":80},{"sl":85},{"sl":89},{"sl":93},{"sl":97},{"sl":101},{"sl":105},{"sl":109}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [64, 28, 47, 48, 29, 9, 65, 73, 20, 81, 1, 32, 82, 75, 78, 61, 79, 4, 37, 67, 21, 11, 26, 12, 6, 50, 53, 27], [], [], [64, 28, 47, 48, 29, 9, 65, 73, 20, 81, 1, 32, 82, 75, 78, 61, 79, 4, 37, 67, 21, 11, 26, 12, 6, 50, 53, 27], [], [], [], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [64, 48, 9, 65, 81, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [48, 9, 65, 1, 32, 82, 78, 61, 4, 37, 67, 11, 26, 12, 6, 50, 53], [], [], []]
