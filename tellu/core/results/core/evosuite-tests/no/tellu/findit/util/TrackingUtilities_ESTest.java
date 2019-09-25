/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 10:49:36 GMT 2019
 */

package no.tellu.findit.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import no.tellu.findit.domain.Asset;
import no.tellu.findit.domain.AssetImpl;
import no.tellu.findit.domain.Position;
import no.tellu.findit.domain.PositionImpl;
import no.tellu.findit.domain.PositionProvider;
import no.tellu.findit.domain.SensorDeviceConfigurationImpl;
import no.tellu.findit.domain.SensorDeviceImpl;
import no.tellu.findit.domain.TagImpl;
import no.tellu.findit.domain.Tracking;
import no.tellu.findit.util.TrackingUtilities;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class TrackingUtilities_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl();
      // Undeclared exception!
      try { 
        TrackingUtilities.getDistance(positionImpl0, positionImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = TrackingUtilities.formatString("DBwRE.f7 vI<<");
      assertEquals("DBwRE.f7 vI<<", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween((Asset) null, (Asset) null);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      double double0 = TrackingUtilities.distanceBetween((Asset) assetImpl0, (Asset) null);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl(1154.9949F, 0.0);
      Asset asset0 = mock(Asset.class, new ViolatedAssumptionAnswer());
      doReturn(positionImpl0, positionImpl0).when(asset0).getPosition();
      Long long0 = Long.valueOf((-1L));
      Tracking tracking0 = Tracking.MANUAL;
      AssetImpl assetImpl0 = new AssetImpl(long0, false, false, tracking0);
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween(asset0, (Asset) assetImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween((PositionProvider) null, (PositionProvider) null);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TagImpl tagImpl0 = new TagImpl();
      double double0 = TrackingUtilities.distanceBetween((PositionProvider) tagImpl0, (PositionProvider) null);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl(0.0, 0.0);
      TagImpl tagImpl0 = new TagImpl();
      tagImpl0.setMyValidPosition(positionImpl0);
      double double0 = TrackingUtilities.distanceBetween((PositionProvider) tagImpl0, (PositionProvider) tagImpl0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssetImpl assetImpl0 = new AssetImpl();
      PositionImpl positionImpl0 = new PositionImpl();
      TagImpl tagImpl0 = new TagImpl();
      tagImpl0.setMyValidPosition(positionImpl0);
      double double0 = TrackingUtilities.distanceBetween((PositionProvider) tagImpl0, (PositionProvider) assetImpl0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween("", "", "", "");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween("vk|(%a+r~t[#%>a:*g", "", "vk|(%a+r~t[#%>a:*g", "");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween("vk|(%a+r~t[#%>a:*g", "vk|(%a+r~t[#%>a:*g", "", "");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween("web.report_signature", "`vLB2deL+m`e,h3G", "`vLB2deL+m`e,h3G", "");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween("10000", "10000", "4", "4");
      assertEquals(1.0321924195068266E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween(0.0, 0.0, 0.0, 3420.48341245);
      assertEquals(1.9849780163157556E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl();
      Double double0 = positionImpl0.getX();
      positionImpl0.setLatitude(double0);
      positionImpl0.setLongitude(double0);
      PositionImpl positionImpl1 = new PositionImpl(457.18378466626393, 0.0);
      double double1 = TrackingUtilities.getDistance(positionImpl0, positionImpl1);
      assertEquals(9199622.600031778, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = TrackingUtilities.atan2(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween(0.0, 0.0, 0.0, 3.141592653589793);
      assertEquals(349720.4944773568, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween(0.0F, 0.0F, 0.0F, (-176.363F));
      assertEquals(1.9632640088569548E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = TrackingUtilities.atan2(0.0, 0.9753629308830516);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = TrackingUtilities.atan2(4.0, 0.9784821890094308);
      assertEquals(1.330887051243245, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = TrackingUtilities.atan2(1524.1482339868, (-1.0F));
      assertEquals(1.5714524308628672, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = TrackingUtilities.atan2((-1.5707963267948966), (-577.0));
      assertEquals(3.1443149975175584, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = TrackingUtilities.atan2((-469.589), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween((String) null, (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TagImpl tagImpl0 = new TagImpl();
      PositionImpl positionImpl0 = new PositionImpl();
      tagImpl0.setMyValidPosition(positionImpl0);
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween((PositionProvider) tagImpl0, (PositionProvider) tagImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween(90.0, 90.0, 90.0, 90.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = TrackingUtilities.distanceBetween(1154.9949F, 1154.9949F, 1154.9949F, 1154.9949F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TrackingUtilities.distanceBetween(1156.5493F, 1156.5493F, 1156.5493F, 0.0F);
      TrackingUtilities.distanceBetween((-1374.8984F), 0.0F, 0.0F, 0.0F);
      TrackingUtilities trackingUtilities0 = new TrackingUtilities();
      Long long0 = new Long(3392L);
      SensorDeviceConfigurationImpl sensorDeviceConfigurationImpl0 = new SensorDeviceConfigurationImpl();
      sensorDeviceConfigurationImpl0.getDeviceHistoryTTL();
      SensorDeviceImpl sensorDeviceImpl0 = new SensorDeviceImpl(long0, (Long) null, true, long0, (Long) null);
      TrackingUtilities.distanceBetween((PositionProvider) sensorDeviceImpl0, (PositionProvider) sensorDeviceImpl0);
      PositionImpl positionImpl0 = new PositionImpl((-1374.8984F), 1850274.6868959637);
      Asset asset0 = mock(Asset.class, new ViolatedAssumptionAnswer());
      doReturn(positionImpl0, (Position) null).when(asset0).getPosition();
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween(asset0, asset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = TrackingUtilities.formatString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = TrackingUtilities.formatString((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PositionImpl positionImpl0 = new PositionImpl(0.0, 0.0);
      double double0 = TrackingUtilities.getDistance(positionImpl0, positionImpl0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween("-1", "rule.cache_version", "P-'>IJ+", "P-'>IJ+");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween("4", "4", "mE*", "4");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        TrackingUtilities.distanceBetween("4", "4", "4", "ACTIVATED");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double double0 = TrackingUtilities.atan2(187.3420407, Double.NaN);
      assertEquals(1.5707963267948966, double0, 0.01);
  }
}
