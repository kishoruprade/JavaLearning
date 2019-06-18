interface drawable
{
 void draw();	
}
class Circle3 implements drawable
{
public void draw()
{
System.out.println("Draw the circle");	
}
}
class Rectangle3 implements drawable
{
public void draw()
{
System.out.println("Draw the rectangle");	
}
}	

public class Interface2 {

	public static void main(String[] args) {
		drawable d=new Circle3();
		d.draw();
		drawable d1=new Rectangle3();
		d1.draw();

	}

}
