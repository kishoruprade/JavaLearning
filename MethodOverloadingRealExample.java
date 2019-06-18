class Bank
{
int getRateOfInterest()
{
return 0;	
}}
class SBI extends Bank
{
int getRateOfInterest()
{
return 8;	
}}
class ICICI extends Bank
{
int getRateOfInterest()
{
	return 7;
}
}

public class MethodOverloadingRealExample {

	public static void main(String[] args) 
	{
		SBI obj=new SBI();
		System.out.println("Rate of Interest for SBI: "+obj.getRateOfInterest());
		ICICI obj2=new ICICI();
		System.out.println("Rate of Interest of ICICI: "+obj2.getRateOfInterest());

	}

}
