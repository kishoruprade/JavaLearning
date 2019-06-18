package stringPractice;

public class StringMethods {

	public static void main (String[] args) {
		String s = "Welcome to JavatPoint";
		String str = "";
		String sb = "Welcome to JavatPoinr";
		
		//charAt methods
		System.out.println(s.charAt(4));   //output o
		char ch = s.charAt(8);
		System.out.println(ch);
		
		//accessfirst and last character of the string
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		
		
		//compareTo method
		System.out.println(s.compareTo(sb));
		System.out.println(s.compareTo(str));
		
		

	}

}
