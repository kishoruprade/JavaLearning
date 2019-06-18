abstract class Shape
{
abstract void draw();	
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Drwing the circle");	
}
}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("Drawing the rectangle");	
}
}
public class Abstraction2 {

	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
		Shape s1=new Rectangle();
		s1.draw();

	}

}
