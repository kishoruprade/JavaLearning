package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyTheTableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
		WebElement mytab = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]"));
		
		String text = mytab.getText();
		
		if (text.equals("Atlanta to Las Vegas")){
		
		System.out.println(text);
		}else
		{
			System.out.println("Elements not found");
		}
		int index = 3;
		driver.get("https://www.guru99.com/java-date.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    WebElement ele =  driver.findElement(By.xpath("//table[@class='table table-striped']"));
	    List<WebElement> tableRows = ele.findElements(By.tagName("tr"));
	    
		if(tableRows.contains("Year")){
	    System.out.println(tableRows.get(3).getText());
		}		
		driver.quit();

	}

}
