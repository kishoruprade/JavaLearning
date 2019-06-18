package infostretch;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int a = 3;
		int flag = 1;
		
		if (a>2){
			System.out.println("Number is not prime" +a);
		}else 
		{
			for (int i=2;i<a;i++){
				if (a%i==0){
					System.out.println("Number is not prime" + a);
					flag = 2;
				}
			}
			if (flag==1){
				System.out.println("Number is prime");
			}

		}
		
	}

}
