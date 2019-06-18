package common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebBrowser {
	public static boolean verifyTitle(WebDriver driver, String title){
		boolean isMatch = false;
		if (driver.getTitle().equals(title)){
			isMatch=true;
		}
		return isMatch;
		
	}

}
