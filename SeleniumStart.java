import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumStart {
	//WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/UpradeK/Desktop/Automation/Automation SetUp/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		        
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		
	}

}
