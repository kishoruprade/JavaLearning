package primeNumber;

public class PrimeNumberHardCoded {

	public static void main(String[] args) {
		int num = 2;		
		int flag =0;		
		if (num<2){
			System.out.println("Not Prime" +num);
		}else{
			for (int i=2;i<num;i++){
				if (num%i==0){
					System.out.println("Not Prime" +num);
					flag = 1;
					break;
				}			
			}			
			if (flag==0){
				System.out.println("Prime Number" + num);
			}
		}
		
		
		

		
		
		

	}

}
