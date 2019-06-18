package StringPractice;

public class TestingComparision {

	public static void main(String[] args) {
		String s1="Sharad";
		String s2=new String("Sharad");
		String s3="Pokale";
		String s4="SHArad";
		String s5="Sharad";
		String s6="Sharu";
		// String comparison by using equals method
		System.out.println("String comparison by using equals method");
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equals(s4)); //false
		System.out.println(s1.equalsIgnoreCase(s4)); //true
		
        // String comparison by using == operator
		System.out.println("String comparison by using == operator");
		System.out.println(s1==s2); // false
		System.out.println(s1==s4); // false
 		System.out.println(s1==s5); // true
 		System.out.println(s1==s3); // false
 		
 		// String comparison by using compareTo method
 		System.out.println("String comparison by using compareTo method");
 		System.out.println(s1.compareTo(s5));  // 0
 		System.out.println(s1.compareTo(s4));  // negative number
 		System.out.println(s1.compareToIgnoreCase(s4)); //0 
 		System.out.println(s6.compareTo(s1));  // positive number
 		System.out.println(s1.compareTo(s6));  // Negative number
 		
	} 

}
