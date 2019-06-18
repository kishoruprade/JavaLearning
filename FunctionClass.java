package functionPkg;

public class FunctionClass {

	public static void main(String[] args) {
		System.out.println("calling function");		
		add();
		int a = 10;
		FunctionClass instance = new FunctionClass();
		
	}
	public void substract()
	{
		System.out.println("substracts");
	}
	//specifier, Modifier, return type, method name --Signature of 
	public static void add() {
		System.out.println("in add");
	}
	public static int add1()
	{
	System.out.println("");
	return 1;
	}
	public static void add2(int a, int b)
	{
		System.out.println(" a in add" +(a+b));
	}
	
	
	//Opps 
	
}
	


