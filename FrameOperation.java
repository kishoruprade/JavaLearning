package seleniumthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameOperation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		Actions action = new Actions(driver);
		
		driver.get("http://www.google.com");
		String loginTitle = "Login";
		if(loginTitle.equals(driver.getTitle())){
			WebElement username = driver.findElement(By.id("username"));
			elementCommon(username,"username");	
			elementCommon(driver.findElement(By.id("pass")),"password");
			//elementCommon()
			elementClick(driver.findElement(By.id("submit")),"login");
			}
		else{
			System.out.println("login page does not appears");
		}	
		
	
		driver.findElement(By.id("clientName")).equals("Client");
		driver.findElement(By.linkText("FundTransfer")).isDisplayed();
		
		driver.findElement(By.linkText("Balance")).isDisplayed();
		driver.findElement(By.id("Balance")).click();		
	}
	public static void elementCommon(WebElement ele, String elementName){
		if(ele!=null){
			if(ele.isDisplayed()){
				{
					if(ele.isEnabled()){
						
					}else
					{
						System.out.println(elementName+"is disbaled");
					}
				}
				
			}
			else{
				
				System.out.println(elementName+"is not displayed");
			}
			
		}else {
			System.out.println(elementName+"is null");
		}
	}
		public static void elementClick(WebElement ele, String elementClick){
			if(ele!=null){
				if(ele.isDisplayed()){
					{
						if(ele.isEnabled()){
							
						}else
						{
							System.out.println(elementClick+"is disbaled");
						}
					}
					
				}
				else{
					
					System.out.println(elementClick+"is not displayed");
				}
			}
				
			else {	System.out.println("");	}
		}
			public static void elementFrame(WebElement ele, String defaultFrame){
				if(ele!=null){
					if(ele.isDisplayed()){
						{
							if(ele.isEnabled()){
								
							}else
							{
								System.out.println(defaultFrame+"is disbaled");
							}
						}
						
					}
					else{
						
						System.out.println(defaultFrame+"is not displayed");
					}
					
				}else {
					System.out.println(defaultFrame+"is null");
				}
				
	}	
	

}
