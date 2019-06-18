package mercury.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import mercury.util.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;               //Create static global variable for WebDriver interface
	public static Properties prop;                //Create one more static variable for Properties - It is used for HashMap key and value pair
	
	public TestBase(){             //Java Constructor concept is used here
		try {			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C://Users//UpradeK//workspace//MercuryToursTest//src//main//java//mercury//config//config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	public static void intialization(){
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")|| browsername.equals("Chrome")){
			 ChromeOptions options = new ChromeOptions();					 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\New folder\\chromedriver.exe");
			driver = new ChromeDriver(options);			
		}		
		else if(browsername.equals("Mozilla")|| browsername.equals("Firefox") || browsername.equals("firfox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}		
		else if(browsername.equals("IE")|| browsername.equals("InternetExplorer")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));		
	}	

}
