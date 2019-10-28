/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 08:11:30 GMT 2019
 */

package no.tellu.findit.services;

import org.junit.Test;
import static org.junit.Assert.*;
import no.tellu.findit.services.AsyncServiceImpl;
import org.evosuite.runtime.mock.java.lang.MockThread;

public class AsyncServiceImpl_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      asyncServiceImpl0.shutdown();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      try { 
        asyncServiceImpl0.clone();
        fail("Expecting exception: CloneNotSupportedException");
      
      } catch(CloneNotSupportedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      // Undeclared exception!
      try { 
        asyncServiceImpl0.execute((Runnable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      // Undeclared exception!
      try { 
        asyncServiceImpl0.executeUnique((Runnable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      MockThread mockThread0 = new MockThread("VUz:2JFcD[=VH`Ws.F\"");
      asyncServiceImpl0.execute(mockThread0);
      assertFalse(mockThread0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncServiceImpl asyncServiceImpl0 = AsyncServiceImpl.getInstance();
      MockThread mockThread0 = new MockThread();
      asyncServiceImpl0.executeUnique(mockThread0);
  }
}