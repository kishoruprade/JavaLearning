package stringExamples;

public class SwapTwoStringExample3 {

	public static void main(String[] args) {
		String s1="Hi";
		
		String s2="Bye";
		
        s1=s2+s1;   //ByeHi
        
        s2=s1+s2;   //ByeHiBye
        
        s1=s1.substring(0,s2.length()-s1.length());
        System.out.println("s1: "+s1);  //Bye
        
        
        s2=s2.substring(s1.length(), s2.length()-s1.length());
        System.out.println("s2: "+s2);
		

	}

}
