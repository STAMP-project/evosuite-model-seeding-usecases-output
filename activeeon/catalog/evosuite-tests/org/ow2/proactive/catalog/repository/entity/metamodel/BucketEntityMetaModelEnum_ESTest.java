/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:15:40 GMT 2019
 */

package org.ow2.proactive.catalog.repository.entity.metamodel;

import org.junit.Test;
import static org.junit.Assert.*;
import org.ow2.proactive.catalog.repository.entity.metamodel.BucketEntityMetaModelEnum;

public class BucketEntityMetaModelEnum_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BucketEntityMetaModelEnum bucketEntityMetaModelEnum0 = BucketEntityMetaModelEnum.NAME;
      String string0 = bucketEntityMetaModelEnum0.getName();
      assertEquals("name", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BucketEntityMetaModelEnum[] bucketEntityMetaModelEnumArray0 = BucketEntityMetaModelEnum.values();
      assertEquals(3, bucketEntityMetaModelEnumArray0.length);
  }
}
