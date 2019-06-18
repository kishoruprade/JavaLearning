package interfacePackage;
interface It
{
void m1();
void m2();
void m3();
}
abstract class Sample implements It
{
public void m1()
{
System.out.println("M1- method");	
}
}
abstract class Sample2 extends Sample
{
	public void m2()
	{
		System.out.println("M2- method");
	}
}
class Sample3 extends Sample2
{
public void m3()
{
System.out.println("M3- method");	
}
}

public class AccessInterface
{

	public static void main(String[] args)
	{
		Sample3 obj=new Sample3();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
