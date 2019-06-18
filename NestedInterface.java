// we can define interface within the interface i.e.- Nested Interface
package interfacePackage;
interface L
{
	interface M
	{
	int m1();
	}
	interface N extends M
	{
		int m2();
	}
}
class SampleTry implements L.M,L.N
{
public int m1()
{
System.out.println("m1-method");	
return 10;
}
public int m2()
{
System.out.println("m2-method");	
return 10;
}
}
public class NestedInterface {

	public static void main(String[] args)
	{
		SampleTry obj=new SampleTry();
		obj.m1();
		obj.m2();

	}

}
