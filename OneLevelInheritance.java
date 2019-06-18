package inheritance;
class Parent
{
	Parent()
	{
		System.out.println("Parent class Constructor");
		
	}
public void home()
{
System.out.println("Parent has home");	
}
}



class Child extends Parent
{
	Child()
	{
		System.out.println("Child class constructor");
	}
public void car()
{
System.out.println("Child has a car");	
}
}



public class OneLevelInheritance {

	public static void main(String[] args)
	
	{
	   Child obj=new Child();
	   obj.home();
	   obj.car();
  
	}

}
