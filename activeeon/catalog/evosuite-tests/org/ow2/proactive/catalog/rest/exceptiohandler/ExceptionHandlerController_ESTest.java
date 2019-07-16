/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 13:01:30 GMT 2019
 */

package org.ow2.proactive.catalog.rest.exceptiohandler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.sql.BatchUpdateException;
import java.sql.DataTruncation;
import java.sql.SQLClientInfoException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import java.sql.SQLWarning;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.ow2.proactive.catalog.rest.exceptiohandler.ExceptionHandlerController;

public class ExceptionHandlerController_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      BatchUpdateException batchUpdateException0 = new BatchUpdateException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, batchUpdateException0);
        fail("Expecting exception: BatchUpdateException");
      
      } catch(BatchUpdateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      MockException mockException0 = new MockException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, mockException0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      DataTruncation dataTruncation0 = new DataTruncation(0, true, true, 1458, 0);
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, dataTruncation0);
        fail("Expecting exception: DataTruncation");
      
      } catch(DataTruncation e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLClientInfoException0);
        fail("Expecting exception: SQLClientInfoException");
      
      } catch(SQLClientInfoException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLDataException sQLDataException0 = new SQLDataException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLDataException0);
        fail("Expecting exception: SQLDataException");
      
      } catch(SQLDataException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLException sQLException0 = new SQLException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLException0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLFeatureNotSupportedException0);
        fail("Expecting exception: SQLFeatureNotSupportedException");
      
      } catch(SQLFeatureNotSupportedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLIntegrityConstraintViolationException0);
        fail("Expecting exception: SQLIntegrityConstraintViolationException");
      
      } catch(SQLIntegrityConstraintViolationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLInvalidAuthorizationSpecException0);
        fail("Expecting exception: SQLInvalidAuthorizationSpecException");
      
      } catch(SQLInvalidAuthorizationSpecException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      try { 
        exceptionHandlerController0.exceptionHandler(httpServletRequestWrapper0, sQLNonTransientConnectionException0);
        fail("Expecting exception: SQLNonTransientConnectionException");
      
      } catch(SQLNonTransientConnectionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLNonTransientException0);
        fail("Expecting exception: SQLNonTransientException");
      
      } catch(SQLNonTransientException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      try { 
        exceptionHandlerController0.exceptionHandler(httpServletRequestWrapper0, sQLRecoverableException0);
        fail("Expecting exception: SQLRecoverableException");
      
      } catch(SQLRecoverableException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      try { 
        exceptionHandlerController0.exceptionHandler(httpServletRequest0, sQLSyntaxErrorException0);
        fail("Expecting exception: SQLSyntaxErrorException");
      
      } catch(SQLSyntaxErrorException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLTimeoutException0);
        fail("Expecting exception: SQLTimeoutException");
      
      } catch(SQLTimeoutException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLTransactionRollbackException0);
        fail("Expecting exception: SQLTransactionRollbackException");
      
      } catch(SQLTransactionRollbackException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException();
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLTransientConnectionException0);
        fail("Expecting exception: SQLTransientConnectionException");
      
      } catch(SQLTransientConnectionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTransientException sQLTransientException0 = new SQLTransientException();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLTransientException0);
        fail("Expecting exception: SQLTransientException");
      
      } catch(SQLTransientException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLWarning sQLWarning0 = new SQLWarning();
      try { 
        exceptionHandlerController0.exceptionHandler((HttpServletRequest) null, sQLWarning0);
        fail("Expecting exception: SQLWarning");
      
      } catch(SQLWarning e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockException mockException0 = new MockException();
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(mockException0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      BatchUpdateException batchUpdateException0 = new BatchUpdateException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(batchUpdateException0);
        fail("Expecting exception: BatchUpdateException");
      
      } catch(BatchUpdateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      DataTruncation dataTruncation0 = new DataTruncation(526, false, false, 526, (-182));
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(dataTruncation0);
        fail("Expecting exception: DataTruncation");
      
      } catch(DataTruncation e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLClientInfoException0);
        fail("Expecting exception: SQLClientInfoException");
      
      } catch(SQLClientInfoException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLDataException sQLDataException0 = new SQLDataException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLDataException0);
        fail("Expecting exception: SQLDataException");
      
      } catch(SQLDataException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLException sQLException0 = new SQLException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLException0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLFeatureNotSupportedException0);
        fail("Expecting exception: SQLFeatureNotSupportedException");
      
      } catch(SQLFeatureNotSupportedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLIntegrityConstraintViolationException0);
        fail("Expecting exception: SQLIntegrityConstraintViolationException");
      
      } catch(SQLIntegrityConstraintViolationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLInvalidAuthorizationSpecException0);
        fail("Expecting exception: SQLInvalidAuthorizationSpecException");
      
      } catch(SQLInvalidAuthorizationSpecException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLNonTransientConnectionException0);
        fail("Expecting exception: SQLNonTransientConnectionException");
      
      } catch(SQLNonTransientConnectionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLNonTransientException0);
        fail("Expecting exception: SQLNonTransientException");
      
      } catch(SQLNonTransientException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLRecoverableException0);
        fail("Expecting exception: SQLRecoverableException");
      
      } catch(SQLRecoverableException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLSyntaxErrorException0);
        fail("Expecting exception: SQLSyntaxErrorException");
      
      } catch(SQLSyntaxErrorException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLTimeoutException0);
        fail("Expecting exception: SQLTimeoutException");
      
      } catch(SQLTimeoutException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLTransactionRollbackException0);
        fail("Expecting exception: SQLTransactionRollbackException");
      
      } catch(SQLTransactionRollbackException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLTransientConnectionException0);
        fail("Expecting exception: SQLTransientConnectionException");
      
      } catch(SQLTransientConnectionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SQLTransientException sQLTransientException0 = new SQLTransientException();
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLTransientException0);
        fail("Expecting exception: SQLTransientException");
      
      } catch(SQLTransientException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExceptionHandlerController exceptionHandlerController0 = new ExceptionHandlerController();
      SQLWarning sQLWarning0 = new SQLWarning();
      try { 
        exceptionHandlerController0.resolveAnnotatedResponseStatus(sQLWarning0);
        fail("Expecting exception: SQLWarning");
      
      } catch(SQLWarning e) {
      }
  }
}
