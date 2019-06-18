package stringPractice;

public class StringEqualOperators {

	public static void main(String[] args) {
		String s = "abc";
		String str = "abc";
		
		System.out.println(s.equals(str));
		System.out.println(s==str);
		
		
		System.out.println("--------------");
		String a = new String("abc");
		String b = new String("abc");

		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		
		//Scenario 3
		System.out.println("--------------");
		System.out.println(a.equals(s));
		System.out.println(a==s);
		
		//scenario 4
		String ab = "meaow";
		String abc = ab+ "deal";
		String abcd = "meaowdeal";
		System.out.println("--------------");
		System.out.println(abc==abcd);
		
	}

}
