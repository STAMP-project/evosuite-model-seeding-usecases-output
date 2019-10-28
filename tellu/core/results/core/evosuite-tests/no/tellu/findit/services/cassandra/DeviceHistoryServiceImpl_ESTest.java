/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 08:41:28 GMT 2019
 */

package no.tellu.findit.services.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import no.tellu.findit.domain.Position;
import no.tellu.findit.domain.SensorDeviceImpl;
import no.tellu.findit.services.cassandra.DeviceHistory;
import no.tellu.findit.services.cassandra.DeviceHistoryServiceImpl;
import org.evosuite.runtime.mock.java.util.MockDate;

public class DeviceHistoryServiceImpl_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = new DeviceHistoryServiceImpl();
      boolean boolean0 = deviceHistoryServiceImpl0.isConfigured();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = new DeviceHistoryServiceImpl();
      SensorDeviceImpl sensorDeviceImpl0 = new SensorDeviceImpl();
      deviceHistoryServiceImpl0.addObservation(sensorDeviceImpl0, (Position) null);
      assertNull(sensorDeviceImpl0.getEmbeddedLocationZ());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      MockDate mockDate0 = new MockDate();
      List<Position> list0 = deviceHistoryServiceImpl0.getObservations(linkedList0, (Long) null, mockDate0, mockDate0, map0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      MockDate mockDate0 = new MockDate();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      List<DeviceHistory> list0 = deviceHistoryServiceImpl0.getDeviceHistory(linkedList0, (Long) null, mockDate0, mockDate0, (Map<String, String>) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      deviceHistoryServiceImpl0.createDeviceHistoryTable((String) null);
      assertFalse(deviceHistoryServiceImpl0.isConfigured());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      deviceHistoryServiceImpl0.clearKeyspace();
      assertFalse(deviceHistoryServiceImpl0.isConfigured());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      deviceHistoryServiceImpl0.configure((String) null, (String) null, (String) null, 0);
      assertTrue(deviceHistoryServiceImpl0.isConfigured());
      
      DeviceHistoryServiceImpl deviceHistoryServiceImpl1 = DeviceHistoryServiceImpl.getInstance();
      assertTrue(deviceHistoryServiceImpl1.isConfigured());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DeviceHistoryServiceImpl deviceHistoryServiceImpl0 = DeviceHistoryServiceImpl.getInstance();
      deviceHistoryServiceImpl0.configure("'", (String) null, (String) null, 173);
      boolean boolean0 = deviceHistoryServiceImpl0.isConfigured();
      assertTrue(boolean0);
  }
}