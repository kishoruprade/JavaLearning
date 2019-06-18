package string;

public class StringManipulation {

	public static void main(String[] args) {
		// declaring a string
		String s1 = "Welcome To Java";
		
		String s1Lower = s1.toLowerCase();
		System.out.println(s1Lower);
		
		String s1Upper=s1.toUpperCase();
		System.out.println(s1Upper);
		
		String s1Replace = s1.replace('a','x');
		System.out.println(s1Replace);

	}

}
