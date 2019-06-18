package com.ttm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="userName")
	WebElement usernameM;

	@FindBy(name="password")
	WebElement passwordM;
	
	@FindBy(name="login")
	WebElement submitM;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginPageM(String unM, String pwdM){
		usernameM.sendKeys(unM);
		passwordM.sendKeys(pwdM);
		return new HomePage();
	}
}

