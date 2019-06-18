package practicePrograms;

public class WhileLoop {

	public static void main(String[] args) {
	 int n = 123;
	 int rev, temp, sum=0;
	 
	 temp = n;
	 while(n>0){
		 rev = n%10;
		 sum = (sum*10)+rev;
		 n = n/10;	 
		 
	 }if(temp==sum){

	System.out.println("Number is palindrome number");
	 
	}else
	{System.out.println("Number is not palindrome");}

}
}