package webAutomationTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_test {
  @Test(priority=3)
  public void f() {
	  System.out.println("priority 3");
  }
  
  @Test(priority =1)
  public void test1()
  {
	System.out.println("test priority1");  
  }
  
  @Test(priority =2)
  public void test2()
  {
	System.out.println("test priority2");  
  }
  
  @Test(priority =0)
  public void test3()
  {
	System.out.println("test priority0");  
  }
	
	 @BeforeMethod public void beforeMethod() {
	 System.out.println("THis will execute before every method"); }
	 
	 @AfterMethod public void afterMethod() {
	 System.out.println("THis will execute after every method"); }
	 
	 @BeforeClass public void beforeClass() {
	  System.out.println("this will execute after every class"); }
	 
	  @AfterClass public void afterClass() {
	  System.out.println("this will execute after every class"); }
	 
	  @BeforeTest public void beforeTest() {
	  System.out.println("this will execute before every test"); }
	  
	  @AfterTest public void afterTest() {
	  System.out.println("this will execute after every test"); }
	 
	 @BeforeSuite public void beforeSuite() {
	 System.out.println("this will execute before every suite"); }
	 
	 @AfterSuite public void afterSuite() {
	  System.out.println("this will execute after every suite"); }
	 
}
