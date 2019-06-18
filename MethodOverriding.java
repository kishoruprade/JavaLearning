package polymorphism;
class Bank
{
public int getRateOfInterest() { return 0;}	
}
class SBI extends Bank
{
public int getRateOfInterset()
{
return 8;	
}
}
class ICICI extends Bank
{
public int getRateOfInterest()
{
return 9;	
}
}
class AXIS extends Bank
{
public int getRateOfInterest()
{
return 7;	
}
}

public class MethodOverriding {

	public static void main(String[] args)
	{
	
		SBI s=new SBI();
		System.out.println("Rate of Interest of SBI bank is: "+s.getRateOfInterset()+"%");
		ICICI i=new ICICI();
		System.out.println("Rate of Interest of AXIS bank is: "+i.getRateOfInterest()+"%");
		
		
	}

}
