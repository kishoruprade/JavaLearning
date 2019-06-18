package mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import mercury.base.TestBase;

public class BookFlight extends TestBase {

	@FindBy(name="passFirst0")
	WebElement firstName;
		
	@FindBy(name="passLast0")
	WebElement lastName;
	
	@FindBy(name="pass.0.meal")
	WebElement mealType;
		
	@FindBy(name="creditCard")
	WebElement creditCardType;
	
	@FindBy(name="creditnumber")
	WebElement creditCardNo;	

	@FindBy(name="cc_exp_dt_mn")
	WebElement creditCardExpMonth;
	
	@FindBy(name="cc_exp_dt_yr")
	WebElement creditCardExpYear;
	
	@FindBy(name="cc_frst_name")
	WebElement creditCardFirstName;
	
	@FindBy(name="cc_mid_name")
	WebElement creditCardMiddleName;
	
	@FindBy(name="cc_last_name")
	WebElement creditCardLastName;

    @FindBy(name="billAddress1")
   WebElement billAddressOne;	
	
	@FindBy(name="billAddress2")
	WebElement billAddressTwo;
	
	@FindBy(name="billCity")
	WebElement billCity;
	
    @FindBy(name="billState")
    WebElement billStat;
		
    @FindBy(name="billZip")
    WebElement billZip;   

    @FindBy(name="delAddress1")
   WebElement delAddressOne;	
	
	@FindBy(name="delAddress2")
	WebElement delAddressTwo;
	
	@FindBy(name="delCity")
	WebElement delCity;
	
    @FindBy(name="delState")
    WebElement delStat;
		
    @FindBy(name="delZip")
    WebElement delZip;
    
    @FindBy(name="buyFlights")
    WebElement securePurchase;    

	public BookFlight(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateBookFlightTitle(){
	  return driver.getTitle();
	}    
    
	public BookFlight enterPassengerName(){
	firstName.sendKeys("Kishor");
	lastName.sendKeys("Uprade");
	return new BookFlight();
	}
	
	public BookFlight selectMealTypeDropDown(){
		Select mealTyp = new Select(mealType);
		mealTyp.selectByVisibleText("Hindu");
		return new BookFlight();
		}    
	
	public BookFlight enterCreditCardDetails(){
		Select ccType = new Select(creditCardType);
		ccType.selectByValue("AX");
		Select cardExpMon = new Select(creditCardExpMonth);
		cardExpMon.selectByVisibleText("09");
		Select cardExpYr = new Select(creditCardExpYear);
		cardExpYr.selectByVisibleText("2009");	
		creditCardNo.sendKeys("1234567869");
		creditCardFirstName.sendKeys("Kishor");
		creditCardMiddleName.sendKeys("Y");
		creditCardLastName.sendKeys("Uprade");
		return new BookFlight();
	}
	
	public BookFlight enterBillingAddress(){
		billAddressOne.clear();
		billAddressOne.sendKeys("1325 Borregas Ave. Kiwale");
		billAddressTwo.clear();
		billAddressTwo.sendKeys("Pune 412101");	
		billCity.clear();
		billCity.sendKeys("Sunnyvale");
		billStat.clear();
		billStat.sendKeys("CA");
		billZip.clear();
		billZip.sendKeys("903832");
		return new BookFlight();
	}
	
	
	public BookFlight enterDeliveryAddress(){
		delAddressOne.clear();
		delAddressOne.sendKeys("1325 Borregas Ave. Kiwale");
		delAddressTwo.clear();
		delAddressTwo.sendKeys("Pune 412101");	
		delCity.clear();
	    delCity.sendKeys("Sunnyvale");
		delStat.clear();
		delStat.sendKeys("CA");
		delZip.clear();
		delZip.sendKeys("903832");
		return new BookFlight();
	}
	
	
	public FlightConfirmation securePurchase(){
		securePurchase.click();
		return new FlightConfirmation();
	}
	

}
