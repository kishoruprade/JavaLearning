package abstraction;
abstract class Vehicle23
{
abstract void run();	
}

public class Bike12 extends Vehicle23 
{
public void run()
{
System.out.println("Speed is 40km/hr");	
}
public void stop()
{
System.out.println("Stopping the bike");	
}
public static void main(String[] args)
{
	Vehicle23 obj=new Bike12();
	obj.run();
	
	Bike12 ref=new Bike12();
	ref.run();
	ref.stop();
	
	
}

}
