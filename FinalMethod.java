package initial;
class Bike
{
public void run()// But if i use final then we can't override this method in child class.
{
System.out.println("Vehicle is running");	
}}
class HondaBike extends Bike
{
public void run()
{
System.out.println("Honda is running safely 100kmph");	
}
}

public class FinalMethod {

	public static void main(String[] args) {
		HondaBike obj=new HondaBike();
		obj.run();
		
		

	}

}
