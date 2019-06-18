package seleniumthree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumThree {
	 static final int  MIN_AGE = 18;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UpradeK\\Desktop\\Driver\\chromedriver.exe");
		//   C:\Users\UpradeK\Desktop\Driver
		
		WebDriver driver = new ChromeDriver();
		
		//Test Case 1.1
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		//Test Case 1.2
	     String s = driver.getTitle();
	     
	     if (s.equals("Register: Mercury Tours"))
	     {
	    		System.out.println("Page Title is: "+s);
	     }
	     else
	     {
	    	 System.out.println("Incorrect URL opened. Kindly, check the URL");
	     }
	 
	     //Test Case 2.1
	     driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
		driver.quit();
	

	}

}
