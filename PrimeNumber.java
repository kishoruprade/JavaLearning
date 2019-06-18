package practicePrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,flag=0;
		
		int n = 93;
		
		if(n==0||n==1){
			System.out.println("Number is not Prime "+n);
		}else{
			for (i=2;i<n;i++){
				if(n%i==0){
					System.out.println("Number is not prime");
					flag = 1;
					break;
				}
			}
			
			if (flag==0){
				System.out.println("Number is prime"+n);
			}
		}
		
		
		

	}

}
