package Constructor;

class Parent
{
String name="Kalyan";	
public void property()
{
System.out.println("Property of papa is: Land,House, Cash");	
}
}

public class Child extends Parent
{
	String name="Sharad";
	public void dispalyName()
	{
		System.out.println("Parent name: "+name);
		System.out.println("Child name: "+super.name);
	}
	public void property()
	{
		System.out.println("Property of sharad is: Car, flat");
		
	}
	public void showProperty()
	{
		property();
		super.property();
		
	}
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.dispalyName();
		obj.showProperty();
		
		
	}
}

