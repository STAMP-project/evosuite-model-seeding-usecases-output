/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 08:33:04 GMT 2019
 */

package no.tellu.findit.services.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.nio.charset.Charset;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import no.tellu.findit.services.cassandra.ActivityLogItem;
import no.tellu.findit.services.cassandra.ActivityLogItemType;
import no.tellu.findit.services.cassandra.HierarchyLevel;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockUUID;

public class ActivityLogItem_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.getHierarchyLevel();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      String string0 = activityLogItem0.getSourceType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = activityLogItem0.getProviderId();
      MockDate mockDate0 = new MockDate(72, 72, 72);
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.INFO;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.PROVIDER;
      Long long1 = Long.valueOf(1L);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ActivityLogItem activityLogItem1 = new ActivityLogItem((String) null, (Long) null, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long1, "1", long0, (String) null, "no.tellu.findit.services.cassandra.ActivityLogItemType", (String) null, linkedList0);
      Long long2 = activityLogItem1.getSourceId();
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItemType", activityLogItem1.getData());
      assertNotNull(long2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.getLogType();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      String string0 = activityLogItem0.getData();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      String string0 = activityLogItem0.getAdditionalData();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long((-1L));
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.INFO;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.UNKNOWN;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, (Date) null, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "", "", linkedList0);
      List<String> list0 = activityLogItem0.getArgs();
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      String string0 = activityLogItem0.getMessageKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setObjectType("no.tellu.findit.services.cassandra.ActivityLogItem");
      assertNull(activityLogItem0.getCustomerId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      UUID uUID0 = activityLogItem0.getUuid();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setLogType("Bg\"Ft7/m");
      assertNull(activityLogItem0.getAdditionalData());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Date date0 = activityLogItem0.getTimestamp();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      activityLogItem0.setTimestamp(date0);
      assertNull(activityLogItem0.getHierarchyLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setSourceType(".backup");
      assertNull(activityLogItem0.getCustomerId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setAdditionalData(".app.log");
      String string0 = activityLogItem0.getAdditionalData();
      assertEquals(".app.log", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long((-1L));
      activityLogItem0.setSourceId(long0);
      Long long1 = activityLogItem0.getSourceId();
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      activityLogItem0.setLogType(activityLogItemType0);
      assertNull(activityLogItem0.getProviderId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = activityLogItem0.getObjectId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      String string0 = activityLogItem0.getObjectType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = activityLogItem0.getCustomerId();
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      MockDate mockDate0 = new MockDate();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ActivityLogItem activityLogItem1 = new ActivityLogItem("l;d\"rsIwUMEHN", (Long) null, (Long) null, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", (Long) (-1060L), "", "-sBD3PR_tp{-E", (String) null, linkedList0);
      Long long1 = activityLogItem1.getObjectId();
      assertNotNull(long1);
      assertEquals("", activityLogItem1.getObjectType());
      assertEquals("-sBD3PR_tp{-E", activityLogItem1.getData());
      assertEquals("", activityLogItem1.getSourceType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = activityLogItem0.getSourceId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setAdditionalData("");
      String string0 = activityLogItem0.getAdditionalData();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      activityLogItem0.setArgs(list0);
      List<String> list1 = activityLogItem0.getArgs();
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(986, 986, 986, 0, 986, 0);
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.UNKNOWN;
      Long long0 = new Long((-1L));
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", (Long) null, (Long) null, mockDate0, activityLogItemType0, hierarchyLevel0, (Long) (-1L), "", long0, "", "W@GShv", "", linkedList0);
      linkedList0.offerLast("no.tellu.findit.services.cassandra.ActivityLogItem");
      List<String> list0 = activityLogItem0.getArgs();
      assertEquals("W@GShv", activityLogItem0.getData());
      assertEquals("", activityLogItem0.getAdditionalData());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      List<String> list0 = activityLogItem0.getArgs();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = Long.valueOf((-134L));
      activityLogItem0.customerId = long0;
      Long long1 = activityLogItem0.getCustomerId();
      assertEquals((-134L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setCustomerId((Long) 2351L);
      Long long0 = activityLogItem0.getCustomerId();
      assertEquals(2351L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long(0L);
      activityLogItem0.setCustomerId(long0);
      Long long1 = activityLogItem0.getCustomerId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setData("");
      String string0 = activityLogItem0.getData();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Long long0 = new Long(0L);
      MockDate mockDate0 = new MockDate();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, locale_FilteringMode0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "no.tellu.findit.services.cassandra.ActivityLogItem", "", list0);
      String string0 = activityLogItem0.getData();
      assertNotNull(string0);
      assertEquals("", activityLogItem0.getAdditionalData());
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItem", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.CUSTOMER;
      activityLogItem0.setHierarchyLevel(hierarchyLevel0);
      HierarchyLevel hierarchyLevel1 = activityLogItem0.getHierarchyLevel();
      assertEquals(HierarchyLevel.CUSTOMER, hierarchyLevel1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setLogType((String) null);
      ActivityLogItemType activityLogItemType0 = activityLogItem0.getLogType();
      assertEquals("info", activityLogItemType0.getKey());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Long long0 = new Long(0L);
      MockDate mockDate0 = new MockDate();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, locale_FilteringMode0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "no.tellu.findit.services.cassandra.ActivityLogItem", "", list0);
      String string0 = activityLogItem0.getMessageKey();
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItem", activityLogItem0.getData());
      assertEquals("", string0);
      assertEquals("", activityLogItem0.getAdditionalData());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setMessageKey("l;d\"rsIwUMEHN");
      String string0 = activityLogItem0.getMessageKey();
      assertEquals("l;d\"rsIwUMEHN", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = Long.valueOf(3004L);
      activityLogItem0.setObjectId(long0);
      Long long1 = activityLogItem0.getObjectId();
      assertEquals(3004L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Long long0 = new Long(0L);
      MockDate mockDate0 = new MockDate();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, locale_FilteringMode0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "no.tellu.findit.services.cassandra.ActivityLogItem", "", list0);
      Long long1 = activityLogItem0.getObjectId();
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItem", activityLogItem0.getData());
      assertNotNull(long1);
      assertEquals("", activityLogItem0.getAdditionalData());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Long long0 = new Long(0L);
      MockDate mockDate0 = new MockDate();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, locale_FilteringMode0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "no.tellu.findit.services.cassandra.ActivityLogItem", "", list0);
      String string0 = activityLogItem0.getObjectType();
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItem", activityLogItem0.getData());
      assertEquals("", activityLogItem0.getAdditionalData());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Long long0 = Long.valueOf(1L);
      MockDate mockDate0 = new MockDate((-4042), (-4042), (-4042));
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.INFO;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.UNKNOWN;
      ActivityLogItem activityLogItem0 = new ActivityLogItem((String) null, long0, (Long) null, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "(iKh>]20OOs~", long0, "}Q", "}Q", "1ClYtUHfWyR 0gR", (List<String>) null);
      String string0 = activityLogItem0.getObjectType();
      assertEquals("}Q", string0);
      assertNotNull(string0);
      assertEquals("1ClYtUHfWyR 0gR", activityLogItem0.getAdditionalData());
      assertEquals("}Q", activityLogItem0.getData());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long((-309L));
      activityLogItem0.setProviderId(long0);
      Long long1 = activityLogItem0.getProviderId();
      assertEquals((-309L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long(1772L);
      activityLogItem0.setProviderId(long0);
      Long long1 = activityLogItem0.getProviderId();
      assertEquals(1772L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long(0L);
      activityLogItem0.setProviderId(long0);
      Long long1 = activityLogItem0.getProviderId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = new Long(0L);
      activityLogItem0.setSourceId(long0);
      Long long1 = activityLogItem0.getSourceId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(986, 986, 986, 0, 986, 0);
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.UNKNOWN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", (Long) null, (Long) null, mockDate0, activityLogItemType0, hierarchyLevel0, (Long) null, "", (Long) null, "", "", "", list0);
      String string0 = activityLogItem0.getSourceType();
      assertFalse(set0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      Long long0 = activityLogItem0.getProviderId();
      MockDate mockDate0 = new MockDate(72, 72, 72);
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.INFO;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.PROVIDER;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ActivityLogItem activityLogItem1 = new ActivityLogItem((String) null, (Long) null, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "1", long0, (String) null, "no.tellu.findit.services.cassandra.ActivityLogItemType", (String) null, linkedList0);
      String string0 = activityLogItem1.getSourceType();
      assertNotNull(string0);
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItemType", activityLogItem1.getData());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Long long0 = new Long(0L);
      MockDate mockDate0 = new MockDate();
      ActivityLogItemType activityLogItemType0 = ActivityLogItemType.WARNING;
      HierarchyLevel hierarchyLevel0 = HierarchyLevel.OWNER;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0, locale_FilteringMode0);
      ActivityLogItem activityLogItem0 = new ActivityLogItem("", long0, long0, mockDate0, activityLogItemType0, hierarchyLevel0, long0, "", long0, "", "no.tellu.findit.services.cassandra.ActivityLogItem", "", list0);
      Date date0 = activityLogItem0.getTimestamp();
      assertSame(date0, mockDate0);
      assertEquals("no.tellu.findit.services.cassandra.ActivityLogItem", activityLogItem0.getData());
      assertNotNull(date0);
      assertEquals("", activityLogItem0.getAdditionalData());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      UUID uUID0 = MockUUID.randomUUID();
      activityLogItem0.setUuid(uUID0);
      UUID uUID1 = activityLogItem0.getUuid();
      assertEquals(16793600L, uUID1.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Random.setNextRandom(1692);
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      UUID uUID0 = MockUUID.randomUUID();
      activityLogItem0.setUuid(uUID0);
      UUID uUID1 = activityLogItem0.getUuid();
      assertEquals((-7059955363188703232L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ActivityLogItem activityLogItem0 = new ActivityLogItem();
      activityLogItem0.setHierarchyLevel("");
      assertNull(activityLogItem0.getProviderId());
  }
}