package practiceProgramsTop20;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp, num;
		boolean isPrime = true;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		for (int i=2;i<=num/2;i++){
			temp=num%i;
			if(temp==0){
				isPrime=false;
				break;
			}
			
		}
		if(isPrime){
		System.out.println("Number is prime "+num);
		}else{
			System.out.println("Number is not prime "+num);
		}
		

	}

}
