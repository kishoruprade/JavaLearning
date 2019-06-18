package inheritance;
class Animal
{
public void eat()
{
System.out.println("Eating...");	
}}




class Dog extends Animal
{
public void bark()
{
System.out.println("Barking...");	
}}




public class SingleInheritance {

	public static void main(String[] args)
	
	{
	  
	  Dog ref=new Dog(); // All the methods and properties of the parent class are available by default to the child class
	  ref.eat();
	  ref.bark();
	  
	  Animal ref1=new Animal(); // Whatever methods child has by default not available to the parent, hence on the parent reference we can't call child specific methods.
	  ref1.eat();
	  //ref.bark();
	  
	  Animal inst=new Dog(); // PArent reference can be used to hold child objects and hence we can call only parent specific methods and not child specific methods
	  inst.eat();
	  //inst.bark();
	  
	 // Dog inst1=new Animal(); // Here child reference can't hold parent object. Because, every child has a parent, but not we are 100% sure that every parent has a child, rule of inheritance
 	  
	}

}
