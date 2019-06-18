package mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mercury.base.TestBase;

public class SelectFlight extends TestBase{
	
	//Create Pagefactory elements OR Object repositories
	
	@FindBy(xpath="//table//tbody//td[@rowspan='2']//input")
	WebElement departureFlight;
	
	@FindBy(xpath="//input[@name='inFlight']")
	WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	WebElement continueSelectedFlight;
	
	public SelectFlight(){
		PageFactory.initElements(driver, this);
	}
	
	public String selectFlightPageTitle(){
	  return driver.getTitle();
	}
	
	public SelectFlight clickDepartureFlight()
	{
		departureFlight.click();
		return new SelectFlight();
	}	
	public SelectFlight clickReturnFlight(){
		returnFlight.click();		
		return new SelectFlight();
	}
	
	public BookFlight clickContinueFlight(){
		continueSelectedFlight.click();		
		return new BookFlight();
	}
	
	
}
