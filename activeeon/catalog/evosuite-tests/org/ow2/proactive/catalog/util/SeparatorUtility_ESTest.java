/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:43:14 GMT 2019
 */

package org.ow2.proactive.catalog.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.ow2.proactive.catalog.util.SeparatorUtility;

public class SeparatorUtility_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SeparatorUtility separatorUtility0 = new SeparatorUtility();
      // Undeclared exception!
      try { 
        separatorUtility0.getConcatWithSeparator((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SeparatorUtility separatorUtility0 = new SeparatorUtility();
      List<String> list0 = separatorUtility0.getSplitBySeparator("C");
      assertTrue(list0.contains("C"));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SeparatorUtility separatorUtility0 = new SeparatorUtility();
      // Undeclared exception!
      try { 
        separatorUtility0.getSplitBySeparator((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SeparatorUtility separatorUtility0 = new SeparatorUtility();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      String string0 = separatorUtility0.getConcatWithSeparator(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SeparatorUtility separatorUtility0 = new SeparatorUtility();
      String[] stringArray0 = new String[9];
      String string0 = separatorUtility0.getConcatWithSeparator(stringArray0);
      assertEquals("null/null/null/null/null/null/null/null/null", string0);
  }
}