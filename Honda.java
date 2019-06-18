package abstraction;
abstract class Bike
{
	Bike()
	{
		System.out.println("I am in parent class");
	}
public abstract   void run();
 
abstract void turnLeft();

 void breaking()
{
System.out.println("Stoping");	
}
 public static void main(String[] args)
 {
	 System.out.println("Hi it's static method from parent class");
 }

}
public class Honda extends Bike
{
	Honda()
	{
		super();
	}
public void run()
{
	System.out.println("Bike is running safely");
}
public void breaking()
{
System.out.println("Bike gets stop after applying brakes");	
}
public void turnLeft()
{
System.out.println("Bike is turning left but in child");	
}
public static void main(String[] args)
	{
	
	Honda ref=new Honda();
		ref.run();   
		ref.breaking();
		ref.turnLeft(); 
		System.out.println();
		
		
	   Bike obj=new Honda();
	   obj.run();          
	   obj.turnLeft();  
	   obj.breaking();
	   Bike.main(null);
	}

}
