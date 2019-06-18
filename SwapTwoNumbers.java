package stringExamples;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=-10;
		int b=20;
		
		a=a+b;  //a=30
		b=a-b;  // 30-20=10, b=10;
		a=a-b;  // 30-10=20, a=20; 
		//System.out.println(a);
		//System.out.println(b);
		String a1="Hi";
		String b1="Hello";
		String temp;
		temp=a1;
		a1=b1;
		b1=temp;
		//System.out.println(a1);
        //System.out.println(b1);
		
        String s1="a";
        String s2="b";
        String s3=s1+s2;
        System.out.println(s3);
        

	}

}
