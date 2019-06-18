/*
 * Create a class C,  create a string static variable and
           •    Access within a same in a non static method.
           •    Access within a same in static method.
           •    Access outside of class in non static method.
 */

public class C {
     static String s = "Selenium";
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.nonStatic();
		System.out.println("Access string static variable within a same in static method.      \t "+s);
		CC cc = new CC();
		cc.outSideClass();		
	}
	void nonStatic(){
		System.out.println("Accessstring static variable  within a same in a non static method. \t "+s);
	}
}
class CC extends C{
	public void outSideClass(){
		System.out.println("Access string static variable outside of class in non static method. \t"+s);
	}
}