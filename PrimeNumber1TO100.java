
public class PrimeNumber1TO100 {

	public static void main(String[] args) {
		
		// Check given number is prime or not
		int num = 24;
		int count = 0;
		
		if(num==0||num==1){
			System.out.println("The Number is not prime " + num);
		}
		else{
		for (int i=2;i<num/2;i++){
			if(num%i==0){
				System.out.println("The Number is  not prime " +num);
				count = 1;
				break;
			}
		}
		if(count==0){
			System.out.println("The Number is prime "+num);
		}
		
		}
   // Prime Number 1-100    
		
		int i = 0;
		int number = 0;
		int maxCheck = 100;
		boolean isPrime = true;
		
		String primeNumberfound = "";
		
		for (i=2;i<maxCheck;i++){
			isPrime= CheckPrime(i);
			if(isPrime	){
				primeNumberfound = primeNumberfound+i +" ";
				
			}
		}
		System.out.println("Prime number  from 1 to "+maxCheck+"are: ");
				System.out.println(primeNumberfound);
		
	}
	public static boolean  CheckPrime(int numberTocheck){
		int remainder;
		for (int i=2;i<=numberTocheck/2;	i++){
			remainder = numberTocheck % i;
			if (remainder==0){
				return false;
			}
		}
		return true;
	}

}
