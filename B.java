/*
 * 2.    Create a class B,  create a string instance variable and
            •    Access within a same in a non static method.
            •    Access within a same in static method.
            •    Access outside of class in static method.

 */
public class B {
	String s = "Selenium";

	public static void main(String[] args) {
		B nonS = new B();			
		nonS.nonStatic();
		B.StaticOne();
		outsideB.outsideOfClass();	
	}
	void nonStatic(){
		System.out.println("Access string instance variable in Non-static method:    \t\t"+s);  //String instance variable is accessible within a same in a non static method.
	}
	static void StaticOne()
	{
		B obj = new B();
		System.out.println("Access string instance variable within a same in static method: \t"+obj.s); // String instance variable is accessible within a same in a static method.
	}
}

class outsideB {
	static void outsideOfClass(){
		B object = new B();
		System.out.println("Access string instance variable outside of class in static method: \t"+object.s);  //String instance variable is accessible outside of class in static method.
	}	
}
