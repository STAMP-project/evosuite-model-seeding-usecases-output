var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":340,"id":851,"methods":[{"el":96,"sc":2,"sl":94},{"el":103,"sc":2,"sl":101},{"el":111,"sc":2,"sl":109},{"el":145,"sc":2,"sl":138},{"el":164,"sc":2,"sl":162},{"el":179,"sc":2,"sl":177},{"el":187,"sc":2,"sl":185},{"el":231,"sc":2,"sl":229},{"el":281,"sc":2,"sl":279},{"el":289,"sc":2,"sl":289},{"el":305,"sc":2,"sl":303},{"el":321,"sc":2,"sl":319},{"el":331,"sc":2,"sl":329}],"name":"DataNode","sl":25},{"el":88,"id":851,"methods":[],"name":"DataNode.Traverser","sl":54}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":94},{"sl":162},{"sl":177}],"name":"testValidation","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178}]},"test_12":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testSubscribers","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_13":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":319},{"sl":329}],"name":"testSetArray","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":320},{"sl":330}]},"test_15":{"methods":[{"sl":94},{"sl":101},{"sl":229},{"sl":329}],"name":"testInitFromModel","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":230},{"sl":330}]},"test_16":{"methods":[{"sl":162},{"sl":177}],"name":"testRemoveValue","pass":true,"statements":[{"sl":163},{"sl":178}]},"test_17":{"methods":[{"sl":94}],"name":"testInvalidWithMeta","pass":true,"statements":[{"sl":95}]},"test_18":{"methods":[{"sl":94}],"name":"testCreateFromMeta","pass":true,"statements":[{"sl":95}]},"test_19":{"methods":[{"sl":94},{"sl":101},{"sl":329}],"name":"testAddWithMeta","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":330}]},"test_2":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177}],"name":"testDataType","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178}]},"test_20":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177},{"sl":329}],"name":"testCardinality","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178},{"sl":330}]},"test_23":{"methods":[{"sl":94},{"sl":101}],"name":"testJsonSerializer","pass":true,"statements":[{"sl":95},{"sl":102}]},"test_27":{"methods":[{"sl":94}],"name":"testPath","pass":true,"statements":[{"sl":95}]},"test_3":{"methods":[{"sl":94},{"sl":177},{"sl":329}],"name":"testAddNode","pass":true,"statements":[{"sl":95},{"sl":178},{"sl":330}]},"test_32":{"methods":[{"sl":94},{"sl":177},{"sl":185},{"sl":329}],"name":"testReset","pass":true,"statements":[{"sl":95},{"sl":178},{"sl":186},{"sl":330}]},"test_33":{"methods":[{"sl":94},{"sl":177},{"sl":185},{"sl":329}],"name":"testModified","pass":true,"statements":[{"sl":95},{"sl":178},{"sl":186},{"sl":330}]},"test_34":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testRuleCondition","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_35":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testDataTransaction","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_37":{"methods":[{"sl":94}],"name":"testValueConstructor","pass":true,"statements":[{"sl":95}]},"test_39":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testProcessor","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_40":{"methods":[{"sl":94},{"sl":101},{"sl":177},{"sl":185},{"sl":329}],"name":"testMergeNodes","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":178},{"sl":186},{"sl":330}]},"test_41":{"methods":[{"sl":94},{"sl":101}],"name":"testXmlSerializer","pass":true,"statements":[{"sl":95},{"sl":102}]},"test_43":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testCopyModel","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_45":{"methods":[{"sl":94},{"sl":101}],"name":"testJsonEscapedChars","pass":true,"statements":[{"sl":95},{"sl":102}]},"test_49":{"methods":[{"sl":94},{"sl":101},{"sl":329}],"name":"testMetaParser","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":330}]},"test_5":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testRuleTrigger","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_50":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":329}],"name":"testMergeNodes","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":330}]},"test_52":{"methods":[{"sl":94}],"name":"testInitFromMeta","pass":true,"statements":[{"sl":95}]},"test_53":{"methods":[{"sl":94},{"sl":101},{"sl":177},{"sl":329}],"name":"testMergeNodes","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":178},{"sl":330}]},"test_56":{"methods":[{"sl":94}],"name":"testPredicate","pass":true,"statements":[{"sl":95}]},"test_57":{"methods":[{"sl":94},{"sl":101},{"sl":329}],"name":"testUnknownNode","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":330}]},"test_58":{"methods":[{"sl":94}],"name":"testInitFromFile","pass":true,"statements":[{"sl":95}]},"test_6":{"methods":[{"sl":162}],"name":"testSetValue","pass":true,"statements":[{"sl":163}]},"test_60":{"methods":[{"sl":94}],"name":"testJsonException","pass":true,"statements":[{"sl":95}]},"test_62":{"methods":[{"sl":94},{"sl":138},{"sl":329}],"name":"testSetMeta","pass":true,"statements":[{"sl":95},{"sl":139},{"sl":141},{"sl":144},{"sl":330}]},"test_65":{"methods":[{"sl":94}],"name":"testJsonWithMeta","pass":true,"statements":[{"sl":95}]},"test_66":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":329}],"name":"testReadOnly","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":330}]},"test_67":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":177},{"sl":329}],"name":"testSetPath","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":178},{"sl":330}]},"test_70":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":185},{"sl":319},{"sl":329}],"name":"testSetValues","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":186},{"sl":320},{"sl":330}]},"test_71":{"methods":[{"sl":94},{"sl":177},{"sl":329}],"name":"testChangeName","pass":true,"statements":[{"sl":95},{"sl":178},{"sl":330}]},"test_72":{"methods":[{"sl":94},{"sl":162},{"sl":177},{"sl":319},{"sl":329}],"name":"testSetPath","pass":true,"statements":[{"sl":95},{"sl":163},{"sl":178},{"sl":320},{"sl":330}]},"test_73":{"methods":[{"sl":101},{"sl":319}],"name":"testGetNodes","pass":true,"statements":[{"sl":102},{"sl":320}]},"test_74":{"methods":[{"sl":94}],"name":"testJsonStrict","pass":true,"statements":[{"sl":95}]},"test_75":{"methods":[{"sl":162},{"sl":177}],"name":"testSetValue","pass":true,"statements":[{"sl":163},{"sl":178}]},"test_8":{"methods":[{"sl":177},{"sl":185},{"sl":329}],"name":"testRemoveNodes","pass":true,"statements":[{"sl":178},{"sl":186},{"sl":330}]},"test_9":{"methods":[{"sl":94},{"sl":101},{"sl":162},{"sl":229},{"sl":329}],"name":"testCloneNode","pass":true,"statements":[{"sl":95},{"sl":102},{"sl":163},{"sl":230},{"sl":330}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 50, 74, 72, 18, 45, 67, 13, 27, 17, 35, 34, 33, 58, 66, 39, 70, 62, 40, 57, 53, 20, 23, 3, 65, 19, 56, 32, 12, 5, 49, 60, 41, 15, 43, 71, 52, 9, 37, 2], [0, 50, 74, 72, 18, 45, 67, 13, 27, 17, 35, 34, 33, 58, 66, 39, 70, 62, 40, 57, 53, 20, 23, 3, 65, 19, 56, 32, 12, 5, 49, 60, 41, 15, 43, 71, 52, 9, 37, 2], [], [], [], [], [], [73, 45, 67, 39, 40, 57, 53, 20, 23, 19, 12, 49, 41, 15, 43, 9, 2], [73, 45, 67, 39, 40, 57, 53, 20, 23, 19, 12, 49, 41, 15, 43, 9, 2], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [62], [62], [], [62], [], [], [62], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 50, 16, 72, 75, 67, 13, 35, 34, 66, 39, 70, 20, 12, 5, 6, 43, 9, 2], [0, 50, 16, 72, 75, 67, 13, 35, 34, 66, 39, 70, 20, 12, 5, 6, 43, 9, 2], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 50, 16, 72, 75, 67, 13, 35, 34, 33, 66, 39, 70, 40, 53, 20, 3, 32, 8, 12, 5, 43, 71, 2], [0, 50, 16, 72, 75, 67, 13, 35, 34, 33, 66, 39, 70, 40, 53, 20, 3, 32, 8, 12, 5, 43, 71, 2], [], [], [], [], [], [], [13, 35, 34, 33, 66, 39, 70, 40, 32, 8, 12, 5, 43], [13, 35, 34, 33, 66, 39, 70, 40, 32, 8, 12, 5, 43], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15, 9], [15, 9], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [72, 73, 13, 70], [72, 73, 13, 70], [], [], [], [], [], [], [], [], [50, 72, 67, 13, 35, 34, 33, 66, 39, 70, 62, 40, 57, 53, 20, 3, 19, 32, 8, 12, 5, 49, 15, 43, 71, 9], [50, 72, 67, 13, 35, 34, 33, 66, 39, 70, 62, 40, 57, 53, 20, 3, 19, 32, 8, 12, 5, 49, 15, 43, 71, 9], [], [], [], [], [], [], [], [], [], []]