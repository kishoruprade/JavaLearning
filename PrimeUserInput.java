package primeNumber;

import java.util.Scanner;

public class PrimeUserInput {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int flag = 0;
		
		if (num<2){
			System.out.println("Not Prime Number" + num);
		}else{
			for (int i=2;i<num;i++){
				if (num%i==0){
					System.out.println("Not Prime Number" + num);
					flag = 1;
					break;
				}
				
			}
		}
           if (flag==0){
        	   System.out.println( "Prime Number"+ num);
           }
	}

}
