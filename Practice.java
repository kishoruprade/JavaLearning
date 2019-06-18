package javaString;

public class Practice {

	public static void main(String[] args) {
		String str = "selenium java";   	 
				
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		///************////
		
		System.out.println("\n");  
		
		String slong = "Hi this is number of word this is eight";  //Declare a long string
		
		String[] word = slong.split("\\s");  //Convert long string into String array
		 //count the words in string using length and print
		System.out.println(word.length);
		
		/********     ***/
		
		String strlon = "Hi this is number of word this is eight"; 
		String[] words = strlon.split("\\s");
		
          
		/***swaping of tw\o numbers*****/
		int a = 5;
		int b = 8;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		int x= 4, y=5;
				
	    x = x+y;
	    y=x-y;
	    x=x-y;
	    
	 			
		System.out.println("y " + y);
		
		System.out.println("x "+x);
		
	     System.out.println("\n");
	     System.out.println(a);
	     System.out.println(b);
	     
	     
	     String st = "Jotiba";
	     String sw = "Sharad";
	     String xe;

	     xe = st;
	     st = sw;
	     sw = xe;
	     
	     System.out.println(st);
	     System.out.println(sw);
	     
	     
	     String tt = "abc";
	     String rr = "def";
	    	
	     tt = rr.toString();
	     
	     
	     
	     
	     System.out.println(tt);
	     System.out.println(rr);
		
		
		

	}

}
