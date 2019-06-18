package abstraction;
abstract class Name
{
public  static void myName()
{
System.out.println("Sharad");	
}
public void petname()
{
System.out.println("Dada");	
}
}
public class MethodHiding extends Name
{
	public final void petname()
	{
		
	}
	public static void myName()
	{
	System.out.println("Walmik");	
	}
	public static void main(String[] args)
	{
		Name ref=new MethodHiding();
		ref.myName();

	}

}
