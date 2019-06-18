package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.*;



public class SeleniumScriptTableRead {
	
	static String str = " ";
	static Point str1 ;
	static Dimension str2 ;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("UpradeK");
		driver.findElement(By.name("password")).sendKeys("UpradeK");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("findFlights")).click();
		
		WebElement table = driver.findElement(By.xpath("//table[@cellspacing=1][@cellpadding=2][@bgcolor='ffffff']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (WebElement row: allRows){
			List<WebElement> allCelldata = row.findElements(By.tagName("td"));
			
			for(WebElement cell: allCelldata)
				try {
					{
						System.out.print(cell.getText() + "\t");
						if (cell.getText().equals("7:10")){
							 str = row.getText();
							 str1 = row.getLocation();
							 str2 = row.getSize();
						
							 
							 File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
							 FileUtils.copyFile(src, new File("C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\Driver\\error1.png"));
							 
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println();
		}
	
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		driver.quit();
			
		}
	
}
