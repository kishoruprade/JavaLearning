package com.crm.qa.testcases;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MerCuryHomePage;
import com.crm.qa.pages.MerCuryLoginPage;

   public class MerCuryLoginPageTest extends TestBase{
	public MerCuryHomePage mercuryHomePage;
	public MerCuryLoginPage mercuryLoginPage;
	
	public MerCuryLoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		mercuryLoginPage = new MerCuryLoginPage();		
	}
	
	@Test(invocationCount=3)
	public void mercuryLoginTest(){			
		mercuryHomePage = mercuryLoginPage.loginPageM(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();		
	}
	

}
