package seleniumthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		
		WebElement product = driver.findElement(By.id("Products"));
		action.contextClick();
		action.moveToElement(product);
		WebElement source = driver.findElement(By.id("source"));
		WebElement target = driver.findElement(By.id("target"));
		action.dragAndDrop(source, target);
		action.doubleClick();
		action.click(product);
		action.clickAndHold(product).dragAndDrop(source, target);
		action.doubleClick(product);
		action.build().perform();
		

	}

}
