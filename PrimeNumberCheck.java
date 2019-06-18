package primeNumber;

public class PrimeNumberCheck {
	
	public static void PrimeNumber(int num){		 
		int temp = 0;	
		if (num<2){
			System.out.println("Number is not prime " +num);
		} else {
		for (int i=2;i<num;i++){
			if (num%i==0){
				temp = temp+1;
			}
		}
		if (temp==0){
			 System.out.println("Number is prime number " +num);
		}
		else{
			System.out.println("Number is not prime " +num);
		} 
		}
		
	}

	public static void main(String[] args) {
		PrimeNumber(1);
		PrimeNumber(0);
		PrimeNumber(24);
		PrimeNumber(25);
		PrimeNumber(27);
		PrimeNumber(29);
		

	}

}
