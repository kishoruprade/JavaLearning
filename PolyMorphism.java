package initial;
class Bike12
{
public void run()
{
System.out.println("Bike is running");	
}
}
class Splendor extends Bike12
{
public void run()
{
System.out.println("Splendor is running with very high speed");	
}
}
public class PolyMorphism {

	public static void main(String[] args) {
		Bike12 obj=new Bike12();
		obj.run();//Bike
		Splendor obj2=new Splendor();
		obj2.run();//splendor
		Bike12 obj3=new Splendor();// Parent reference can be used to store the child object.
		obj3.run();//splendor
		Splendor obj4=(Splendor) new Bike12();
		obj4.run();
	}

}
