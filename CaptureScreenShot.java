package takeScreenShot;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	
	@Test
	public static void captureScreenMethod() throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UpradeK\\Desktop\\Driver\\gecko.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		try{
			driver.get("https://www.softwaretestingmaterial.com");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile");
				
		}catch (Exception e){
			File screenShotFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			/*FileUtils.copyFile(screenShotFile, new File(C:\\Driver.png));
			
			
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		}*/
		driver.close();
		
		driver.quit();
		
		
	}

	}
}
