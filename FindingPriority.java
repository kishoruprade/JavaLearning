package multipleTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FindingPriority {
  @Test(priority = 3, description="this is a test case for verify title")  // ascending order
  public void TC1() {	 
  }
  @Test(priority = 0, invocationCount=15)
  public void TC2() {	  
  }@Test(priority = -2)
  public void TC3() {	 
  }@Test(priority=-4, dependsOnMethods ={"SignIn"})
  public void TC4() {	 
  }@Test  // by default it is 0
  public void TC5() {
  }@Test(priority= 1)
  public void TC6() {	 
  }
  // @Parameters{"username","password"})
  @Test(priority= 3, dependsOnMethods={"TC1"}, enabled =false)  // Ensure depends on and priority which comes first
  public void TC7() {	
	  new SkipException(" arg0");
  }
  /*
   * public class Dependent
   * @Test(dependsOnMethods={"OpenBrowser"})
public void SignIn(){
System.out.println("This will execute second (SignIn)");}

@Test
public void OpenBrowsers(){
System.out.println("This will execute first(OpenBrowsers)");}

@Test(dependsOnMethods=SignIn
public void LogOut(){
System.out.println("This will execute third (LogOut)");}
   */
  
  
}
