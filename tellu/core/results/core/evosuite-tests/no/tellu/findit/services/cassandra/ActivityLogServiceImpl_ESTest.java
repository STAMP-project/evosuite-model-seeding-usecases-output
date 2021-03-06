/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 08:37:32 GMT 2019
 */

package no.tellu.findit.services.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import no.tellu.findit.services.cassandra.ActivityLogItem;
import no.tellu.findit.services.cassandra.ActivityLogKey;
import no.tellu.findit.services.cassandra.ActivityLogServiceImpl;
import no.tellu.findit.util.TinyDomainObject;
import org.evosuite.runtime.mock.java.util.MockDate;

public class ActivityLogServiceImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      boolean boolean0 = activityLogServiceImpl0.isConfigured();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      ActivityLogKey activityLogKey0 = ActivityLogKey.ASSET_TAG_ADDED;
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log((Long) null, (Long) null, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, activityLogKey0, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      activityLogServiceImpl0.setTTL((Long) null);
      assertFalse(activityLogServiceImpl0.isConfigured());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      linkedList0.offerLast((TinyDomainObject) null);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log((Long) null, (Long) null, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      String[] stringArray0 = new String[30];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log((Long) null, (Long) null, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, hashMap0, (String) null, stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      String[] stringArray0 = new String[7];
      Long long0 = new Long((-921L));
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log((Long) null, long0, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, (String) null, stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      MockDate mockDate0 = new MockDate();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      List<ActivityLogItem> list0 = activityLogServiceImpl0.getActivityLogs((Long) null, (Long) null, (Date) mockDate0, (Date) mockDate0, (String) null, (Map<String, String>) hashMap0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      MockDate mockDate0 = new MockDate();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      List<ActivityLogItem> list0 = activityLogServiceImpl0.getActivityLogs((Long) null, (Long) null, (Date) mockDate0, (Date) mockDate0, (String) null, (Long) null, (String) null, (Long) null, (String) null, (Map<String, String>) hashMap0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      activityLogServiceImpl0.createEventTable((String) null);
      assertFalse(activityLogServiceImpl0.isConfigured());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      activityLogServiceImpl0.clearKeyspace();
      assertFalse(activityLogServiceImpl0.isConfigured());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      Class<Object> class0 = Object.class;
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, (Long) null, "'", "'");
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log((Long) 175L, (Long) null, tinyDomainObject0, tinyDomainObject0, (List<TinyDomainObject>) linkedList0, hashMap0, "customer", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      Long long0 = new Long(1L);
      Class<Integer> class0 = Integer.class;
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, long0, (String) null, (String) null);
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log(long0, long0, tinyDomainObject0, tinyDomainObject0, (List<TinyDomainObject>) linkedList0, hashMap0, "", stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown object type: java.lang.Integer
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      Long long0 = new Long(1958L);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String[] stringArray0 = new String[5];
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log(long0, long0, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) null, hashMap0, "ZOTT_-TbN0G;", stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      Class<ActivityLogItem> class0 = ActivityLogItem.class;
      Long long0 = new Long(1L);
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, long0, (String) null, "e5ZqKR-MxmR");
      linkedList0.offerLast(tinyDomainObject0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log(long0, long0, tinyDomainObject0, tinyDomainObject0, (List<TinyDomainObject>) linkedList0, hashMap0, "@r", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      String[] stringArray0 = new String[1];
      Long long0 = new Long(139L);
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log(long0, (Long) 175L, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, (HashMap<String, String>) null, "", stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      Long long0 = new Long((-705L));
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      String[] stringArray0 = new String[3];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log((Long) null, long0, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, hashMap0, "Z ,&UE", stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log((Long) null, (Long) null, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, hashMap0, "`WPhk=NNB+", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      activityLogServiceImpl0.configure("lD", "lD", "c_id bigint,", (-8358));
      assertTrue(activityLogServiceImpl0.isConfigured());
      
      ActivityLogServiceImpl activityLogServiceImpl1 = ActivityLogServiceImpl.getInstance();
      assertTrue(activityLogServiceImpl1.isConfigured());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      activityLogServiceImpl0.configure("-fwy@Eg]!#zA!S", "-fwy@Eg]!#zA!S", "", 1475);
      boolean boolean0 = activityLogServiceImpl0.isConfigured();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = new ActivityLogServiceImpl();
      String[] stringArray0 = new String[15];
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      ActivityLogKey activityLogKey0 = ActivityLogKey.EVENT_RAISE;
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log((Long) null, (Long) null, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, activityLogKey0, stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      Long long0 = new Long((-877L));
      Class<ActivityLogItem> class0 = ActivityLogItem.class;
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, long0, (String) null, "(%aX<>Hx~+`>a'|(r");
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      String[] stringArray0 = new String[0];
      Class<Object> class1 = Object.class;
      TinyDomainObject tinyDomainObject1 = new TinyDomainObject(class1, long0, " ALLOW FILTERING;", " ALLOW FILTERING;");
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log(long0, long0, tinyDomainObject1, tinyDomainObject0, (List<TinyDomainObject>) linkedList0, "(.\".fu", stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown object type: java.lang.Object
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      Long long0 = new Long((-705L));
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      ActivityLogKey activityLogKey0 = ActivityLogKey.DEVICE_COMMAND_FAILED;
      String[] stringArray0 = new String[3];
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log((Long) (-705L), long0, (TinyDomainObject) null, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, activityLogKey0, stringArray0);
      assertNull(activityLogItem0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      Long long0 = new Long(3610L);
      Class<Object> class0 = Object.class;
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, long0, " ALLOW FILTERING;", "");
      TinyDomainObject tinyDomainObject1 = new TinyDomainObject(class0, long0, " ALLOW FILTERING;", " ALLOW FILTERING;");
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      ActivityLogKey activityLogKey0 = ActivityLogKey.RULE_TRIGGERED;
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        activityLogServiceImpl0.log(long0, long0, tinyDomainObject1, tinyDomainObject0, (List<TinyDomainObject>) linkedList0, activityLogKey0, stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unknown object type: java.lang.Object
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ActivityLogServiceImpl activityLogServiceImpl0 = ActivityLogServiceImpl.getInstance();
      LinkedList<TinyDomainObject> linkedList0 = new LinkedList<TinyDomainObject>();
      Long long0 = new Long((-9223372036854775808L));
      Class<ActivityLogItem> class0 = ActivityLogItem.class;
      TinyDomainObject tinyDomainObject0 = new TinyDomainObject(class0, long0, "", "");
      String[] stringArray0 = new String[5];
      ActivityLogItem activityLogItem0 = activityLogServiceImpl0.log(long0, long0, tinyDomainObject0, (TinyDomainObject) null, (List<TinyDomainObject>) linkedList0, "", stringArray0);
      assertNull(activityLogItem0);
  }
}
