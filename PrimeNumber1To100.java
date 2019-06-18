package infostretch;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		int flag = 0;
		for (int i=1;i<=100;i++){
			if (i<=1){
				System.out.println("Number is not prime" + i);
			}else if (i%i-1==0){
				System.out.println("Number is not prime" + i);	
				flag = 1;
			}else  if(flag==0){
				System.out.println("Number is prime" + i);
			}
			
		}

	}

}
