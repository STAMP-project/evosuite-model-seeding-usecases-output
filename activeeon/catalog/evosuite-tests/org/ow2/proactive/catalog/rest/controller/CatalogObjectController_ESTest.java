/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 13:10:29 GMT 2019
 */

package org.ow2.proactive.catalog.rest.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.ow2.proactive.catalog.rest.controller.CatalogObjectController;

public class CatalogObjectController_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.listKinds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.listContentTypes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      Optional<String> optional0 = Optional.of("Content-Disposition");
      Function<String, String> function0 = Function.identity();
      Optional<String> optional1 = optional0.map((Function<? super String, ? extends String>) function0);
      // Undeclared exception!
      try { 
        catalogObjectController0.listCatalogObjectNameReference("Content-Disposition", optional1, optional0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      Optional<String> optional0 = Optional.of("Content-Disposition");
      // Undeclared exception!
      try { 
        catalogObjectController0.updateObjectMetadata((String) null, "geometry", "", optional0, optional0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.get("R%]3q>,]~u]A", "R%]3q>,]~u]A", "{P_zj|m{b(v|(-@|_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.get("", "_}D<", "_}D<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.getRaw("/{bucketName}/resources", "SA=R9+", "!AN-rd5&>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.getDependencies("Cannot retrieve the id of a named savepoint.", "c!A", "}Ue>e>Gjvpd70JW,W}d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      Optional<String> optional0 = Optional.empty();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        catalogObjectController0.list("]M>x3", "org.hibernate.type.CalendarTimeType", optional0, optional0, (Optional<List<String>>) null, httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CatalogObjectController catalogObjectController0 = new CatalogObjectController();
      // Undeclared exception!
      try { 
        catalogObjectController0.delete("6a2R2Y2b;c~3We&", "Content-Encoding", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
