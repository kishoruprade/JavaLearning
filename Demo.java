package interfacePackage;
interface A
{
void m1();	
void m2();
}
interface B extends A
{
void m2();

}
abstract class Demo1 implements B
{
public void m1()
{
System.out.println("m1-method");	
}
}
class Demo2 extends Demo1
{
public void m2()
{
System.out.println("m2- method");	
}
		}
public class Demo
{

	public static void main(String[] args)
	{
		Demo2 obj=new Demo2();
		obj.m1();
		obj.m2();
		
				

	}

}
