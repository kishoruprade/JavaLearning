package abstraction;
abstract class Vehicle
{
abstract void run();	
}
abstract class Aeroplane
{
abstract void run();	
}
public class MultipleInheritance extends Vehicle
{
public void run()
{
System.out.println("Speed limit is 40 kph");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
