package seleniumScripts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooSignUp
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  // Launch browser
		
		driver.manage().window().maximize();  // Maximize window
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg"); // getting URL
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Sharad");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Pokale");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("SharadPokale11");
		driver.findElement(By.id("usernamereg-password")).sendKeys("11271093@Qtp");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("9764666819");
		
		Select sel=new Select(driver.findElement(By.id("usernamereg-month")));
		sel.selectByVisibleText("October");
		System.out.println("I am done");
		
		
		

	}

}
