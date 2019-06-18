class Animal1
{
void eat()
{
System.out.println("Eating");	
}
}
class Dog1 extends Animal1
{
void bark()
{
System.out.println("Barking");	
}
}
class babyDog extends Dog
{
void weep()
{
	System.out.println("Weeping");
}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		babyDog obj=new babyDog();
		obj.weep();
		obj.bark();
		obj.eat();

	}

}
