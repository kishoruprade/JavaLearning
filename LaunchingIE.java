package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


//Zensar/Altemetrik Interview question print the row if text matches in the browser

public class LaunchingIE
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//Driver//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/java-interface.html");
		System.out.println(driver.getTitle());
		
		String str = driver.findElement(By.xpath("//table//tbody//tr//td[contains(text(),'Class can contain')]")).getText();
		
		System.out.println(str);
		
		String row = driver.findElement(By.xpath("//table//tbody//tr[2]")).getText();
		if (str.contains("can")){
			System.out.println(row);
		}
		driver.close();

	}

}
