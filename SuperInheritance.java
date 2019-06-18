class Person1
{
public void walk()
{
System.out.println("person is walking");	
}
}
class Man extends Person1
{
public void walk()
{
System.out.println("Man is walking faster");	
}
}
class Boy extends Man
{
public void walk()
{
System.out.println("Boy is walking slowly");	
}
public void methodCaller()
{
walk();
super.walk();
super.walk();
}
}
public class SuperInheritance {

	public static void main(String[] args) {
		Boy obj=new Boy();
		obj.methodCaller();

	}

}
