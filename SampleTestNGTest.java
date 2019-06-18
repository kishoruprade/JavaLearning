package testNGPkg;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTest {
	public String baseURL = "https://www.irctc.co.in/nget/train-search";
	public String browserProperty = System.setProperty("webdriver.gecko.driver", "C:\\Users\\UpradeK\\Desktop\\SeleniumJava_Class\\Installables\\geckodriver.exe");
	public WebDriver driver ;
	
	@BeforeTest
	public void setBaseURL(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterTest
	public void endSession(){
		driver.quit();
	}
	 
	@BeforeMethod
  public void verifyHomePage() {
		String expectedTitle = "IRCTC Next Generation eTicketing System";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);		
  }
	@AfterMethod
	public void signOut(){
		System.out.println("After method will be implement lateer");
	}
	
	@Test
	public void userLogin(){
		driver.findElement(By.id("loginText")).click();
		WebElement username = driver.findElement(By.id("userId"));
		username.clear();
		username.sendKeys("kishor0488");
		WebElement password = driver.findElement(By.id("pwd"));
		password.clear();
		password.sendKeys("@Gondia1");
		String captchaVal = JOptionPane.showInputDialog(null, "Please enter the captcha value:");
		driver.findElement(By.id("nlpAnswer")).sendKeys(captchaVal); ////input[@id='nlpAnswer']
		driver.findElement(By.xpath("//button[@type='submit' and text()='SIGN IN']")).click();  //   $x("//input[@name='name']")
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='From*']")).sendKeys("gond");
	}
}
