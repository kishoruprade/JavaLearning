package abstraction;
interface eatable
{
default void eat()
{
System.out.println("eating");	
}
void abstractMethod();
static void A1()
{
System.out.println("print the message");	
}
}
public class Test implements eatable
{
public void abstractMethod()
{
	System.out.println("Abstract method");
}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.eat();
		eatable.A1();
		obj.abstractMethod();
	}

}
