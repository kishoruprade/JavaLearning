package interfacePackage;
class Ab
{
interface G
{
void m1();	
}
interface H
{
void m1();
void m2();
}
}
abstract class X1 implements Ab.G, Ab.H
{
	public void m1()
	{
		System.out.println("M1-method");
	}
}
class X2 extends X1
{
public void m2()
{
System.out.println("M2-method");	
}
}
public class InterfaceWithinClass {

public static void main(String[] args)
{
	X2 obj=new X2();
	obj.m1();
	obj.m2();
	
	Ab.G obj1=new X2();
	obj1.m1();
	
	Ab.H inst= new X2();
	inst.m1();
	inst.m2();

	}

}
