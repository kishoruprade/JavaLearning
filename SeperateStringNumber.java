

// HCLprogram - 8th June219
public class SeperateStringNumber {

	public static void main(String[] args) {
		String str = "IN12D343I4$%#%4A";
		
		// This is for reversing the STring
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		System.out.println("New Line");
		String words = "";
		String num = "";
		String specialChar = "";
		
      for (int i=0;i<str.length();i++){
    	  if (Character.isDigit(str.charAt(i))){
    		  num = num +str.charAt(i);
    	  }else if (Character.isAlphabetic(str.charAt(i)))
    		
    	  words = words + str.charAt(i);
    	  else {
    		  specialChar+=str.charAt(i);
    	  }
      }
      
      System.out.println(words +num +specialChar +"\n");
      
      String strdigit = "";
      String strname = "";
      String  strspecl = "";
      for (int i=0;i<str.length();i++){
    	  if (Character.isDigit(str.charAt(i))){
    		  strdigit+=str.charAt(i);
    		  }else if(Character.isAlphabetic(str.charAt(i))) {
    			  strname+=str.charAt(i);
    		  }else {
    			  strspecl+=str.charAt(i);
    		  }
    	  }
      System.out.print(strname);
      System.out.print(strdigit);
      
      System.out.print(strspecl);
      
	}

}
