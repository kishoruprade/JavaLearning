package interfacePackage;
interface P
{
void m1();	
}
interface Q
{
void m2();	
}
interface R extends P,Q
{
void m3();	
}
class NewTry1 implements R
{
public void m1()
{
System.out.println("m1-Method");	
}
public void m2()
{
System.out.println("m2-Method");	
}
public void m3()
{
System.out.println("m3-Method");	
}
}
public class NewTry {

	public static void main(String[] args)
	{
		NewTry1 obj= new NewTry1();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
