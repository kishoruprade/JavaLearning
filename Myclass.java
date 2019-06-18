package testNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Myclass {
	
	
	public static String baseURL = "http://newtours.demoaut.com/";
	public static String propertyBrowser = System.setProperty("webdriver.gecko.driver", "C:\\Users\\UpradeK\\Desktop\\SeleniumJava_Class\\Installables\\geckodriver.exe");
   public static WebDriver driver = new FirefoxDriver();
   
	public static void main(String[] args) {
		
		driver.get(baseURL);
		verifyHomePageTitle();
		WebDriver ele = new InternetExplorerDriver();
		WebDriver driver = new FirefoxDriver();
		ChromeDriver ch =  new ChromeDriver();

	}
	public static void verifyHomePageTitle(){
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		try{
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Passed");
		}catch(Throwable e){
			System.out.println("Test Failed");
			
		}
		driver.quit();
	}

}
