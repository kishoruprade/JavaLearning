package initial;
class Bank
{
float getRateOfInterest()
{
return 0;	
}
}
class SBI extends Bank
{
float getRateOfInterest()
{
return 7.8f;	
}
}
class AXIS extends Bank
{
float getRateOfInterest()
{
return 8.5f;	
}
}
public class BankRealUse {

	public static void main(String[] args) {
	  Bank b;
	  b=new SBI();
	  System.out.println("SBI rate of Interest: "+b.getRateOfInterest()+"%");
      
	  b=new AXIS();
	  System.out.println("Axis rate of interest: "+b.getRateOfInterest()+"%");
	}

}
