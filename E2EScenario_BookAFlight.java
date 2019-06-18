package mercury.test;


import org.testng.annotations.Test;

import mercury.base.TestBase;
import mercury.pages.*;
import mercury.pages.SelectFlight;
import mercury.pages.FlightFinderPage;
import mercury.pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class E2EScenario_BookAFlight extends TestBase {
	
	public static LoginPage loginPage;
	public static FlightFinderPage flightfinder;
	public static SelectFlight selectFlight;
	public static BookFlight bookFlight;
	public static FlightConfirmation flightConfirmation;
	public static HomePage homePage;
	
	
	public E2EScenario_BookAFlight(){
		super();
	}
	
	@Test(priority=1)
	public void loginTest() {
		
		flightfinder = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String flightFinder = flightfinder.searchFlightPageTitle();
		Assert.assertEquals(flightFinder, "Find a Flight: Mercury Tours:");
     	flightfinder.clickTypeOneWay();
		flightfinder.selectDepartingFromDropDown();
		flightfinder.selectOnMonthDropDown();
		flightfinder.selectOnDateDropDown();
		flightfinder.selectArrivingInDropDown();
		flightfinder.selectReturnDateDropDown();		
		flightfinder.selectReturnDateDropDown();
		flightfinder.clickServiceClass();
		flightfinder.selectAirlineDropDown();	
		
		
		selectFlight = flightfinder.continueFindFlights();	
		String selectFlightP = selectFlight.selectFlightPageTitle();
		Assert.assertEquals(selectFlightP, "Select a Flight: Mercury Tours");
		selectFlight.clickDepartureFlight();
		selectFlight.clickReturnFlight();
		
		
		bookFlight = selectFlight.clickContinueFlight();
		String bookFlightDetails = bookFlight.validateBookFlightTitle();
		Assert.assertEquals(bookFlightDetails, "Book a Flight: Mercury Tours");	
	
		bookFlight.enterPassengerName();
		bookFlight.selectMealTypeDropDown();
		bookFlight.enterCreditCardDetails();
		bookFlight.enterBillingAddress();
		bookFlight.enterDeliveryAddress();
		
		
		flightConfirmation = bookFlight.securePurchase();
		String flightConfirmationPage = flightConfirmation.validateFlightConfirmationPageTitle();
		Assert.assertEquals(flightConfirmationPage, "Flight Confirmation: Mercury Tours");		
		
		
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  intialization();
		loginPage = new LoginPage();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
