package multipleTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
 
	@BeforeClass
	  public void beforeClass() {
	  System.out.println("in before class");
	  }
	  @AfterClass
	  public void afterClass() {
		 System.out.println("in After  class once ");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("in Before test run once");
	  }
	  @AfterTest
	  public void afterTest() {
	  System.out.println("in after test run once");
	  }
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("in before suite run once");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("in after suite run once");
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  System.out.println("Before method");
	  }
	  @AfterMethod
	  public void AfterMethod()
	  {
		  System.out.println("After method");
	  }
}
