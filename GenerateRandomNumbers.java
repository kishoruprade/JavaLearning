import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenerateRandomNumbers {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// Generate Random Numbers
		Random objGenerator = new Random();
		for (int i=0;i<10;i++){
			int randomNumber = objGenerator.nextInt(100);
			System.out.println(randomNumber);					
		}
		
		// One more method to generate the Random number
		for (int j=1; j<10;j++){
			System.out.println(Math.random());
		}
		
		
		// Capture the Screenshot using Selenium and store the file of each step
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		//Code to file store
		Files.getFileStore(Paths.get("C:\\ScreenShot")).getUsableSpace();
		//or iterate over
		FileSystems.getDefault().getFileStores();


		

	}

}
