package mercury.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mercury.base.TestBase;
import mercury.pages.LoginPage;
import mercury.pages.FlightFinderPage;

public class LoginPageTest extends TestBase{
	
	public static LoginPage loginPage;
	public static FlightFinderPage searchFlight;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod()
	public void setUp(){
		intialization();
		loginPage = new LoginPage();
	}
	
	
	@Test(enabled=false)
	public void LoginPageTitleTest(){
		String loginTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(loginTitle, "Welcome: Mercury Tours");
	}
	
	@Test(priority=1)
	public void loginTest(){
		searchFlight = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
