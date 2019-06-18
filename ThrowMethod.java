
public class ThrowMethod {
 static void validate(int age){
	 if(age<18)
		throw new ArithmeticException("not valid");
		else 
			System.out.println("welcome to vote");
		
	 
 }
 static void abc(){
	 System.out.println("abc");
 }
	
	public static void main(String[] args) {
		validate(15);
		abc();
		System.out.println("rest of the code");

	}

}
