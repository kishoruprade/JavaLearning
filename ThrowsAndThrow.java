package exceptionHandling;

public class ThrowsAndThrow {
	
     public void add() throws ArithmeticException{
		
    	 System.out.println("Arithmetic Exception");
	}


	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Something went wrong.");
			
		}catch(Exception e) {
			
			System.out.println(" abc");
			
		}

	}
	
	
}
