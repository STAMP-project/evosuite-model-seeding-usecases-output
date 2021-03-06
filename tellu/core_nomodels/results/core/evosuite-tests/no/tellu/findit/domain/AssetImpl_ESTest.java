/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 21 08:22:31 GMT 2019
 */

package no.tellu.findit.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import no.tellu.findit.domain.AssetGroup;
import no.tellu.findit.domain.AssetGroupImpl;
import no.tellu.findit.domain.AssetImpl;
import no.tellu.findit.domain.AssetProperty;
import no.tellu.findit.domain.AssetPropertyImpl;
import no.tellu.findit.domain.AssetTypeImpl;
import no.tellu.findit.domain.AssetVariable;
import no.tellu.findit.domain.CustomerImpl;
import no.tellu.findit.domain.PositionImpl;
import no.tellu.findit.domain.RuleImpl;
import no.tellu.findit.domain.ServiceProviderImpl;
import no.tellu.findit.domain.ShareLevel;
import no.tellu.findit.domain.Tracking;

public class AssetImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getExcludeFromRuleEngine();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tracking tracking0 = Tracking.NEVER;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, true, true, tracking0);
      assetImpl0.getGroups();
      assertTrue(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertTrue(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getExternalId();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getInsideZones();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(1278L);
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, true, false, tracking0);
      assetImpl0.setTracking(tracking0);
      assertFalse(assetImpl0.isPositioned());
      assertTrue(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long(1278L);
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, true, false, tracking0);
      boolean boolean0 = assetImpl0.isPositioned();
      assertTrue(assetImpl0.isTracked());
      assertFalse(boolean0);
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getTracking();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setImageAddress("");
      assetImpl0.getImageAddress();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      ShareLevel shareLevel0 = ShareLevel.PUBLIC;
      assetImpl0.setShareLevel(shareLevel0);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      String string0 = assetImpl0.getTypeCode();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertEquals("asset", string0);
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getType();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, false, true, tracking0);
      assetImpl0.setGroups((Set<AssetGroup>) null);
      assetImpl0.getGroups();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertTrue(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assertFalse(assetImpl0.isDeleted());
      
      assetImpl0.setDeleted(true);
      boolean boolean0 = assetImpl0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getImageReference();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      boolean boolean0 = assetImpl0.isDeleted();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(boolean0);
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getOwner();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assertFalse(assetImpl0.isPositioned());
      
      assetImpl0.setPositioned(true);
      boolean boolean0 = assetImpl0.isPositioned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long((-3366L));
      assetImpl0.setImageReference(long0);
      Long long1 = assetImpl0.getImageReference();
      assertNotNull(long1);
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      List<AssetVariable> list0 = assetImpl0.getStoredVariables();
      assetImpl0.setStoredVariables(list0);
      assetImpl0.getStoredVariables();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setStoredTagsString("S@yO{");
      assetImpl0.getStoredTagsString();
      assertEquals("S@yO{", assetImpl0.getStoredTagsString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getAssetProperties();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getImageAddress();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Tracking tracking0 = Tracking.NEVER;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, true, true, tracking0);
      ServiceProviderImpl serviceProviderImpl0 = new ServiceProviderImpl();
      Boolean boolean0 = serviceProviderImpl0.getUsePublicResourcesByDefault();
      assetImpl0.setExcludeFromRuleEngine(boolean0);
      assetImpl0.getExcludeFromRuleEngine();
      assertTrue(assetImpl0.isPositioned());
      assertTrue(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long((-1L));
      CustomerImpl customerImpl0 = new CustomerImpl(long0, "", (Date) null, (Date) null);
      assetImpl0.setOwner(customerImpl0);
      assetImpl0.getOwner();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setTracked(false);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Map<String, String> map0 = assetImpl0.getDeprecatedTypeProperties();
      assetImpl0.setDeprecatedTypeProperties(map0);
      assetImpl0.getDeprecatedTypeProperties();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getShareLevel();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Long long0 = new Long(1931L);
      AssetImpl assetImpl0 = new AssetImpl(long0);
      LinkedHashSet<AssetProperty> linkedHashSet0 = new LinkedHashSet<AssetProperty>();
      AssetPropertyImpl assetPropertyImpl0 = new AssetPropertyImpl();
      linkedHashSet0.add(assetPropertyImpl0);
      assetImpl0.setAssetProperties(linkedHashSet0);
      Map<String, String> map0 = assetImpl0.getAssetPropertiesSimplified();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      AssetPropertyImpl assetPropertyImpl0 = new AssetPropertyImpl();
      boolean boolean0 = assetImpl0.equals(assetPropertyImpl0);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(boolean0);
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      boolean boolean0 = assetImpl0.equals(assetImpl0);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertTrue(boolean0);
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long(47L);
      Tracking tracking0 = Tracking.ALWAYS;
      AssetImpl assetImpl1 = new AssetImpl(long0, true, true, tracking0);
      boolean boolean0 = assetImpl1.equals(assetImpl0);
      assertFalse(assetImpl0.isDeleted());
      assertTrue(assetImpl1.isPositioned());
      assertFalse(boolean0);
      assertTrue(assetImpl1.isTracked());
      assertFalse(assetImpl1.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long(1247L);
      AssetImpl assetImpl1 = new AssetImpl(long0);
      boolean boolean0 = assetImpl0.equals(assetImpl1);
      assertFalse(boolean0);
      assertFalse(assetImpl1.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl1.isTracked());
      assertFalse(assetImpl1.equals((Object)assetImpl0));
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl1.isPositioned());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Long long0 = new Long(1278L);
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, true, false, tracking0);
      assetImpl0.hashCode();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertTrue(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("id", assetImpl0);
      HashMap<Long, Map<String, Object>> hashMap1 = new HashMap<Long, Map<String, Object>>();
      Long long0 = new Long(113);
      hashMap1.put(long0, hashMap0);
      assetImpl0.setInsideZonesFull(hashMap1);
      assertEquals(1, hashMap1.size());
      
      assetImpl0.getInsideZones();
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Tracking tracking0 = Tracking.NEVER;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, true, true, tracking0);
      String string0 = assetImpl0.getStoredTagsString();
      assertNotNull(string0);
      assertFalse(assetImpl0.isDeleted());
      assertTrue(assetImpl0.isTracked());
      assertTrue(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setInsideZones((List<String>) null);
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = new Integer(2991);
      hashMap0.put("id", integer0);
      Long long0 = new Long(428L);
      HashMap<Long, Map<String, Object>> hashMap1 = new HashMap<Long, Map<String, Object>>();
      hashMap1.put(long0, hashMap0);
      assetImpl0.setInsideZonesFull(hashMap1);
      assetImpl0.getInsideZonesFull();
      assertEquals("[{id|2991}]", assetImpl0.getInsideZonesFullString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<Long, Map<String, Object>> hashMap0 = new HashMap<Long, Map<String, Object>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap1.put("customer", "customer");
      hashMap0.put((Long) null, hashMap1);
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setInsideZonesFull(hashMap0);
      // Undeclared exception!
      try { 
        assetImpl0.getInsideZonesFull();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"customer\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setInsideZonesFullString("}gqowjy|7{0cn{y!:");
      assetImpl0.getInsideZonesFull();
      assertEquals("}gqowjy|7{0cn{y!:", assetImpl0.getInsideZonesFullString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("Ie", (Object) null);
      HashMap<Long, Map<String, Object>> hashMap1 = new HashMap<Long, Map<String, Object>>();
      hashMap1.put((Long) null, hashMap0);
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setInsideZonesFull(hashMap1);
      assertEquals("[]", assetImpl0.getInsideZonesFullString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setDeprecatedTypeProperties((Map<String, String>) null);
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl((Long) null);
      assetImpl0.setInsideZonesString("");
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl((Long) null);
      assetImpl0.hashCode();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setStoredVariablesString("vTXFib[@E7\"Zw7y");
      assetImpl0.getStoredVariablesString();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Tracking tracking0 = Tracking.NEVER;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, true, true, tracking0);
      assetImpl0.getStoredVariablesString();
      assertFalse(assetImpl0.isDeleted());
      assertTrue(assetImpl0.isTracked());
      assertTrue(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Long long0 = new Long(1278L);
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, true, false, tracking0);
      String string0 = assetImpl0.getInsideZonesString();
      assertNotNull(string0);
      assertFalse(assetImpl0.isDeleted());
      assertTrue(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      ServiceProviderImpl serviceProviderImpl0 = new ServiceProviderImpl();
      List<String> list0 = serviceProviderImpl0.getPackages();
      assetImpl0.setInsideZones(list0);
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      String string0 = assetImpl0.getInsideZonesFullString();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setInsideZonesFullString("d");
      assetImpl0.getInsideZonesFullString();
      assertEquals("d", assetImpl0.getInsideZonesFullString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      String string0 = assetImpl0.getStoredTypePropertiesString();
      assertNotNull(string0);
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setStoredTypePropertiesString("positionProvider");
      assetImpl0.getStoredTypePropertiesString();
      assertEquals("positionProvider", assetImpl0.getStoredTypePropertiesString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setAssetProperties((Set<AssetProperty>) null);
      // Undeclared exception!
      try { 
        assetImpl0.getAssetPropertiesSimplified();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      // Undeclared exception!
      try { 
        assetImpl0.setInsideZonesFull((Map<Long, Map<String, Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<Long, Map<String, Object>> hashMap0 = new HashMap<Long, Map<String, Object>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap1.put("BR}OlISQ", hashMap0);
      hashMap0.put((Long) null, hashMap1);
      AssetImpl assetImpl0 = new AssetImpl();
      // Undeclared exception!
      try { 
        assetImpl0.setInsideZonesFull(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      // Undeclared exception!
      try { 
        assetImpl0.setStoredVariables((List<AssetVariable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      LinkedList<AssetPropertyImpl> linkedList0 = new LinkedList<AssetPropertyImpl>();
      LinkedHashSet<AssetProperty> linkedHashSet0 = new LinkedHashSet<AssetProperty>(linkedList0);
      linkedHashSet0.add((AssetProperty) null);
      assetImpl0.setAssetProperties(linkedHashSet0);
      assetImpl0.getAssetProperties();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setAssetProperties((Set<AssetProperty>) null);
      assetImpl0.getAssetProperties();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.getAssetPropertiesSimplified();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl((Long) null, true, true, tracking0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      assetImpl0.setDeprecatedTypeProperties(map0);
      assetImpl0.getDeprecatedTypeProperties();
      assertEquals("{CTT|Asia/Shanghai}{ART|Africa/Cairo}{CNT|America/St_Johns}{PRT|America/Puerto_Rico}{PNT|America/Phoenix}{PLT|Asia/Karachi}{AST|America/Anchorage}{BST|Asia/Dhaka}{CST|America/Chicago}{EST|-05:00}{HST|-10:00}{JST|Asia/Tokyo}{IST|Asia/Kolkata}{AGT|America/Argentina/Buenos_Aires}{NST|Pacific/Auckland}{MST|-07:00}{AET|Australia/Sydney}{BET|America/Sao_Paulo}{PST|America/Los_Angeles}{ACT|Australia/Darwin}{SST|Pacific/Guadalcanal}{VST|Asia/Ho_Chi_Minh}{CAT|Africa/Harare}{ECT|Europe/Paris}{EAT|Africa/Addis_Ababa}{IET|America/Indiana/Indianapolis}{MIT|Pacific/Apia}{NET|Asia/Yerevan}", assetImpl0.getStoredTypePropertiesString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl(10L, true);
      Long long0 = positionImpl0.getFloor();
      AssetImpl assetImpl0 = new AssetImpl(long0);
      Boolean boolean0 = positionImpl0.getValid();
      assetImpl0.setExcludeFromRuleEngine(boolean0);
      assetImpl0.getExcludeFromRuleEngine();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Long long0 = Long.getLong("", 20L);
      AssetImpl assetImpl0 = new AssetImpl(long0);
      assetImpl0.setExternalId("");
      assetImpl0.getExternalId();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      assetImpl0.setExternalId("aNbZg|-lw0MpU1Q)!0F");
      assetImpl0.getExternalId();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      LinkedHashSet<AssetGroup> linkedHashSet0 = new LinkedHashSet<AssetGroup>();
      AssetGroupImpl assetGroupImpl0 = new AssetGroupImpl();
      linkedHashSet0.add(assetGroupImpl0);
      assetImpl0.setGroups(linkedHashSet0);
      assetImpl0.getGroups();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Long long0 = new Long(0L);
      AssetImpl assetImpl0 = new AssetImpl(long0);
      assetImpl0.setImageAddress("[s[T");
      assetImpl0.getImageAddress();
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long(643L);
      assetImpl0.setImageReference(long0);
      Long long1 = assetImpl0.getImageReference();
      assertNotNull(long1);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
      assertFalse(assetImpl0.isTracked());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      Long long0 = new Long(0L);
      assetImpl0.setImageReference(long0);
      Long long1 = assetImpl0.getImageReference();
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isTracked());
      assertNotNull(long1);
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("id", assetImpl0);
      RuleImpl ruleImpl0 = new RuleImpl();
      Long long0 = ruleImpl0.getVersion();
      HashMap<Long, Map<String, Object>> hashMap1 = new HashMap<Long, Map<String, Object>>();
      hashMap1.put(long0, hashMap0);
      assetImpl0.setInsideZonesFull(hashMap1);
      assertEquals(1, hashMap1.size());
      
      assetImpl0.getInsideZonesString();
      assertFalse(assetImpl0.isDeleted());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Long long0 = new Long(1931L);
      AssetImpl assetImpl0 = new AssetImpl(long0);
      AssetTypeImpl assetTypeImpl0 = new AssetTypeImpl();
      assetImpl0.setType(assetTypeImpl0);
      assetImpl0.getType();
      assertFalse(assetImpl0.isTracked());
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      boolean boolean0 = assetImpl0.isTracked();
      assertFalse(boolean0);
      assertFalse(assetImpl0.isDeleted());
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Long long0 = new Long(1278L);
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, true, false, tracking0);
      boolean boolean0 = assetImpl0.isTracked();
      assertFalse(assetImpl0.isDeleted());
      assertTrue(boolean0);
      assertFalse(assetImpl0.isPositioned());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AssetImpl assetImpl0 = new AssetImpl();
      Integer integer0 = new Integer((-772));
      hashMap0.put("customer", integer0);
      HashMap<Long, Map<String, Object>> hashMap1 = new HashMap<Long, Map<String, Object>>();
      Long long0 = new Long(0L);
      hashMap1.put(long0, hashMap0);
      assetImpl0.setInsideZonesFull(hashMap1);
      assetImpl0.getInsideZonesFull();
      assertEquals("[{customer|-772}]", assetImpl0.getInsideZonesFullString());
  }
}
