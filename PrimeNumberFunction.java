package primeNumber;

public class PrimeNumberFunction {
	
	public static boolean isPrimeNumber(int num){
		if (num<=1){
			return false;
		}else {
			for (int i=2;i<num;i++){
				if (num%i==0){
					return false;	}
			}
			return true;}
		}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(5));
		System.out.println(isPrimeNumber(13));
		System.out.println(isPrimeNumber(17));
		
		

	}

}
