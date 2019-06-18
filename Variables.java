package variable;

public class Variables {
	public int globalVar = 20;
	static int staticVar = 50;  

	public static void main(String[] args) {
		// declaration of variables
		 //Local variable declared inside the method and accessible within method only
		// System.out.println(localVar);         //Cannot access local variable
		add();
		Variables var = new Variables();
		var.number();                       //Access non-static variable into static using object creation
		
		System.out.println(staticVar+" Global variable using static ");
	}
	
	public static void add()
	{
		int localVar = 40;
		System.out.println(localVar+" Local variable");   
		
	}
	public void number(){
		System.out.println(globalVar+" Global Variable using object creation");         //access non-static instance/global variable 
	}

}
