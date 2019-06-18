package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	public static boolean isPresent(WebElement ele){
		boolean isPres = false;
		if(ele.isDisplayed()){
			isPres=true;			
		}
		return isPres;
	}
	public static boolean isClickable(WebElement ele){
		boolean isclick = false;
		if(ele.isEnabled()){
			isclick=true;
		}
		return isclick;		
	}
}
