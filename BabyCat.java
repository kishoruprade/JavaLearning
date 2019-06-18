package initial;
class Animal
{
void eat()
{
System.out.println("Eating");
}}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("eating meat");
		
	}
	}

public class BabyCat extends Cat {

	public static void main(String[] args) 
	{
		
Animal obj=new BabyCat();
obj.eat();

	}
	}


