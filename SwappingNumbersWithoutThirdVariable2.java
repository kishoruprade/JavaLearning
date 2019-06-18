

// Another logic but this will fail if we switch the orignal number it does not work in every cases
public class SwappingNumbersWithoutThirdVariable2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("The orignal value of a: "+a);
		System.out.println("The orignal value of b: "+b);		
		
	    a = a-b;
	    b = a+b;
	    
	
		
		System.out.println("The value post swapping a: "+a);
		System.out.println("The value post swapping b: "+b);

	}

}
