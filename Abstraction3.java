abstract class Bank1
{
abstract int getRateOfInterest();	
}

class SBI1 extends Bank
{
public int getRateOfInterest()
{
return 7;	
}
}
class ICICI1 extends Bank
{
public int getRateOfInterest()
{
return 8;	
}
}
public class Abstraction3 {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("Interest rate of SBI: "+b.getRateOfInterest()+"%");
		Bank b1=new ICICI();
		System.out.println("Interest of ICICI: "+b1.getRateOfInterest()+"%");

	}

}
