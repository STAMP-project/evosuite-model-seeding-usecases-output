var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":122,"id":1860,"methods":[{"el":29,"sc":5,"sl":26},{"el":36,"sc":5,"sl":31},{"el":44,"sc":5,"sl":39},{"el":55,"sc":5,"sl":46},{"el":60,"sc":5,"sl":57},{"el":65,"sc":5,"sl":62},{"el":70,"sc":5,"sl":67},{"el":78,"sc":5,"sl":72},{"el":91,"sc":5,"sl":80},{"el":109,"sc":5,"sl":93},{"el":120,"sc":2,"sl":111}],"name":"AssetDAOHibernate","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_160":{"methods":[{"sl":46}],"name":"testSaveOrUpdateAndFindById","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54}]},"test_231":{"methods":[{"sl":46},{"sl":62},{"sl":67}],"name":"testFindByNameAndOwner","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":64},{"sl":69}]},"test_293":{"methods":[{"sl":46}],"name":"testClearGroup","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54}]},"test_305":{"methods":[{"sl":46}],"name":"testDeleteRecordsByOwner","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54}]},"test_321":{"methods":[{"sl":62},{"sl":67}],"name":"testFindByNameAndOwnerNotFound","pass":true,"statements":[{"sl":64},{"sl":69}]},"test_364":{"methods":[{"sl":26},{"sl":31},{"sl":46},{"sl":80}],"name":"testDeleteCustomer","pass":true,"statements":[{"sl":28},{"sl":33},{"sl":34},{"sl":35},{"sl":48},{"sl":54},{"sl":82},{"sl":84},{"sl":85},{"sl":87},{"sl":88},{"sl":89},{"sl":90}]},"test_543":{"methods":[{"sl":46}],"name":"testSaveOrUpdateNoCustomer","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54}]},"test_595":{"methods":[{"sl":26},{"sl":31},{"sl":46},{"sl":80}],"name":"testDeleteAssetsByOwner","pass":true,"statements":[{"sl":28},{"sl":33},{"sl":34},{"sl":35},{"sl":48},{"sl":49},{"sl":54},{"sl":82},{"sl":84},{"sl":85},{"sl":87},{"sl":88},{"sl":89},{"sl":90}]},"test_678":{"methods":[{"sl":46}],"name":"testSaveOrUpdateNoName","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [595, 364], [], [595, 364], [], [], [595, 364], [], [595, 364], [595, 364], [595, 364], [], [], [], [], [], [], [], [], [], [], [293, 543, 305, 595, 160, 678, 231, 364], [], [293, 543, 305, 595, 160, 678, 231, 364], [293, 543, 305, 595, 160, 678, 231], [678], [], [], [], [293, 543, 305, 595, 160, 231, 364], [], [], [], [], [], [], [], [231, 321], [], [231, 321], [], [], [231, 321], [], [231, 321], [], [], [], [], [], [], [], [], [], [], [595, 364], [], [595, 364], [], [595, 364], [595, 364], [], [595, 364], [595, 364], [595, 364], [595, 364], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
