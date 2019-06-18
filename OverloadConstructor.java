/*
 */
public class OverloadConstructor {
	
	OverloadConstructor(String s, String s1){
		System.out.print("Addition of Two Strings: ");
		System.out.println(s+s1);
	}
	OverloadConstructor(int a, int b){
		System.out.print("Addition of Two integers: ");
		System.out.println(a+b);
	}
	OverloadConstructor(double x, double y){
		System.out.print("Addition of Two doubles: ");
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {
		OverloadConstructor s = new OverloadConstructor("Selenium","Java");
		OverloadConstructor s1 = new OverloadConstructor(15,5);
		OverloadConstructor s2 = new OverloadConstructor(14.00,15.64);
	

	}

}
