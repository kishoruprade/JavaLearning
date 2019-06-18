abstract class Bike1
{
Bike1()
{
System.out.println("Bike is created");	
}
 abstract void run();
static void gearChange()
{
System.out.println("Gear changed");	
}
}
class Shine extends Bike1
{
public void run()
{
System.out.println("Bike is running safely");	
}
}
public class Abstraction4 {

	public static void main(String[] args) {
		//Bike1 b=new Shine();
		//b.run();
		//b.gearChange();
		Shine s=new Shine();
		s.run();
		Bike1.gearChange();

	}

}
