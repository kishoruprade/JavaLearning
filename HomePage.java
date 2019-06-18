package auto.ttm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import auto.ttm.base.TestBase;



public class HomePage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initialization of Page Objects
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String HomePageTitle(){
		return driver.getTitle();
	}
	
	
	
	

}
