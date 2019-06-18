package auto.ttm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import auto.ttm.base.TestBase;
import auto.ttm.pages.HomePage;



public class HomePageTest extends TestBase{	
	
	HomePage homePage;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();				
	}
	
	@Test
	public void HomePageTitleTest(){
	String title =  homePage.HomePageTitle();
	 Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	

}
