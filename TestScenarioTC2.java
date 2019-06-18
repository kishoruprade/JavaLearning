package seleniumthree;
/*
 * Test Case-2:  
1.	Open webpage https://seleniumqtpautomation.000webhostapp.com/final.html
2.	Enter Your Name on text box.
3.	Enter Your Password on text box.
4.	Enter Your Confirm Password on text box.
5.	Click on Submit button
6.	Enter Your Name on text box.
7.	Enter Your Last name on text box.
8.	Enter Your  Date Of Birth
9.	Enter Your Email ID.
10.	Enter Your Mobile Number.
11.	Select  Gendar.
12.	Click on Next Button.
13.	Enter Your Address.
14.	Enter Your City.
15.	Enter Your Pin Code.
16.	Enter Your State.
17.	Select Your Country.
18.	Click On next Button.
19.	Select your Hobbies.
20.	Click on register button.
21.	Verify your welcome page.

The client has requested you to use WebDriver (Firefox Driver) for the project. Go ahead and write the script in Webdriver.

 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TestScenarioTC2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//UpradeK//Desktop//SeleniumJava_Class//Installables/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//1. Open the URL with web address
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");     //Access the URL
		String pageTitle = "Register page";                       //Store the hard coded Page Title to compare
		if(pageTitle.equals(driver.getTitle())){                        // Compare the opened Page title
			System.out.println("Register page is opened");	
		   }else{System.out.println("Incorrect page title displayed");	}
		
		//2. Validate the username and Enter username
		WebElement username = driver.findElement(By.name("name"));
		commonTxtInputValidat(username,"name","Kishor");
					
		//3. Validate the password and Enter password
		WebElement password = driver.findElement(By.name("password"));
		commonTxtInputValidat(password,"password","kishor");
							
		//4. Validate the confirm password and Enter confirm password
		WebElement confirmPassword = driver.findElement(By.name("confirmpassword"));
		commonTxtInputValidat(confirmPassword,"confirmpassword","kishor");
					
		//5. Validate the submit button and click to proceed
		WebElement submit = driver.findElement(By.name("insert"));
		commonClickVal(submit,"insert");
			
		//6. Validate the First name and Enter first name
		WebElement firstName = driver.findElement(By.name("First_Name"));
		commonTxtInputValidat(firstName,"First_Name","Kishor");
		
		//7. Validate the Last Name and Enter Last Name
		WebElement lastName = driver.findElement(By.name("Last_Name"));
		commonTxtInputValidat(lastName,"Last_Name","Uprade");
		
		//8. Validate the Date of Birth and Set date of birth
	     Select selectDate = new Select(driver.findElement(By.name("Birthday_day")));
	     selectDate.selectByValue("21");
	     Select selectMonth = new Select(driver.findElement(By.name("Birthday_Month")));
	     selectMonth.selectByValue("April");
	     Select selectYear = new Select(driver.findElement(By.name("Birthday_Year")));
	     selectYear.selectByValue("1988");
	     
	     //9. Validate the email id and enter email
	     WebElement emailId = driver.findElement(By.name("Email_Id"));
		commonTxtInputValidat(emailId,"Email_Id","kishoruprade@gmail.com");
		
		//10. Validate the mobile number and enter mobile number
		WebElement mobileNum = driver.findElement(By.name("Mobile_Number"));
		commonTxtInputValidat(mobileNum,"Mobile_Number","9730986914");
				
		//11. Validate the option button and select Gender Male
		WebElement gender = driver.findElement(By.name("Gender"));
		commonClickVal(gender,"Gender");
			
		//12. Click on next button to proceed
		WebElement next = driver.findElement(By.name("insert"));
		commonClickVal(next,"insert");
		
		//13. Validate the address field and enter address
		WebElement address = driver.findElement(By.name("Address"));
		commonTxtInputValidat(address,"Address","Hello123 1234 Pune");
			
		//14. Validate the City and enter city name Pune
		WebElement city = driver.findElement(By.name("City"));
		commonTxtInputValidat(city,"City","Pune");

		//15. Validate the City Pin Code and enter pincode
		WebElement pinCode = driver.findElement(By.name("Pin_Code"));
		commonTxtInputValidat(pinCode,"Pin_Code","411057");
		
		//16.Validate the State and Enter state name 
		WebElement state = driver.findElement(By.name("State"));
		commonTxtInputValidat(state,"State","Maharashtra");
		
		//17. Select a country from dropdown
		Select country = new Select(driver.findElement(By.name("Country")));
		country.selectByValue("IN");
		
		//18. Validate the next button and click to proceed
		WebElement next3 = driver.findElement(By.name("insert"));
		commonClickVal(next3,"insert");
		
		//19. Validate the check boxes and check the hobbies checkboxes
		WebElement drawing = driver.findElement(By.name("Hobby_Drawing"));
		commonClickVal(drawing,"Hobby_Drawing");
		
		WebElement singing = driver.findElement(By.name("Hobby_Singing"));
		commonClickVal(singing,"Hobby_Singing");
		
		//20. Click on register button to proceed
		WebElement register = driver.findElement(By.name("insert"));
		commonClickVal(register,"insert");
		
		//21. Verify the welcome page
		String login = "Login page";
		if (login.equals(driver.getTitle())){
			System.out.println("21.	Verify your welcome page.");
		}else {
			System.out.println("Invalid page displayed");
		}
	}
	
	public static void commonTxtInputValidat(WebElement ele, String elementName, String inputTxt){
      if(ele!=null){
    	  if(ele.isDisplayed()){
    		  if(ele.isEnabled()){
    			  ele.sendKeys(inputTxt);
    			  
    	  }else{System.out.println(elementName+"is not enabled"); 		  }    		  
    	  }else{System.out.println(elementName+"is not displayed");}  
    	  }else{System.out.println(elementName+"is not null"); }
      
      }
	 public static void commonClickVal(WebElement btn, String clickButton){
   	  if (btn.isDisplayed()){
   		  if (btn.isEnabled()){
   			  btn.click();  			  
   		  }else{System.out.println(clickButton+"is not clickable"); }		  
   	  }else{System.out.println(clickButton+"is not displayed"); }
	}
	 
		
}
