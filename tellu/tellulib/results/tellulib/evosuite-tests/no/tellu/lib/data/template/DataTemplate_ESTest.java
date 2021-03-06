/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 24 10:42:52 GMT 2019
 */

package no.tellu.lib.data.template;

import org.junit.Test;
import static org.junit.Assert.*;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataValueNode;
import no.tellu.lib.data.MetaGroupNode;
import no.tellu.lib.data.template.DataTemplate;
import no.tellu.lib.data.template.Substituter;

public class DataTemplate_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "$DATA");
      boolean boolean0 = dataTemplate0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataValueNode dataValueNode0 = new DataValueNode("");
      DataGroupNode dataGroupNode1 = dataGroupNode0.addNodeRaw(dataValueNode0);
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode1, "");
      assertTrue(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataValueNode dataValueNode0 = new DataValueNode("", dataGroupNode0);
      DataGroupNode dataGroupNode1 = dataGroupNode0.addNodeRaw(dataValueNode0);
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode1, "");
      assertTrue(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataTemplate dataTemplate0 = null;
      try {
        dataTemplate0 = new DataTemplate((DataGroupNode) null, (DataGroupNode) null, "2U4{>%=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, (DataGroupNode) null, "");
      int int0 = dataTemplate0.totalNodes();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "9O\">py");
      // Undeclared exception!
      try { 
        dataTemplate0.totalNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, (DataGroupNode) null, "");
      boolean boolean0 = dataTemplate0.nextNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, (DataGroupNode) null, "");
      dataTemplate0.resetNode();
      assertTrue(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "$DATA0*u ");
      dataTemplate0.resetNode();
      assertFalse(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, (DataGroupNode) null, "");
      dataTemplate0.resetSubstituters();
      assertEquals("", dataTemplate0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      dataTemplate0.resetSubstituters();
      assertFalse(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "$DATA");
      // Undeclared exception!
      try { 
        dataTemplate0.substituterFactory("$INCR", "$DATETIME$INCR");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "9O\">py");
      Substituter substituter0 = dataTemplate0.substituterFactory("$UUID", "a/ |?d.ggg2/e");
      assertNotNull(substituter0);
      assertFalse(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      // Undeclared exception!
      try { 
        dataTemplate0.substituterFactory("$DATETIME$INCR", "no.tellu.lib.data.template.DataTemplate");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'I'
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "9O\">py");
      Substituter substituter0 = dataTemplate0.substituterFactory("", "");
      assertNull(substituter0);
      assertFalse(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      dataGroupNode0.addNodeRaw(dataGroupNode0);
      DataTemplate dataTemplate0 = null;
      try {
        dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetaGroupNode metaGroupNode0 = new MetaGroupNode("$DATA\"f", (-6167), false, false);
      DataGroupNode dataGroupNode0 = metaGroupNode0.createData(true);
      DataGroupNode dataGroupNode1 = new DataGroupNode("$DATA\"f");
      DataGroupNode dataGroupNode2 = dataGroupNode0.addNodeRaw(dataGroupNode1);
      DataTemplate dataTemplate0 = null;
      try {
        dataTemplate0 = new DataTemplate(dataGroupNode2, dataGroupNode0, "$DATA\"f");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only nodes named by meta-data are allowed
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      dataGroupNode0.addNodeRaw((DataNode) null);
      // Undeclared exception!
      try { 
        dataTemplate0.resetSubstituters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      dataGroupNode0.addNodeRaw(dataGroupNode0);
      // Undeclared exception!
      try { 
        dataTemplate0.resetSubstituters();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      DataGroupNode dataGroupNode1 = new DataGroupNode();
      dataGroupNode0.addNode((DataNode) dataGroupNode1, true);
      dataGroupNode0.addNodeRaw(dataGroupNode0);
      // Undeclared exception!
      dataTemplate0.resetSubstituters();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      // Undeclared exception!
      try { 
        dataTemplate0.substituterFactory((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "$INCR\"");
      // Undeclared exception!
      try { 
        dataTemplate0.substituterFactory("$INCR\"", "$INCR\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "%SyhO]QjH/[Ip");
      dataTemplate0.totalNodes();
      assertFalse(dataTemplate0.hasNode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataGroupNode dataGroupNode0 = new DataGroupNode();
      DataTemplate dataTemplate0 = new DataTemplate(dataGroupNode0, dataGroupNode0, "");
      Substituter substituter0 = dataTemplate0.substituterFactory("$DATA<INCY", "");
      assertNotNull(substituter0);
      assertFalse(dataTemplate0.hasNode());
  }
}
