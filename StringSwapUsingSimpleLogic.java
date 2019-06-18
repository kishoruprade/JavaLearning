// Program for swapping two string variables without using third variable.

package stringExamples;

public class StringSwapUsingSimpleLogic {

	public static void main(String[] args) {
		
		String a="Hi";  //Initialized one String variable
		
		String b="Bye";  // Initialized second String variable
		
		a=a+b;              // HiBye    
		
		b=a.substring(0,a.length()-b.length()); //  Extracting "Bye" from "HiBye" using length() and substring() methods.
		
		System.out.println("b: "+b);  //b=Hi, a=HiBye
		
	  	a=a.substring(b.length());   // Extracting "Hi" from "HiBye" using same methods   
		
		System.out.println("a: "+a);
		
		
		

	}

}
