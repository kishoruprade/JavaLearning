package multipleTestNG;

import org.testng.annotations.Test;

public class A extends BaseClass{
  
	@Test(priority = 1)
  public void TC1() {
	  System.out.println("in TC1");
  }
	@Test(priority = 2)
  public void TC2() {
	  System.out.println("in TC2");
  }
	@Test(priority = 3)
	public void TC3(){
	//	int a;
		System.out.println("in TC3");
	}
}
