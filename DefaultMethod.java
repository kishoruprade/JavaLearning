package abstraction;
interface drawable2
{
default void defaultMethod()
{
System.out.println("Default method");	
}
static void StaticMethod()
{
System.out.println("static method");	
}
void run();
}

public class DefaultMethod implements drawable2 {
	
	public void run()
	{
		System.out.println("Implemented method");
		
	}

	public static void main(String[] args) {
		DefaultMethod d1=new DefaultMethod();
		d1.defaultMethod();
		d1.run();
		drawable2.StaticMethod();
		

	}

}
