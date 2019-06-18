package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/UpradeK/workspace/FreeCRMTest2/src/main/java/com/crm/"
					 +"qa/config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		
		}		
	}
	public static void initialization(){
		String browserName =  prop.getProperty("browser");
		if (browserName.equals("chrome") || browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//Automation//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
		}else if  (browserName.equals("FF") || browserName.equalsIgnoreCase("Firefox") || browserName.equalsIgnoreCase("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", "C://Users/UpradeK//OneDrive - SQS Group Limited//Desktop//Automation//Driver//geckodriver.exe");
			driver =  new FirefoxDriver();
		}else if(browserName.equals("IE") || browserName.equalsIgnoreCase("Internet Explorer")){
			System.setProperty("webdriver.IEDriverServer.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//Automation//Driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}


