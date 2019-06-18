interface RBIBank {
	float rateOfInterest();
}
class SBIBank implements RBIBank{
	public float rateOfInterest(){return 9.15f;}
}
class ICICIBank implements RBIBank{
	public float rateOfInterest(){return 8.15f;}
}
public class InterfaceBank {

	public static void main(String[] args) {
	RBIBank obj = new ICICIBank();
	System.out.println("Rate of Interest "+obj.rateOfInterest());

	}

}
