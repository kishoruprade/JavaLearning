package practicePrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int rev=0,rem = 0;
		while(temp!=0){
			rev = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev){
			System.out.println("The number is palindrome"+no);
		}else{
			System.out.println("The number is palindrome"+no);
		}
		
	}

}
