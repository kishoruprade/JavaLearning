package testProgram;


//Write down the program for fibonacci series
public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		int fib ;
		
		System.out.print("The fibonacci series are: " +num +" "+num1 +" ");
		
		for (int i=1;i<=15;i++){
			fib = num+num1;
			if (fib<=100){
			System.out.print(fib + " ");
			
			num = num1;
			num1 = fib;
			}
			
		}

	}

}
