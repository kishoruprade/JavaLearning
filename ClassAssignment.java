/*
 * Assignment to complete the 5 pages using common 
 */

package seleniumthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\Desktop\\SeleniumJava_Class\\Installables\\chromedriver.exe");
		// C:\Users\UpradeK\Desktop\SeleniumJava_Class\Installables
		// C:\Users\UpradeK\Desktop\SeleniumJava_Class\Installables
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		driver.manage().window().maximize();
		String title = "Register page";
	///	Assert.assertEquals(driver.getTitle());  - need TestNG
		if(title.equals(driver.getTitle())){
			driver.findElement(By.name("name")).sendKeys("Kishor");
			driver.findElement(By.name("password")).sendKeys("Kishor");
			driver.findElement(By.name("confirmpassword")).sendKeys("Kishor");
			driver.findElement(By.name("insert")).click();
			driver.findElement(By.name("First_Name")).sendKeys("Kishor");
			driver.findElement(By.name("Last_Name")).sendKeys("Kishor");
			WebElement date = driver.findElement(By.id("Birthday_Day"));
			date.click();	
			Select dropdown = new Select(driver.findElement(By.id("Birthday_Day")));
			
			
			//driver.close();			
		}else{
			System.out.println("Login page does not appears");
		}
		
		
	}
	public static void elementLogin(WebElement ele, String elementName){
		if(ele!=null){
			if (ele.isDisplayed()){
				if(ele.isEnabled()){
					
				}else{
					System.out.println(elementName+"is not enable");
				}
				
				
			}else{
				System.out.println(elementName+"is not displayed");
			}
			
		}
		else{
			System.out.println(elementName+"is not found");
		}
	}

}
