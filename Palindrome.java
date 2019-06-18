package testProgram;


//Wrong programming logic --make the correction
public class Palindrome {

	public static void main(String[] args) {
		int num = 121;   // initialize the num variable to hold some value
		
		int r;  //declare the r 
		int sum = 0;   //declare sum = 0  as default 
		int temp;  //define temp variable to store num value
		
		temp = num;  //store the num value in temp
		
		while(num<=0){
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;			
		}
		if (temp == num){
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
		

	}

}
