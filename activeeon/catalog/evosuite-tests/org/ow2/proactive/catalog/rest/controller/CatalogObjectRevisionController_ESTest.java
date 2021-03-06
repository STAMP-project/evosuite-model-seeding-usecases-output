/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 13:06:39 GMT 2019
 */

package org.ow2.proactive.catalog.rest.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.ow2.proactive.catalog.rest.controller.CatalogObjectRevisionController;
import org.springframework.web.multipart.MultipartFile;

public class CatalogObjectRevisionController_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatalogObjectRevisionController catalogObjectRevisionController0 = new CatalogObjectRevisionController();
      // Undeclared exception!
      try { 
        catalogObjectRevisionController0.create((String) null, "`D`/a#|?,oI!*", " *BP7~4wYT{ps}pW3", "", (MultipartFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CatalogObjectRevisionController catalogObjectRevisionController0 = new CatalogObjectRevisionController();
      // Undeclared exception!
      try { 
        catalogObjectRevisionController0.get("org.ow2.proactive.catalog.rest.controller.CatalogObjectRevisionControlleC", ">", (String) null, (-3908L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CatalogObjectRevisionController catalogObjectRevisionController0 = new CatalogObjectRevisionController();
      // Undeclared exception!
      try { 
        catalogObjectRevisionController0.getRaw("", "#8z;^vom_", (String) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CatalogObjectRevisionController catalogObjectRevisionController0 = new CatalogObjectRevisionController();
      // Undeclared exception!
      try { 
        catalogObjectRevisionController0.list("8rc1/y(<mw/x`G}", "OiK@VAC2!pd+q+?x", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CatalogObjectRevisionController catalogObjectRevisionController0 = new CatalogObjectRevisionController();
      Long long0 = Long.getLong("", 326L);
      // Undeclared exception!
      try { 
        catalogObjectRevisionController0.restore("", (String) null, "7UuG,#2&|p^weR", long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
