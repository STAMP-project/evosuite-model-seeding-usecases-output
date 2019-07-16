/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:40:56 GMT 2019
 */

package org.ow2.proactive.catalog.util.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;
import org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity;
import org.ow2.proactive.catalog.util.parser.DefaultCatalogObjectParser;

public class DefaultCatalogObjectParser_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultCatalogObjectParser defaultCatalogObjectParser0 = new DefaultCatalogObjectParser();
      boolean boolean0 = defaultCatalogObjectParser0.isMyKind("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultCatalogObjectParser defaultCatalogObjectParser0 = new DefaultCatalogObjectParser();
      List<KeyValueLabelMetadataEntity> list0 = defaultCatalogObjectParser0.getMetadataKeyValues((InputStream) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultCatalogObjectParser defaultCatalogObjectParser0 = new DefaultCatalogObjectParser();
      Vector<KeyValueLabelMetadataEntity> vector0 = new Vector<KeyValueLabelMetadataEntity>();
      String string0 = defaultCatalogObjectParser0.getIconPath(vector0);
      assertEquals("/automation-dashboard/styles/patterns/img/wf-icons/wf-default-icon.png", string0);
  }
}
