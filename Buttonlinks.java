package seleniumJavaExample;

import java.util.ArrayList;
import java.util.List;


import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//SeleniumJava_Class//Installables//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        WebElement hotels = driver.findElement(By.linkText("Hotels"));
        hotels.click();
        
   
     
      
      
      driver.quit();
	}

}
