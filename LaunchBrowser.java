package seleniumScripts;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Verify;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C://Users//UpradeK//OneDrive - SQS Group Limited//Desktop//SeleniumJava_Class//Installables//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
    	try {
        driver.findElement(By.name("userName")).sendKeys("UpradeK");
        driver.findElement(By.name("password")).sendKeys("UpradeK");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[@value='oneway']")).click();
        Select passenger = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        passenger.selectByValue("2");
        
        
        
        Select dep = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        dep.selectByValue("Frankfurt");
        
        Select frmmonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        frmmonth.selectByValue("2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Select frmDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        frmDay.selectByValue("10");
        
        Select arr = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        arr.selectByValue("London");
        
        
        Select toMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        toMonth.selectByValue("3");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Select toDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        toDay.selectByValue("10");
        
        driver.findElement(By.xpath("//input[@value='Business' and @type='radio']")).click();
        
        Select airLine = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        airLine.selectByVisibleText("Blue Skies Airlines");
        
        driver.findElement(By.name("findFlights")).click();
        
        driver.findElement(By.xpath("//table//tbody//td[@rowspan='2']//input")).click();
        
        driver.findElement(By.xpath("//input[@name='inFlight']")).click();
        driver.findElement(By.name("reserveFlights")).click();
        
        driver.findElement(By.name("passFirst0")).sendKeys("Kishor");
        driver.findElement(By.name("passLast0")).sendKeys("Uprade");
        
        Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
        meal.selectByVisibleText("Hindu");
        
        Select cardType = new Select(driver.findElement(By.name("creditCard")));
        cardType.selectByValue("AX");
        
        driver.findElement(By.name("creditnumber")).sendKeys("1234567869");
        
        Select carExpDt = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
        carExpDt.selectByVisibleText("09");
        
        Select carExpMon = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
        carExpMon.selectByVisibleText("2019");
        
        driver.findElement(By.name("cc_frst_name")).sendKeys("Kishor");
        driver.findElement(By.name("cc_mid_name")).sendKeys("Y");
        driver.findElement(By.name("cc_last_name")).sendKeys("Uprade");
        
        driver.findElement(By.name("billAddress1")).clear();
        driver.findElement(By.name("billAddress1")).sendKeys("1325 Borregas Ave. Kiwale");
        
        driver.findElement(By.name("billAddress2")).sendKeys("Pune 412101");
        
        driver.findElement(By.name("billCity")).clear();
        driver.findElement(By.name("billCity")).sendKeys("Sunnyvale");
        
        
        driver.findElement(By.name("billState")).clear();
        driver.findElement(By.name("billState")).sendKeys("CA");
        
        driver.findElement(By.name("billZip")).clear();
        driver.findElement(By.name("billZip")).sendKeys("94089");
        
        Select country = new Select(driver.findElement(By.name("billCountry")));
        country.deselectAll();
        country.selectByValue("215");
        
        driver.findElement(By.name("buyFlights")).click();
        Files.getFileStore(Paths.get("/home")).getUsableSpace();
		//or iterate over
		FileSystems.getDefault().getFileStores();
        
       
      if(driver.getPageSource().contains("itinerary has been booked")){
    	  System.out.println("Ticket is booked");
      }else{
    	  System.out.println("Ticket is not booked");
      }
      
    	} catch(Exception e){
    		
    		
    		System.out.println(driver.getTitle());
    	}               
        
        
        
        driver.close();
        
        
        
        
        
	}

}
