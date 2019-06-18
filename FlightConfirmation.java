package mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mercury.base.TestBase;

public class FlightConfirmation extends TestBase{
	
	// Pagefactory or object repository
	@FindBy(xpath="//font[contains(text(),'has been booked')]")
	WebElement ticketBookedMessage;
	
	@FindBy(xpath="//table//tbody//tr//td//font[@color='#FFFFFF']")
	        //   //table//tbody//tr//td//font[contains(text(),'Flight')]
	WebElement flightConfirm;
	
	@FindBy(xpath="//table//tbody//tr//td//font[contains(text(),'Depart')]")
	WebElement deparConfirm;
	
	@FindBy(xpath="	//table//tbody//tr//td//font//b[contains(text(),'Acapulco to Acapulco')]")
	WebElement locationConfirm;

	
	@FindBy(xpath="//table//tbody//tr//td//font[contains(text(),'$44')]")
	WebElement ticketPriceConfirm;

	@FindBy(xpath="//table//tbody//tr//td//font[contains(text(),'$584')]")
	WebElement ticketPriceWithTaxConfirm;
	
	public FlightConfirmation(){
		PageFactory.initElements(driver, this);
	}	
	
	public String validateFlightConfirmationPageTitle() {
		return driver.getTitle();		
	}
	
	public FlightConfirmation verifyticketBookedMessage(){
		if (ticketBookedMessage.equals("has been booked")){
			System.out.println("Booking confirmed");
		}	else{
			System.out.println("Booking is not confirmed");
		}	
		return new FlightConfirmation();
	}
	
}
