package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.w3schools.com/sql/sql_update.asp");
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		if (text.equals("Alfreds Futterkiste")){
			String text2 = driver.findElement(By.xpath("//table/tbody/tr[2]")).getText();
			System.out.println(text2);
		}
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		*/
		driver.get("http://newtours.demoaut.com/");
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("UpradeK");;
		
		driver.close();

	}

}
