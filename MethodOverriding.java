class Parent
{
	
void property()
{
System.out.println("Gold");	
}
}
class Child extends Parent
{
void property()
{
System.out.println("Bike");	
}

}
public class MethodOverriding {

public static void main(String[] args) 
{
Child obj=new Child();
obj.property();  //Bike
Parent obj2=new Parent();
obj2.property(); //Gold
Parent obj3=new Child();
obj3.property();//Bike


}

}
