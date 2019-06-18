class Animal12
{
public void eat()
{
System.out.println("eating...");	
}
}
class Dog12 extends Animal12
{
public void eat()
{
System.out.println("eating bread");	
}
		
}
public class MethodOverriding2 {

public static void main(String[] args) 
{
	
Dog12 obj=new Dog12();
obj.eat();
}

}
