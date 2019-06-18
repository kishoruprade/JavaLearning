package testAutoThon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ThroughWebApp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\chrome\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement ele =   driver.findElement(By.name("q"));
		ele.sendKeys("91mobiles");
		ele.sendKeys(Keys.ENTER);
		WebElement nxtab = driver.findElement(By.xpath("//h3[text()='91Mobiles']"));
		nxtab.click();
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		
		driver.findElement(By.id("autoSuggestTxtBox")).sendKeys("Samsung Galaxy M40");
		
		
		String oldTab = driver.getWindowHandle();
		
		
		driver.close();
		

	}

}
