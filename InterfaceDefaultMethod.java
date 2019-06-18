interface drawable4
{
void draw();
default void msg()
{
System.out.println("Welcome to SQS");	
}
}
class A2 implements drawable4
{
public void draw()
{
System.out.println("Draw the circle");	
}
public void draw(int a)

{
System.out.println("Parameter method");	
}
}
public class InterfaceDefaultMethod {

	public static void main(String[] args) 
	{
		A2 obj=new A2();
		obj.msg();
		obj.draw();
		obj.draw(10);
		
		
		
	}

}
