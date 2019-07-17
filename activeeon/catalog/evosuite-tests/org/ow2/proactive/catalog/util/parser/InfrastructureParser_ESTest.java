/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:33:57 GMT 2019
 */

package org.ow2.proactive.catalog.util.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity;
import org.ow2.proactive.catalog.util.parser.InfrastructureParser;

public class InfrastructureParser_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InfrastructureParser infrastructureParser0 = new InfrastructureParser();
      boolean boolean0 = infrastructureParser0.isMyKind("infrastructurenodesource-glf;yoa^mpetm$;a");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InfrastructureParser infrastructureParser0 = new InfrastructureParser();
      LinkedList<KeyValueLabelMetadataEntity> linkedList0 = new LinkedList<KeyValueLabelMetadataEntity>();
      String string0 = infrastructureParser0.getIconPath(linkedList0);
      assertEquals("/automation-dashboard/styles/patterns/img/objects-icons/node_source_infrastructure_icon.png", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InfrastructureParser infrastructureParser0 = new InfrastructureParser();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      List<KeyValueLabelMetadataEntity> list0 = infrastructureParser0.getMetadataKeyValues(pushbackInputStream0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InfrastructureParser infrastructureParser0 = new InfrastructureParser();
      // Undeclared exception!
      try { 
        infrastructureParser0.isMyKind((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InfrastructureParser infrastructureParser0 = new InfrastructureParser();
      boolean boolean0 = infrastructureParser0.isMyKind("");
      assertFalse(boolean0);
  }
}