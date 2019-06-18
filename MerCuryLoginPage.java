package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MerCuryLoginPage extends TestBase {
	
	@FindBy(name="userName")
	WebElement usernameM;

	@FindBy(name="password")
	WebElement passwordM;
	
	@FindBy(name="login")
	WebElement submitM;
	
	public MerCuryLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public MerCuryHomePage loginPageM(String unM, String pwdM){
		usernameM.sendKeys(unM);
		passwordM.sendKeys(pwdM);
		return new MerCuryHomePage();
	}
}
