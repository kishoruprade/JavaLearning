package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int m = num/2;
        int flag =0;
		if (num<2){
			System.out.println("Not Prime");
		}else {
			for (int i=2;i<=m;i++){
			if(num%i==0) 
			System.out.println("Not prime");
			flag = 1;
			
		}
		}
		 if (flag==0){
			System.out.println("Number is prime");
		}
		
	}

}
