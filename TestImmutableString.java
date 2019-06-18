package StringPractice;

public class TestImmutableString {

	public static void main(String[] args) {
		String s1="Sharad ";
		String s2=" Pokale";
		s1.concat(s2);
		System.out.println(s1);  // O/p will be only sharad, hence String is immutable
		
		s1=s1.concat(s2);  // Explicitly storing it into s1 reference
		System.out.println(s1);

	}

}
