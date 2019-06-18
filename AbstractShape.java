abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw a rectangle");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing a circle");
	}
}
public class AbstractShape {

	public static void main(String[] args) {
		Shape obj1 = new Circle();
		Shape obj2 = new Rectangle();
		obj2.draw();
		obj1.draw();

	}

}
