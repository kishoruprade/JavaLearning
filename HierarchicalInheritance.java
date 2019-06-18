class Animal2
{
void eat()
{
System.out.println("Eating");	
}
}
class Dog2 extends Animal2
{
void bark()
{
System.out.println("Barking");	
}
}
class Cat extends Animal2
{
void meow()	
{
	
System.out.println("meowing");
}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.meow();
		obj.eat();
		
		
		Dog obj1=new Dog();
		obj1.bark();
		obj1.eat();

	}

}
