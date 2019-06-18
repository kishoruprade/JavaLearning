package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FindAllLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\UpradeK\\Desktop\\SeleniumJava_Class\\Installables\\IEDriverServer.exe");
		
		// Driver\chromedriver_win32(1)
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for(WebElement link2: link)
		{
			//print the links i.e. http://google.com or https://www.gmail.com
			System.out.println(link2.getAttribute("href")); 
			
			//print the link Text
			System.out.println(link2.getText());
		}		
		


	}

}
