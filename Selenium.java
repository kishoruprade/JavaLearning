package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UpradeK\\Desktop\\Driver\\chrome.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/form/input[1]")).sendKeys("abc");
		
		
		//driver.findElement(By.name("confirmpassword")).sendKeys("123");
		//driver.findElement(By.name("insert")).click();
		driver.close();

	}

}
