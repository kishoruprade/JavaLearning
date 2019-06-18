package abstraction;
abstract class Shape
{
abstract  void draw();	
Shape()
{
System.out.println("this is the abstract class constuctor");	
}
void CutShape()
{
System.out.println("Cut the page according to the circle");	
}
final void PrintMessage()
{
System.out.println("You can't change this methods implementation");	
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("Drawing the circle");	
}

}
public class SimpleAbstraction {

	public static void main(String[] args) {
		Shape obj=new Circle();
		obj.draw();
obj.CutShape();

	}

}
