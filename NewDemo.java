package interfacePackage;
interface X
{void m1();	}
interface Y extends X
{void m2();	}
interface Z extends Y
{void m3();	}

class Try implements X
{
	public void m1()
{
System.out.println("M1-method");	
}
}
class Try1 extends Try implements Y
{
	public void m2()
	{
	System.out.println("M2- method");	
	}
}
class Try2 extends Try1 implements Z
{
	
	public void m3()
	{
	System.out.println("M3- method");	
	}
	
}
public class NewDemo {

	public static void main(String[] args)
	{
		Try obj=new Try();
		obj.m1();
		
		Try1 inst=new Try1();
		inst.m1();
		inst.m2();
		
	
		Try2 ref=new Try2();
		ref.m1();
		ref.m2();
		ref.m3();
		
		

	}

}
