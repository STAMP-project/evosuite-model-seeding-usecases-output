/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 13:32:16 GMT 2019
 */

package org.ow2.proactive.catalog.graphql.bean.argument;

import org.junit.Test;
import static org.junit.Assert.*;
import org.ow2.proactive.catalog.graphql.bean.argument.CatalogObjectBucketNameWhereArgs;

public class CatalogObjectBucketNameWhereArgs_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = CatalogObjectBucketNameWhereArgs.builder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.notLike("4%XPKkk");
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      String string0 = catalogObjectBucketNameWhereArgs0.toString();
      assertEquals("CatalogObjectBucketNameWhereArgs()", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs1 = new CatalogObjectBucketNameWhereArgs("CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()", "CatalogObjectBucketNameWhereArgs()");
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.equals(catalogObjectBucketNameWhereArgs1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      catalogObjectBucketNameWhereArgs0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.eq(", gt=");
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      String string0 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.toString();
      assertEquals("CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder(eq=null, ne=null, gt=null, gte=null, lt=null, lte=null, like=null, notLike=null)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.like((String) null);
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.gte((String) null);
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.lt("CatalogObjectBucketNameWhereArgs()");
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.build();
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.canEqual(catalogObjectBucketNameWhereArgs0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = CatalogObjectBucketNameWhereArgs.builder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.lte("4%XPKkk");
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = new CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.gt((String) null);
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0 = CatalogObjectBucketNameWhereArgs.builder();
      CatalogObjectBucketNameWhereArgs.CatalogObjectBucketNameWhereArgsBuilder catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1 = catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0.ne("y\"77PFIJnY,IMio3");
      assertSame(catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder0, catalogObjectBucketNameWhereArgs_CatalogObjectBucketNameWhereArgsBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.equals(catalogObjectBucketNameWhereArgs0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs1 = new CatalogObjectBucketNameWhereArgs();
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.equals(catalogObjectBucketNameWhereArgs1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CatalogObjectBucketNameWhereArgs catalogObjectBucketNameWhereArgs0 = new CatalogObjectBucketNameWhereArgs();
      boolean boolean0 = catalogObjectBucketNameWhereArgs0.canEqual("' e@JasDep8Xw}nzJf");
      assertFalse(boolean0);
  }
}