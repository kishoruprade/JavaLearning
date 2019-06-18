package Oops;

public class CarClass {
	//Class vars
	int mod;
	int wheel;

	public static void main(String[] args) {
		// new CarClass is the object for CarClass 
		// new keyword is used to create object
		//a,b,c -->object reference variable
		
		CarClass a = new CarClass();
		CarClass b = new CarClass();
		CarClass c = new CarClass();
		
		a.mod = 2019;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 3;
		
		c.mod = 2017;
		c.wheel = 6;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a= b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
        c.mod = 20;
        System.out.println(a.mod);
        System.out.println(c.mod);
        

	}

}
