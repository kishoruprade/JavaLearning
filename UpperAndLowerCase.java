package StringPractice;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		String s1="sharad p  ";
		String s2=" /?()__+=45^&";
		System.out.println("To upper case: "+s1.toUpperCase());
		System.out.println("To lower case: "+s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.trim());
		System.out.println("Startswith and endswith");
		System.out.println(s1.startsWith("Sh")); // true
		System.out.println(s1.endsWith("aD"));   //true
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(5));
		System.out.println(s1.length());
		
        
	}

}
