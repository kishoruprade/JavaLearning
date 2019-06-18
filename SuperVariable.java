class Vehicle
{
String color="Black";	
}
class HondaBike extends Vehicle
{
String color="Blue";


public void PrintMsg()
{
System.out.println(color);	
System.out.println(super.color);
}
}


public class SuperVariable {

	public static void main(String[] args)
	{
		
    HondaBike obj=new HondaBike();
    obj.PrintMsg();
	}

}
