package primeNumber;

public class PrimeNumber1TO100Check {

	public static void main(String[] args) {
	 int i=0;
	 int num = 0;
	 //Empty String
	 String primeNumber = "";
	 
	 for (i=1;i<=100;i++){
		 int counter = 0;
		 for (num=i;num>=1;num--){
			 if(i%num==0){
				 counter = counter+1;
			 }
		 }
		 if (counter ==2){
			 //Append the Prime number
			 primeNumber = primeNumber +i + " ";
		 }
	 }
	 System.out.println("Prime number 1 to 100 are: ");
	 System.out.println(primeNumber);

	}

}
