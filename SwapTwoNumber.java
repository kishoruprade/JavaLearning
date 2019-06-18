package practicePrograms;

public class SwapTwoNumber {

	 static public void main(String[] args) {
		int a = 10;
		int b= 5;
		System.out.println("The value of a= "+a+ " The value of b= "+b);
		
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println("The value of a= "+a+ " The value of b= "+b);
		

	}

}
