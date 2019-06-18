package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
