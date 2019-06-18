/*
 * Test Case-1: 
1.	Open http://newtours.demoaut.com/mercuryregister.php
2.	To verify the page Title.
 */
package seleniumthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		String pageTitle = "Register: Mercury Tours";
	     
	     if (pageTitle.equals(driver.getTitle()))
	     {
	    		System.out.println("Validated Page Title. Page Title is: "+pageTitle);
	     }
	     else
	     {
	    	 System.out.println("Incorrect URL opened. Kindly, check the URL");
	     }	
	     
	     driver.get("http://newtours.demoaut.com/create_account_success.php?osCsid=c7fb86df90a023d88d1f9c9d68e48a98");
	     String s = " © 2005, Mercury Interactive (v. 011003-1.01-058)";
	     WebElement sText = driver.findElement(By.xpath("//div[contains(text(),'© 2005, Mercury Interactive (v. 011003-1.01-058)')]"));
	     if (s.equals(sText.getText())){
	    	 System.out.println("page appears");
	     }else{
	    	 System.out.println("page does not appears");
	     }
	     driver.close();
      //  	     © 2005, Mercury Interactive (v. 011003-1.01-058)

	}

}
