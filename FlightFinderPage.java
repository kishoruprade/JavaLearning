package mercury.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import mercury.base.TestBase;
import mercury.pages.*;

public class FlightFinderPage  extends TestBase{
		
	//Page Factory elements or Object Repositories
	@FindBy(xpath="//input[@value='oneway']")
	WebElement oneWay;
	
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement roundTrip;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passengers;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departFrom;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement onMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement onDate;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElement arrivingIn;
	
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement returnMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElement returnDate;
	
	@FindBy(xpath="//input[@value='Business' and @type='radio']")
	WebElement serviceClass;
	
	@FindBy(xpath="//select[@name='airline']")
	WebElement airline;
	
	@FindBy(name="findFlights")
	WebElement ContinueflightF; 
	
	@FindBy(xpath="//a[contains(text(),'SIGN-OFF')]")
	WebElement SignOff;
	
	public FlightFinderPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String searchFlightPageTitle(){
	  return driver.getTitle();
	}
	
	public FlightFinderPage clickTypeOneWay(){
		oneWay.click();
		return new FlightFinderPage();
	}
	
	public FlightFinderPage clickTypeRoundTrip(){
		roundTrip.click();	
		return new FlightFinderPage();
	}
		
	public  FlightFinderPage selectPassengersDropDown() {
	      Select passen = new Select(passengers);
	      passen.selectByValue("2");
	      return new FlightFinderPage();
	}
	
	public  FlightFinderPage selectDepartingFromDropDown() {
	      Select depFrm = new Select(departFrom);
	      depFrm.selectByValue("Frankfurt");
	      return new FlightFinderPage();
	      
	}
	
	public  FlightFinderPage selectOnMonthDropDown() {
	      Select onMnth = new Select(onMonth);
	      onMnth.selectByValue("2");
	      return new FlightFinderPage();
	}
 
	public  FlightFinderPage selectOnDateDropDown() {
	      Select ondate = new Select(onDate);
	      ondate.selectByValue("10");
	      return new FlightFinderPage();
	}
    
	public  FlightFinderPage selectArrivingInDropDown() {
	      Select arrIn = new Select(arrivingIn);
	      arrIn.selectByValue("London");
	      return new FlightFinderPage();
	}
    
	public  FlightFinderPage selectReturnMonthDropDown() {
	      Select returnMnth = new Select(returnMonth);
	      returnMnth.selectByValue("3");
	      return new FlightFinderPage();
	}
	
	public  FlightFinderPage selectReturnDateDropDown() {
	      Select returnDte = new Select(returnDate);
	      returnDte.selectByValue("10");  
	      return new FlightFinderPage();
	}  
    public FlightFinderPage clickServiceClass(){
	  serviceClass.click();
	  return new FlightFinderPage();
   }
    
    public  FlightFinderPage selectAirlineDropDown() {
	      Select airLine = new Select(airline);
	      airLine.selectByVisibleText("Blue Skies Airlines"); 
	      return new FlightFinderPage();
	}
   public SelectFlight continueFindFlights(){
	   ContinueflightF.click();	  
	   return new SelectFlight();
   }
  
    /*

      
 
    
    driver.findElement(By.xpath("//input[@value='Business' and @type='radio']")).click();
    
    Select airLine = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
    airLine.selectByVisibleText("Blue Skies Airlines");
    
    driver.findElement(By.name("findFlights")).click(); */
    

}
