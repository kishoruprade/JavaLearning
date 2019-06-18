package inheritance;
class Animal2
{
public void eat()
{
System.out.println("eating...");	
}
}


class Dog2 extends Animal2
{
public void bark()
{
System.out.println("Barking...");	
}	
}


class Cat extends Dog2
{
public void meow()
{
System.out.println("meowing...");	
}
}


public class Hierarchycal {

public static void main(String[] args)
{
Dog2 ref=new Dog2();
ref.eat();
ref.bark();

Cat inst=new Cat();
inst.eat();
inst.meow();

Animal2 ref1=new Dog2();
ref1.eat();

Animal2 ref2=new Cat();
ref2.eat();

//Dog2 inst1= new Animal2();
//Cat inst2=new Animal2();
}

}
