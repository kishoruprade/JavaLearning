
public class Encapsulation {
	private double pie = 3.14;
	public double getPI(){
		return pie;
	}
   
}
 class AccessEncapulation extends Encapsulation{
	 Encapsulation obj = new Encapsulation();
	// obj.getPI();//
 }
