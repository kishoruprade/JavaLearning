package multiThreadPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class MultiThread {

	// Run this below program it will open all three sessions in 3 browsers
	
	
	@Test
	public void launchingChrome(){
		System.setProperty("Webdriver.chrome.driver", "C:/Users/UpradeK/OneDrive - SQS Group Limited/Desktop/Automation/Installables/chromedriver_win32/chromercriver");
		WebDriver chrome = new ChromeDriver();
		chrome.get("http://www.google.com");
	}

	@Test
	public void launchingFirfox(){
		System.setProperty("Webdriver.gecko.driver", "C:/Users/UpradeK/OneDrive - SQS Group Limited/Desktop/Automation/Installables/chromedriver_win32/geckodriver");
		DesiredCapabilities capabilties = DesiredCapabilities.firefox();
		WebDriver firefox = new FirefoxDriver();
		firefox.get("http://www.google.com");
	}

}
