/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:30:20 GMT 2019
 */

package org.ow2.proactive.catalog.util.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.List;
import org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity;
import org.ow2.proactive.catalog.util.parser.ScriptParser;

public class ScriptParser_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptParser scriptParser0 = new ScriptParser();
      List<KeyValueLabelMetadataEntity> list0 = scriptParser0.getMetadataKeyValues((InputStream) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptParser scriptParser0 = new ScriptParser();
      String string0 = scriptParser0.getIconPath((List<KeyValueLabelMetadataEntity>) null);
      assertEquals("/automation-dashboard/styles/patterns/img/objects-icons/script_icon.png", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptParser scriptParser0 = new ScriptParser();
      boolean boolean0 = scriptParser0.isMyKind("General");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptParser scriptParser0 = new ScriptParser();
      // Undeclared exception!
      try { 
        scriptParser0.isMyKind((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScriptParser scriptParser0 = new ScriptParser();
      boolean boolean0 = scriptParser0.isMyKind("script/`qmq)tyclyt");
      assertTrue(boolean0);
  }
}