/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 14:46:51 GMT 2019
 */

package org.ow2.proactive.catalog.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import org.ow2.proactive.catalog.dto.CatalogRawObject;
import org.ow2.proactive.catalog.dto.Metadata;
import org.ow2.proactive.catalog.util.RawObjectResponseCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RawObjectResponseCreator_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      // Undeclared exception!
      try { 
        rawObjectResponseCreator0.createRawObjectResponse((CatalogRawObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      String string0 = rawObjectResponseCreator0.getNameWithFileExtension((String) null, "u[TowS", "");
      assertEquals("null.u[TowS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      String string0 = rawObjectResponseCreator0.getNameWithFileExtension((String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      String string0 = rawObjectResponseCreator0.getNameWithFileExtension(".xml", "", "workflowa*)uev_bjo=");
      assertEquals(".xml", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      Stack<Metadata> stack0 = new Stack<Metadata>();
      byte[] byteArray0 = new byte[3];
      CatalogRawObject catalogRawObject0 = new CatalogRawObject("_w!fh:W_\"W&AUF9us`", " ", ".xml", " ", 480L, "_w!fh:W_\"W&AUF9us`", "Error creating converter for ", stack0, byteArray0, " ");
      // Undeclared exception!
      try { 
        rawObjectResponseCreator0.createRawObjectResponse(catalogRawObject0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      LinkedList<Metadata> linkedList0 = new LinkedList<Metadata>();
      byte[] byteArray0 = new byte[2];
      CatalogRawObject catalogRawObject0 = new CatalogRawObject(".xml", ".xml", "*", "*", 1L, "The exception during creation of raw object response", "The exception during creation of raw object response", linkedList0, byteArray0, "*");
      // Undeclared exception!
      try { 
        rawObjectResponseCreator0.createRawObjectResponse(catalogRawObject0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'Content-Type' cannot contain wildcard type '*'
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      // Undeclared exception!
      try { 
        rawObjectResponseCreator0.getNameWithFileExtension((String) null, (String) null, "workflowworkflob[?#/4d{cts_0pfm.roox_f|o)dp%q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      ArrayList<Metadata> arrayList0 = new ArrayList<Metadata>();
      byte[] byteArray0 = new byte[6];
      CatalogRawObject catalogRawObject0 = new CatalogRawObject((String) null, (String) null, "workflowattachme", "workflowattachme", 0L, (String) null, "n[,]av~7", arrayList0, byteArray0, "");
      ResponseEntity responseEntity0 = rawObjectResponseCreator0.createRawObjectResponse(catalogRawObject0);
      assertEquals(HttpStatus.OK, responseEntity0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      String string0 = rawObjectResponseCreator0.getNameWithFileExtension("", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      ArrayList<Metadata> arrayList0 = new ArrayList<Metadata>();
      byte[] byteArray0 = new byte[3];
      CatalogRawObject catalogRawObject0 = new CatalogRawObject("g-}yb", "attahme", "workflowe,hb8v403t-?.workflowe,hb8v403t-?", "An9obnO+~/^XH7D+w", 1L, "bR\"Ihx+@ofYZ/D3I#", "g-}yb", arrayList0, byteArray0, "g-}yb");
      ResponseEntity responseEntity0 = rawObjectResponseCreator0.createRawObjectResponse(catalogRawObject0);
      assertTrue(responseEntity0.hasBody());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawObjectResponseCreator rawObjectResponseCreator0 = new RawObjectResponseCreator();
      String string0 = rawObjectResponseCreator0.getNameWithFileExtension("e,hB8v403t-?", "", "workflowa*)uev_bjo=");
      assertEquals("e,hB8v403t-?.xml", string0);
  }
}
