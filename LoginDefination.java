package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefination {
	
	WebDriver driver;

	@Given("^User is already on login page$")
	public void User_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\New folder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);	
		driver.get("http://newtours.demoaut.com/");
	}
	@When ("^Title of login page is Mercury Login$")
	public void Title_of_login_page_is_Mercury_Login(){
		System.out.println("When method");
	}
	 
	@Then("^user enters username and enters password$")
	public void user_enters_username_and_enters_password(){
		System.out.println("Then method");
	}
	@Then("^click on login button$")
	public void click_on_login_button(){
		System.out.println("Then method 2");
	}
	
	
	
}
