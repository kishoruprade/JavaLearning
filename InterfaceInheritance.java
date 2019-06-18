interface drawable5
{
void draw();	
}
interface printable5 extends drawable5
{
void print();	
}
class A5 implements printable5
{
public void draw()
{
	System.out.println("Draw the circle");
}
public void print()
{
System.out.println("Print the circle");	
}
}
public class InterfaceInheritance {

	public static void main(String[] args) {
		A5 obj=new A5();
		obj.draw();
		obj.print();

	}

}
