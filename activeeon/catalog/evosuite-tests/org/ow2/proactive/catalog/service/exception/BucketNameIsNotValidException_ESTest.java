/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 15:05:11 GMT 2019
 */

package org.ow2.proactive.catalog.service.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.ow2.proactive.catalog.service.exception.BucketNameIsNotValidException;

public class BucketNameIsNotValidException_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BucketNameIsNotValidException bucketNameIsNotValidException0 = new BucketNameIsNotValidException("");
      BucketNameIsNotValidException bucketNameIsNotValidException1 = new BucketNameIsNotValidException(bucketNameIsNotValidException0);
      assertFalse(bucketNameIsNotValidException1.equals((Object)bucketNameIsNotValidException0));
  }
}