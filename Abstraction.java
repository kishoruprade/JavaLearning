abstract class Bike
{
abstract void run();

}

class Honda extends Bike
{
	void run()
{
System.out.println("Bike is running safely");	
}
}
public class Abstraction
{
public static void main(String [] args)
{
	Bike obj=new Honda();
	obj.run();
	
}
}
