package inheritance;
class Animal1
{
public void eat()
{
System.out.println("eating...");	
}
}


class Dog1 extends Animal1
{
public void bark()
{
System.out.println("Barking...");	
}
}


class BabyDog extends Dog1
{
public void weep()
{
System.out.println("weeping...");	
}
}


public class Multilevel {
public static void main(String[] args)
	{
	BabyDog inst=new BabyDog();
	inst.eat();
	inst.bark();
	inst.weep();
	
	Dog1 ref=new Dog1();
	ref.eat();
	ref.bark();
	
    Animal1 ref1=new Dog1();
    ref1.eat();
    
    Animal1 ref2=new BabyDog();
    ref2.eat();
    
  // BabyDog obj=new Dog1();
   // Dog1 obj1=new Animal1();
   // BabyDog obj2=new Animal1()
	}

}
