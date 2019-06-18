package multipleTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeSuite
	public void setUp(){
	System.out.println("Set System .set property for chrome");
	}
	@BeforeTest	
	public void launchBrowser(){
		System.out.println("Launch Chrome browser");
	}
	@BeforeClass
	public void login(){
		System.out.println("login to an app");
	}
	@BeforeMethod
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite
	public void closeBrowser(){
		
	}
	
  @Test
  public void f() {
  }
}
