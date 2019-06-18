
//Java program to call and create a default constructor
public class ConstructorClass {
	
	//creating default constructor
	int c;
	ConstructorClass(int a, int b){
		System.out.println("It is default constructor");
		c = a+b;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		// calling default constructor
		
		ConstructorClass c = new ConstructorClass(10,15);
		

	}

}
