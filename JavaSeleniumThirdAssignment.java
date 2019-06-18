package javaString;

public class JavaSeleniumThirdAssignment {

	public static void main(String[] args) 
	{	
		// #2. Write a java program to count number of words in a string
		System.out.println("2. Program to count number of words in a string");
		
		//Declare a String 	
		String s = new String("JavaSelenium");
		// declare a integer to store the length of string
		int slen = s.length();
		//use integer variable to measure the length of string
		System.out.println("Count the number of words in string: JavaSelenium: "+slen); //print the length of string
		
      //#3 Write a java program to reverse a string
		
		System.out.println("\n 3. Program to reverse a string");
		//Create a StringBuffer object
	  StringBuffer sb = new StringBuffer("JavaSelenium");  
	  sb.reverse();    //Use StringBuffer reverse method
	  System.out.println("Reverse the string: JavaSelenium: "+sb); //print the reverse string
	  
	    String sss = "java Selenium java";
	    String[] ss4 = sss.split(" ");
	    
	    if(ss4.equals(sss))
	    {
	    	System.out.println("print it is duplicate");
	    }
	    else
	    {
	    	System.out.println("no duplication ");
	    }
	
	  
	  
	}     

}
