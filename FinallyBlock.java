
public class FinallyBlock {

	public static void main(String[] args) {
	//case 1
		try {
		int data = 25/5;
		System.out.println(data);
		
	}catch(NullPointerException e){
		System.out.println(e);
		
	}
	
		finally{
		System.out.println("finally block is always executed.");		
	}
	
	
	//case 2
		try{
			System.out.println(" Case 2*******************************");
			int data1=25/0;
			System.out.println(data1);
		}catch(NullPointerException e){System.out.println(e);}
		finally{
			System.out.println("finally is always executed");
		}	
		
		//Case 3
		try{
			System.out.println("Case 3********************************");
			int data3 = 25/0;
			System.out.println(data3);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally is always executed");
		}
		System.out.println("rest of the code 3....");
	}
}
