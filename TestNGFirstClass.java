package testNGPkg;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGFirstClass {
	
  @Test
  public void TC1() {
	  System.out.println("TC1");
  } 
  @Test
  public void TC2() {
	  System.out.println("TC2");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in After test class once ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in Before class run once");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in after class run once");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in before suite run once");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in after suite run once");
  }

}
