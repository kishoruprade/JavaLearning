package mercury.pages;

import mercury.base.TestBase;

public class HomePage extends TestBase{
	
	public String FlightConfirmation(){
		  return driver.getTitle();
		}    
	    
		
		public String validateFlightConfirmationPage() {
			return driver.getTitle();		
		}


}
