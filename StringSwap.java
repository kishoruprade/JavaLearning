package javaString;

public class StringSwap {

	public static void main(String[] args)
	{
		// String declarations					
		String s = "Selenium";
		String str = "Java";
		//Addition of string
	    s = s+str;
	    str = s.substring(0,s.length()-str.length());  //Decrease the length from above string and store in first string into second
	    
	    s = s.substring(str.length());   //swap the second string
	    //Print the string
	    System.out.println(s);
	    System.out.println(str);
	    
	}

}
