
public class MethodOverriding {
	public static void main(String[] args) {
		Bank b = new Bank();
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		Axis axis = new Axis();
		System.out.println("RBI Bank Rate of Interest min: "+b.getRateOfInterest());
		System.out.println("SBI Bank rate of Interest"+sbi.getRateOfInterest());
		System.out.println("ICICI Bank rate of Interest"+icici.getRateOfInterest());
		System.out.println("Axis Bank rate of Interest"+axis.getRateOfIntered());

	}

}
class Bank{
int getRateOfInterest(){
	return 0;
}}

class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest(){
		return 9;
	}
}
class Axis extends Bank{
	int getRateOfIntered(){
		return 7;
	}
}