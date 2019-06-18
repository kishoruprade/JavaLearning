package Oops;

public class FunctionClass {

	public static void main(String[] args) {
		FunctionClass obj = new FunctionClass();
		//one object will be created by is  the reference "obj" is the reference name
		obj.test();
		
		int addnum = obj.add();
		System.out.println(addnum);
		
		int num = obj.division(15, 3);
		System.out.println(num);
		
		String s1 = obj.name();
		System.out.println(s1);
		

	}
	//non-static methods
	
	//void -- does not return anything
	//return type --void
	public void test(){   //no input no output
		System.out.println("test method");
	}
	
	//this will return integer value
	//return type int
	// 
	public int add(){   //no input some output
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	//return type  - String
	public String name(){   //no input some output
		String s = "Selenium";
		System.out.println("qa method");
		return s;
	}
	
	//return type integer
	public int division(int x, int y){  //provided input and will get some output
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}

}
