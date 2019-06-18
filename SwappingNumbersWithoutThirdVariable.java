

// Swapping of Two numbers in Java - Simplicity Software
public class SwappingNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("The orignal value of a: "+a);
		System.out.println("The orignal value of b: "+b);		
		a = a+b;
		b = a-b;
		a = a-b;	
		System.out.println("The value post swapping a: "+a);
		System.out.println("The value post swapping b: "+b);
		
	}

}
