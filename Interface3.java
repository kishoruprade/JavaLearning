interface drawable3
{
void draw();	
}
interface showable
{
void show();	
}
class A7 implements drawable,showable
{
public void draw()
{
System.out.println("Draw the picture");	
}
public void show()
{
System.out.println("Show the picture");	
}
}
public class Interface3 {

	public static void main(String[] args) {
		A7 obj=new A7();
		obj.draw();
		obj.show();

	}

}
