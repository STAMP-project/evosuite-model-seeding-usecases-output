/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 15:18:36 GMT 2019
 */

package org.ow2.proactive.catalog.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.evosuite.runtime.javaee.injection.Injector;
import org.ow2.proactive.catalog.service.GenericInformationAdder;
import org.ow2.proactive.catalog.service.WorkflowXmlManipulator;

public class GenericInformationAdder_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenericInformationAdder genericInformationAdder0 = new GenericInformationAdder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = genericInformationAdder0.addGenericInformationToRawObjectIfWorkflow((byte[]) null, (String) null, hashMap0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenericInformationAdder genericInformationAdder0 = new GenericInformationAdder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        genericInformationAdder0.addGenericInformationToRawObjectIfWorkflow((byte[]) null, "workflowworkflowf^", hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenericInformationAdder genericInformationAdder0 = new GenericInformationAdder();
      WorkflowXmlManipulator workflowXmlManipulator0 = new WorkflowXmlManipulator();
      Injector.inject(genericInformationAdder0, (Class<?>) GenericInformationAdder.class, "workflowXmlManipulator", (Object) workflowXmlManipulator0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = genericInformationAdder0.addGenericInformationToRawObjectIfWorkflow((byte[]) null, "workflowglobalspace", hashMap0);
      // Undeclared exception!
      try { 
        genericInformationAdder0.addGenericInformationToRawObjectIfWorkflow(byteArray0, "workflowglobalspace", hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // It was not possible to parse an object: org.xml.sax.SAXParseException; Premature end of file.
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenericInformationAdder genericInformationAdder0 = new GenericInformationAdder();
      WorkflowXmlManipulator workflowXmlManipulator0 = new WorkflowXmlManipulator();
      Injector.inject(genericInformationAdder0, (Class<?>) GenericInformationAdder.class, "workflowXmlManipulator", (Object) workflowXmlManipulator0);
      Injector.validateBean(genericInformationAdder0, (Class<?>) GenericInformationAdder.class);
      byte[] byteArray0 = new byte[2];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray1 = genericInformationAdder0.addGenericInformationToRawObjectIfWorkflow(byteArray0, "|a", hashMap0);
      assertEquals(2, byteArray1.length);
  }
}
