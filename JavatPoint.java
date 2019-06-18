package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavatPoint {

	public static void main(String[] args) {			
		System.setProperty("webdriver.ie.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\IEDriverServer.exe");
		//ChromeOptions options = new ChromeOptions();
		WebDriver driver = new InternetExplorerDriver();		
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Java')]")).click();
		
		
		ArrayList<WebElement> leftlink = new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='leftmenu']//a")));
		
		WebDriverWait wait  = new WebDriverWait(driver, 3);
		
		
		
		for (WebElement ele: leftlink){
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			ele.click();
			
		}
		
		driver.quit();
	}
}
