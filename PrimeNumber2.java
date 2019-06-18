package primeNumber;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int num =198;
		int flag= 0;
		
		if (num<2){
			System.out.println("Not a Prime number "+num);
		}else {
			for (int i=2;i<num/2;i++){
				if (num%i==0){
					System.out.println("Not a Prime number "+num);
					flag = 1;
					break;
				}
			}
		}
		if (flag==0){
			System.out.println("Number is prime"+ num);
		}

	}

}
