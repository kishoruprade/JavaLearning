import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		System.out.print("Enter number upto Fibonacci Series to print: ");
		int number  = new Scanner(System.in).nextInt();
		
		if(number==1 || number ==2){
			System.out.println(1);
		}
		int fibo1 = 1, fibo2=2,fibonacci=1;
		 
		for (int i=3;i<=number;i++){
			 fibonacci = fibo1+fibo2;
			fibo1 = fibo2;
			fibo2=fibonacci;
			
			if (fibonacci<100){
			System.out.print(fibonacci);
			}
			
			System.out.print(" ");
		}
		
	}

	
}
