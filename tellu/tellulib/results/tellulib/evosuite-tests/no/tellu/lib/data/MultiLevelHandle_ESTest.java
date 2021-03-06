/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 24 10:49:44 GMT 2019
 */

package no.tellu.lib.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataPath;
import no.tellu.lib.data.DataPredicate;
import no.tellu.lib.data.DataValueNode;
import no.tellu.lib.data.MultiLevelHandle;

public class MultiLevelHandle_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      // Undeclared exception!
      try { 
        multiLevelHandle0.setValue("", dataGroupNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiLevelHandle is read-only
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "P/Y%N70w ^K+:");
      // Undeclared exception!
      try { 
        multiLevelHandle0.addNode(dataGroupNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiLevelHandle is read-only
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      // Undeclared exception!
      try { 
        multiLevelHandle0.changeName("", "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiLevelHandle is read-only
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      // Undeclared exception!
      try { 
        multiLevelHandle0.removeValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiLevelHandle is read-only
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      // Undeclared exception!
      try { 
        multiLevelHandle0.mergeNode(dataGroupNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiLevelHandle is read-only
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "P/Y%N70w ^K+:");
      int int0 = multiLevelHandle0.totalNodes();
      assertFalse(multiLevelHandle0.hasNode());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<DataNode> linkedList0 = new LinkedList<DataNode>();
      DataPath dataPath0 = new DataPath("rules");
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(linkedList0, dataPath0);
      int int0 = multiLevelHandle0.totalNodes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      assertFalse(multiLevelHandle0.hasNode());
      
      boolean boolean0 = multiLevelHandle0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataGroupNode dataGroupNode1 = new DataGroupNode();
      dataGroupNode0.addNode((DataNode) dataGroupNode1, false);
      DataGroupNode dataGroupNode2 = dataGroupNode0.addNodeRaw(dataGroupNode0);
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode2, "");
      boolean boolean0 = multiLevelHandle0.nextNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "P/Y%N70w ^K+:");
      multiLevelHandle0.resetNode();
      assertFalse(multiLevelHandle0.hasNode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      DataValueNode dataValueNode0 = multiLevelHandle0.getValueNode((String) null);
      assertNull(dataValueNode0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, ",/'Uz");
      DataValueNode dataValueNode0 = multiLevelHandle0.getValueNode(",/'Uz");
      assertNull(dataValueNode0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "P/Y%N70w ^K+:");
      List<DataNode> list0 = multiLevelHandle0.getDataNodes("P/Y%N70w ^K+:");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      List<DataNode> list0 = multiLevelHandle0.getDataNodes((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode("P");
      DataPredicate dataPredicate0 = new DataPredicate("P");
      List<DataNode> list0 = dataGroupNode0.getChildNodes("|mc&P", dataPredicate0);
      DataPath dataPath0 = new DataPath("IDSI/Tv[a7So>P");
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(list0, dataPath0);
      assertFalse(multiLevelHandle0.hasOpenTransaction());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      DataValueNode dataValueNode0 = multiLevelHandle0.getValueNode("");
      assertNull(dataValueNode0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      List<DataNode> list0 = multiLevelHandle0.getDataNodes("");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiLevelHandle multiLevelHandle0 = null;
      try {
        multiLevelHandle0 = new MultiLevelHandle((List<DataNode>) null, (DataPath) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiLevelHandle multiLevelHandle0 = null;
      try {
        multiLevelHandle0 = new MultiLevelHandle((DataNode) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, ",/8P");
      multiLevelHandle0.index = 1548;
      // Undeclared exception!
      try { 
        multiLevelHandle0.getDataNodes("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1548
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, ",/Gz]");
      multiLevelHandle0.index = 13;
      // Undeclared exception!
      try { 
        multiLevelHandle0.getValueNode("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataGroupNode dataGroupNode1 = dataGroupNode0.addNodeRaw(dataGroupNode0);
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode1, "");
      multiLevelHandle0.subHandle = null;
      // Undeclared exception!
      try { 
        multiLevelHandle0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      List<DataNode> list0 = dataGroupNode0.childNodes;
      DataPath dataPath0 = new DataPath("");
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(list0, dataPath0);
      // Undeclared exception!
      try { 
        multiLevelHandle0.resetNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      // Undeclared exception!
      try { 
        multiLevelHandle0.totalNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataGroupNode dataGroupNode1 = new DataGroupNode();
      dataGroupNode0.addNode((DataNode) dataGroupNode1, false);
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      List<DataNode> list0 = multiLevelHandle0.getDataNodes("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataValueNode dataValueNode0 = new DataValueNode("", dataGroupNode0);
      dataGroupNode0.addNode((DataNode) dataValueNode0, false);
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "");
      DataValueNode dataValueNode1 = multiLevelHandle0.getValueNode("");
      assertNotNull(dataValueNode1);
      assertTrue(multiLevelHandle0.hasNode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      MultiLevelHandle multiLevelHandle0 = new MultiLevelHandle(dataGroupNode0, "y^&");
      multiLevelHandle0.index = 1;
      boolean boolean0 = multiLevelHandle0.nextNode();
      assertFalse(multiLevelHandle0.hasNode());
      assertFalse(boolean0);
  }
}
