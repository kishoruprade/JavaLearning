package stringExamples;

public class StringConcat {

	public static void main(String[] args) {
		String s = new String ("Sachin " + "  Tendulkar ");
		
		System.out.println(s);
		
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(6));
		
		System.out.println(s.replace("a", "A"));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.trim());
		
		System.out.println(s.startsWith("Sa"));
		
		System.out.println(s.endsWith("ten"));
		
		System.out.println(s.length());
		
		System.out.println(s.replace("Sachin", "Hameyantdas"));

	}

}
