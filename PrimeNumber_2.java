package primeNumber;

public class PrimeNumber_2 {

	public static void main(String[] args) {
		int flag =0;
		for (int i=2;i<20;i++){
			if (i%2==0){
				System.out.println("Not Prime"+i);
				flag = 1;
			}
		}
		if (flag==0){
			System.out.println("Prime Number");
		}

	}

}
