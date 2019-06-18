package interfacePackage;
interface It6
{
	
//private void m1();
default void m2()
{
System.out.println("I am in default method");	
}
public static int cube(int x)
{
return x*x*x;	
}

}

public class DefaultMethod implements It6
{
public void m1()
{
System.out.println("m1-method");	
}
	public static void main(String[] args)
	{
	  DefaultMethod obj=new DefaultMethod();
	  obj.m1();obj.m2();
	  System.out.println(It6.cube(2));

	}

}
