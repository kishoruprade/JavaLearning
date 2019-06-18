package infostretch;

// 24 May 2019
public class PrimeNumber {

	public static void main(String[] args) {
		int a = 29;
		int flag = 0;
		
		if (a<2){
			System.out.println("Number is not prime number" + a);
		}else {
			for (int i=2;i<a;i++){
				if (a%i==0){
					flag = flag +1;
				}
			}
		}
		if (flag==0){
			System.out.println("Number is prime number" + a);
		}else {
			System.out.println("Number is not prime" + a);
		}

	}

}
