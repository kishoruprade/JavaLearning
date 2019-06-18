package primeNumber;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		for (int i=1;i<=100;i++){
			if(i<1||i%i-1==0){
				System.out.println("Not Prime" +i);
			}else{
				System.out.println("Prime Number"+i);
			}
		}
	}

}
