package stringPractice;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "Madam";
		String palString = "";
		
		for (int i=s.length()-1;i>=0;i--){
			palString = palString + s.charAt(i);
			
		}
		
		System.out.println(palString);
		if (palString.equalsIgnoreCase(s)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
		
		

	}

}
