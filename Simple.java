package abstraction;
abstract class Draw
{
	static int speedlimit=100;
	final int a=10;
	int b=100;
abstract void m1();	
public void m2()
{
System.out.println("Simple");	
}
}
class Process extends Draw
{
public void m1()
{
System.out.println("Implented method");	
}
}
public class Simple {

	public static void main(String[] args) {
		Draw obj=new Process();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(Draw.speedlimit);
		
		

	}

}
