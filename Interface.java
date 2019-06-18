package abstraction;
interface printable
{
void print();
}
interface drawable extends printable
{
void draw();	
}
class A6 implements drawable
{
public void print()
{
System.out.println("Hello");	
}
public void draw()
{
System.out.println("Draw");
}
}
public class Interface {

	public static void main(String[] args) {
		A6 p1=new A6();
		p1.print();
	    p1.draw();

	}

}
