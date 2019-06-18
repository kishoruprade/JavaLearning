package mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mercury.base.TestBase;

public class LoginPage extends TestBase{
	
	// Pagefactory of Login page or Object Repository
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	// Initialization of Page Objects
	public LoginPage(){		
		PageFactory.initElements(driver, this);		
		}

	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();		
	}
	
	public FlightFinderPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new FlightFinderPage();                  //This will return all home page class objects
	}
		
	

//    System.out.println(driver.getTitle());
//	
	

}
