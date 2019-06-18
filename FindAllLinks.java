package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {

	public static void main(String[] args) {	
		
		System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Automation\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		
		

	}

}
