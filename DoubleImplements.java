// We can implements interface as many times as we want by using a separate class.

package interfacePackage;
interface Jk
{
void m1();	
}
class Md implements Jk
{
	public void m1()
	{
		System.out.println("M1-method");
	}
}
class Md1 implements Jk
{
	public void m1()
	{
		System.out.println("M1-method");
	}
}
public class DoubleImplements {

	public static void main(String[] args)
	{
		 Md1 obj= new  Md1();
		 obj.m1();
		 
		 Md ref=new  Md();
		 ref.m1();

	}

}
