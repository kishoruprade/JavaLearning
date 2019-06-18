package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe"); // setting the path of the chrome browser
		
		WebDriver driver=new ChromeDriver();    // Launching the browser
		
		driver.manage().window().maximize();  // maximize the window
		
		driver.get("https://login.yahoo.com/config/login");  // getting the URL
		
		//1. By xpath
		
		//driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("sharad"); 
		//driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		//2. ID
		
		//driver.findElement(By.id("login-username")).sendKeys("sharad");
		//driver.findElement(By.id("login-signin")).click();
		
		//3.name
		
		//driver.findElement(By.name("username")).sendKeys("sharad");
		//driver.findElement(By.name("signin")).click();
		
		//4. Link test
		
		//driver.findElement(By.linkText("Trouble signing in?")).click();
		
		//5.Partial Link Text
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//6. CSS selector
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("sharad");
		//driver.findElement(By.cssSelector("#login-signin")).click();
		
		// class name
		
		driver.findElement(By.className("phone-no ")).sendKeys("sharad");
		driver.findElement(By.className("orko-button-primary orko-button")).click();
		

	}

}
