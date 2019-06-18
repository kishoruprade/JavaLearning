package interfacePackage;
interface J
{
void m1();
void m2();
}
interface K 
{
void m2();	
void m1();
}
class NewSample1 implements J,K
{
public void m1()
{
System.out.println("m1- method");	
}
public void m2()
{
System.out.println("m1- method");	
}
}
public class NewSample
{

	public static void main(String[] args)
	{
		NewSample1 obj=new NewSample1();
		obj.m1();
		obj.m2();

	}

}
