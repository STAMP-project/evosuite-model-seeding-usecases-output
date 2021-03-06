/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 21 07:30:49 GMT 2019
 */

package no.tellu.findit.services;

import org.junit.Test;
import static org.junit.Assert.*;
import no.tellu.findit.cmd.CommandHandler;
import no.tellu.findit.cmd.hibernate.CommandHandlerImpl;
import no.tellu.findit.services.BillingLogServiceImpl;

public class BillingLogServiceImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logCustomerSelectDomain((Long) null, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logCustomerSelectCSS((Long) null, "!KO*&s8gb");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logCustomerSelectCSS((Long) null, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logCustomerSelectDomain((Long) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logCustomerSelectFeatures((Long) null, "i]VqLr~e$Fv0@x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logCustomerSelectFeatures((Long) null, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logDeviceStart((Long) null, "R3L%a0Q/", "R3L%a0Q/");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logDeviceStop((Long) null, "Y)}^7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logDeviceStop((Long) null, "Y)}^_7");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logEmailSent((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logEmailSent((Long) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logMessageReceived(" _FrL<l\"bPYZjv");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logMessageReceived((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logProviderMapProvider((Long) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logProviderMapProvider((Long) null, "D.XW?OJgm");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logProviderSelectCSS((Long) null, "!HjZNHuH?4\"f~Ezy(");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logProviderSelectDomain((Long) null, "no.tellu.findit.cmd.FindLocationsByCustomerCmd");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logProviderSelectDomain((Long) null, "1SEwV{Nh_ar n)(");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logProviderSelectFeatures((Long) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logProviderSelectFeatures((Long) null, "ErrorplogDeviceStop");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logSelectMapProvider((Long) null, "@,Voc't&ObIUuYZst(I");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.commandHandler = (CommandHandler) commandHandlerImpl0;
      try { 
        billingLogServiceImpl0.logSelectMapProvider((Long) null, "Error logProviderSelectFeatures");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logSmsSent((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      CommandHandlerImpl commandHandlerImpl0 = new CommandHandlerImpl();
      billingLogServiceImpl0.setCommandHandler(commandHandlerImpl0);
      try { 
        billingLogServiceImpl0.logSmsSent((Long) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Logging failed
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BillingLogServiceImpl billingLogServiceImpl0 = new BillingLogServiceImpl();
      // Undeclared exception!
      try { 
        billingLogServiceImpl0.logDeviceStart((Long) null, "eL~Qm9 zC^F7zL{*`H=", "OPENSTREETMAP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
