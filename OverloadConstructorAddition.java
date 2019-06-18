/*
 * 2. Write a program to overload constructor for addition of 2 Strings, 2 Integers, 2 Double values.
 */
public class OverloadConstructorAddition {
	String a, b;
	int c, d;
	double x,y;
	
	OverloadConstructorAddition(String a,String b){
		this.a=a;
		this.b=b;			
	}
	OverloadConstructorAddition(int c,int d){
		this.c=c;
		this.d=d;		
	}
	OverloadConstructorAddition(double x,double y){
		this.x=x;
		this.y=y;		
	}
	void addString(){
		System.out.println(a+b);
	}
	void addInteger(){
		System.out.println(c+d);
	}
	void addDouble(){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		OverloadConstructorAddition s = new OverloadConstructorAddition("Selenium","Java");
		OverloadConstructorAddition s1 = new OverloadConstructorAddition(5,10);
		OverloadConstructorAddition s2 = new OverloadConstructorAddition(5.23,10.78);
		s.addString();
		s1.addInteger();
		s2.addDouble();

	}

}
