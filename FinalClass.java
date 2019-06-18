package initial;
class Fruit //usage of final keyword to the fruit class we can't extends it to the another class.
{
	
}
class Apple extends Fruit
{
public void printMessage()
{
System.out.println("Prinint the message");	
}
}
public class FinalClass {

	public static void main(String[] args) {
		Apple obj=new Apple();
				obj.printMessage();

	}

}
