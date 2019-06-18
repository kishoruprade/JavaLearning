
//Fifth Pass assignment  
//1. Create a class A , create a non-static method . Create a int local variable which store a value 20.
//  Access local variable within main method.

public class AA {

	public static void main(String[] args) {
		// Create an object to access non-static method inside the class
		 AA a = new AA();     //Create an object with instance a
		 a.testMethod();	//Call the non static method
		// System.out.println(varLocal);  //compile time error
	}
	void testMethod(){  //Create a non static method
		int varLocal = 20;  //initialize a local variable
		System.out.println(varLocal);  //print a local variable value
	}
	

}
