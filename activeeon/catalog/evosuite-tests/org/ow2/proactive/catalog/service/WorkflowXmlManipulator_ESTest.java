/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:52:02 GMT 2019
 */

package org.ow2.proactive.catalog.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.ow2.proactive.catalog.service.WorkflowXmlManipulator;

public class WorkflowXmlManipulator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorkflowXmlManipulator workflowXmlManipulator0 = new WorkflowXmlManipulator();
      byte[] byteArray0 = new byte[8];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        workflowXmlManipulator0.replaceGenericInformationJobLevel(byteArray0, hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // It was not possible to parse an object: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorkflowXmlManipulator workflowXmlManipulator0 = new WorkflowXmlManipulator();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      byte[] byteArray0 = workflowXmlManipulator0.replaceGenericInformationJobLevel((byte[]) null, map0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorkflowXmlManipulator workflowXmlManipulator0 = new WorkflowXmlManipulator();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = workflowXmlManipulator0.replaceGenericInformationJobLevel(byteArray0, (Map<String, String>) null);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }
}
