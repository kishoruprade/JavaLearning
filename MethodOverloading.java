
public class MethodOverloading {

	//Method overloading by the position of the arguments
	public static void adder(int a,double b)
	{
		System.out.println("int-double");
	}
	public static void adder(double a, int b)
	{
		System.out.println("double-int");
		
	}
	
	
	public static void main(String [] args)
	{
		MethodOverloading.adder(30.5, 10);
		MethodOverloading.adder(10, 10.50);
	}
	}
