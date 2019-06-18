package StringPractice;

public class ValueOf {

	public static void main(String[] args) {
	    int i=1233;
		long l=45466454;
		float f=67.78f;
		double d=34.6778;
		boolean b=true;
		char ch='S';
		String s1=String.valueOf(i);
		System.out.println(s1);
		String s2=String.valueOf(l);
		System.out.println(s2);
		String s3=String.valueOf(b);
		System.out.println(s3);
		String s4=String.valueOf(f);
		System.out.println(s4);
		String s5=String.valueOf(d);
		System.out.println(s5);
		String s6=String.valueOf(ch);
		System.out.println(s6);
		System.out.println(s1+s2+s2+s3+s4+s5+s6);
		

	}

}
