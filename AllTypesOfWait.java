package seleniumJavaExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllTypesOfWait {

	public static void main(String[] args) {
		
		boolean b = true;
		boolean bw = false;
		System.out.println(b==bw);
		
		
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//SeleniumJava_Class//Installables//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);  // Implicit wait       
        System.out.println(driver.getTitle());
        String loginPageOne = driver.getTitle();
        
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        ele.click();
        
              
        System.out.println(driver.getTitle());
        String loginPageTwo = driver.getTitle();
        
        System.out.println(loginPageOne ==loginPageTwo);
        
        if(loginPageOne==loginPageTwo)
        {
        	System.out.println("Both are difference");
        }        else{
        	System.out.println("both are same");
        }
        
 
        
        
        driver.close();
        
  
        

	}

}
