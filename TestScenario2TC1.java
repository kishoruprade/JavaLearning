/*
 * 1.	Open https://seleniumqtpautomation.000webhostapp.com/final.html
2.	To verify the page Title.

 */
package seleniumthree;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario2TC1 {

	public static void main(String[] args) {
		// Set property for chrome driver
		System.setProperty("webdriver.chrome.driver", "C://Users//UpradeK//Desktop//SeleniumJava_Class//Installables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Create an object for ChromeDriver access
		driver.manage().window().maximize();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		String pageTitle = "Register: Mercury Tours";                       //Store the hard coded Page Title to compare
		
		if(pageTitle.equals(driver.getTitle())){                        // Compare the opened Page title
			System.out.println("Register page is opened");	}
	 else{System.out.println("Incorrect page title displayed");	}
		}
	}

