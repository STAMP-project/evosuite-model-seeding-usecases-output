/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 15:16:19 GMT 2019
 */

package org.ow2.proactive.catalog.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.engine.spi.SessionImplementor;
import org.ow2.proactive.catalog.dto.BucketMetadata;
import org.ow2.proactive.catalog.repository.BucketRepository;
import org.ow2.proactive.catalog.repository.entity.BucketEntity;
import org.ow2.proactive.catalog.service.BucketService;
import org.ow2.proactive.catalog.service.OwnerGroupStringHelper;
import org.ow2.proactive.catalog.util.name.validator.BucketNameValidator;

public class BucketService_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      // Undeclared exception!
      try { 
        bucketService0.cleanAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      // Undeclared exception!
      try { 
        bucketService0.createBucket("GROUP:public-objects");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The bucket name: 'GROUP:public-objects' is not valid, please check the specification of bucket naming
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity();
      ImmutableList<BucketEntity> immutableList0 = ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(immutableList0).when(bucketRepository0).findEmptyBucketsForUpdate();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      bucketService0.cleanAllEmptyBuckets();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      // Undeclared exception!
      try { 
        bucketService0.getBucketMetadata((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity();
      ImmutableList<BucketEntity> immutableList0 = ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(immutableList0).when(bucketRepository0).findByOwnerIn(anyList());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      Optional<String> optional0 = Optional.empty();
      Supplier<List<String>> supplier0 = (Supplier<List<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      List<BucketMetadata> list0 = bucketService0.getBucketsByGroups("``)#:B7/X", optional0, optional0, supplier0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bucketRepository0).findByOwnerIsInContainingKind(anyList() , anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      Optional<String> optional0 = Optional.empty();
      Optional<String> optional1 = Optional.ofNullable("mAP*QX/gsh");
      Supplier<List<String>> supplier0 = (Supplier<List<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bucketService0.getBucketsByGroups("mAP*QX/gsh", optional1, optional0, supplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      Optional<String> optional0 = Optional.of("GROUP:public-objects");
      Funnel<Object> funnel0 = (Funnel<Object>) mock(Funnel.class, new ViolatedAssumptionAnswer());
      BloomFilter<Object> bloomFilter0 = BloomFilter.create((Funnel<? super Object>) funnel0, 1);
      Optional<String> optional1 = optional0.filter(bloomFilter0);
      Supplier<List<String>> supplier0 = (Supplier<List<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bucketService0.getBucketsByGroups("5.nRi\"p-", optional1, optional0, supplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity();
      ImmutableList<BucketEntity> immutableList0 = ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(immutableList0).when(bucketRepository0).findAll();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      Optional<String> optional0 = Optional.empty();
      List<BucketMetadata> list0 = bucketService0.listBuckets("", optional0, optional0);
      assertEquals(10, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      Optional<String> optional0 = Optional.of("[q<vX");
      Optional<String> optional1 = Optional.empty();
      // Undeclared exception!
      try { 
        bucketService0.listBuckets("", optional1, optional0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity("GROUP:public-objects", "GROUP:public-objects");
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(bucketEntity0).when(bucketRepository0).findBucketForUpdate(anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      BucketMetadata bucketMetadata0 = bucketService0.deleteEmptyBucket("GROUP:");
      assertEquals("GROUP:public-objects", bucketMetadata0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((BucketEntity) null).when(bucketRepository0).findBucketForUpdate(anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      // Undeclared exception!
      try { 
        bucketService0.deleteEmptyBucket("GROUP:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find bucket with bucketName : GROUP:
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity();
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(bucketEntity0).when(bucketRepository0).findOneByBucketName(anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      OwnerGroupStringHelper ownerGroupStringHelper0 = new OwnerGroupStringHelper();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "ownerGroupStringHelper", (Object) ownerGroupStringHelper0);
      Injector.validateBean(bucketService0, (Class<?>) BucketService.class);
      BucketMetadata bucketMetadata0 = bucketService0.getBucketMetadata("GROUP:");
      assertFalse(bucketMetadata0.hasLinks());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((BucketEntity) null).when(bucketRepository0).findOneByBucketName(anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      // Undeclared exception!
      try { 
        bucketService0.getBucketMetadata((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find bucket with bucketName : null
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      Optional<String> optional0 = Optional.empty();
      Supplier<List<String>> supplier0 = (Supplier<List<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      // Undeclared exception!
      try { 
        bucketService0.getBucketsByGroups((String) null, optional0, optional0, supplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      OwnerGroupStringHelper ownerGroupStringHelper0 = new OwnerGroupStringHelper();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "ownerGroupStringHelper", (Object) ownerGroupStringHelper0);
      Injector.validateBean(bucketService0, (Class<?>) BucketService.class);
      // Undeclared exception!
      try { 
        bucketService0.createBucket("getResultSetImpl(long,int,Map)", "getResultSetImpl(long,int,Map)");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The bucket name: 'getResultSetImpl(long,int,Map)' is not valid, please check the specification of bucket naming
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      // Undeclared exception!
      try { 
        bucketService0.cleanAllEmptyBuckets();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      // Undeclared exception!
      try { 
        bucketService0.createBucket("-g0JoTy5bwC,Z,ayTu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      // Undeclared exception!
      try { 
        bucketService0.deleteEmptyBucket("GROUP:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(sessionImplementor0).isOpen();
      PersistentBag persistentBag0 = new PersistentBag(sessionImplementor0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(persistentBag0).when(bucketRepository0).findByOwnerIsInContainingKindAndContentType(anyList() , anyString() , anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      OwnerGroupStringHelper ownerGroupStringHelper0 = new OwnerGroupStringHelper();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "ownerGroupStringHelper", (Object) ownerGroupStringHelper0);
      Injector.validateBean(bucketService0, (Class<?>) BucketService.class);
      Optional<String> optional0 = Optional.of("m3We9=m");
      // Undeclared exception!
      try { 
        bucketService0.listBuckets("com.google.protobuf.EnumValue", optional0, optional0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // failed to lazily initialize a collection, could not initialize proxy - the owning Session was closed
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      ArrayList<BucketEntity> arrayList0 = new ArrayList<BucketEntity>();
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(bucketRepository0).findByOwnerIn(anyList());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      Optional<String> optional0 = Optional.empty();
      Supplier<List<String>> supplier0 = (Supplier<List<String>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      List<BucketMetadata> list0 = bucketService0.getBucketsByGroups("mAP*QX/gsh", optional0, optional0, supplier0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      bucketNameValidator0.isValid("&OruY=$OJL-fP$Q IE");
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketEntity bucketEntity0 = new BucketEntity();
      ImmutableList.of(bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0, bucketEntity0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bucketRepository0).findContainingKindAndContentType(anyString() , anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      Optional<String> optional0 = Optional.of("GROUP:");
      bucketService0.listBuckets("", optional0, optional0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      bucketNameValidator0.isValid("&OruY=$OJL-fP$Q IE");
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bucketRepository0).findByOwnerIsInContainingKindAndContentType(anyList() , anyString() , anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      OwnerGroupStringHelper ownerGroupStringHelper0 = new OwnerGroupStringHelper();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "ownerGroupStringHelper", (Object) ownerGroupStringHelper0);
      Injector.validateBean(bucketService0, (Class<?>) BucketService.class);
      ImmutableList<String> immutableList0 = ImmutableList.of("~JY@c@n");
      Optional<String> optional0 = Optional.ofNullable("GROUP:");
      bucketService0.listBuckets((List<String>) immutableList0, optional0, optional0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      bucketService0.cleanAll();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BucketService bucketService0 = new BucketService();
      BucketNameValidator bucketNameValidator0 = new BucketNameValidator();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketNameValidator", (Object) bucketNameValidator0);
      BucketRepository bucketRepository0 = mock(BucketRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(bucketRepository0).findByOwnerIsInContainingKindAndContentType(anyList() , anyString() , anyString());
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "bucketRepository", (Object) bucketRepository0);
      OwnerGroupStringHelper ownerGroupStringHelper0 = new OwnerGroupStringHelper();
      Injector.inject(bucketService0, (Class<?>) BucketService.class, "ownerGroupStringHelper", (Object) ownerGroupStringHelper0);
      Injector.validateBean(bucketService0, (Class<?>) BucketService.class);
      Optional<String> optional0 = Optional.ofNullable("E6]Bz\"E?03dX9~!Y");
      Function<String, String> function0 = Function.identity();
      Optional<String> optional1 = optional0.map((Function<? super String, ? extends String>) function0);
      // Undeclared exception!
      try { 
        bucketService0.listBuckets("GROUP:", optional1, optional0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}