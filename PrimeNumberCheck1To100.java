package primeNumber;

public class PrimeNumberCheck1To100 {

	public static void main(String[] args) {	
		int temp = 0;
		
		for (int no = 2;no<=100;no++){
			
			for (int i=2;i<no;i++){
				   if (no%i==0){
					   temp = temp +1;
				   }
				
			}
			if (temp ==0){
				System.out.println(no);
			}else {
				
				temp =0;
			}
			
		}
		

	}

}
