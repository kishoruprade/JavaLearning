
//count the words in the string
public class StringCount {

	public static void main(String[] args) {
	   String str = "Welcome to Java and Selenium";
	   int count = 0;
	   
	   for (int i=0;i<str.length();i++){
		   if(str.charAt(i)!=' '){
			   count++;
		   }
	   }
       System.out.println(count);
       
       //reverse the string with it's precision position
       String sp[] = str.split("\\s");
       for (int i=0;i<sp.length;i++){
    	   for(int j=sp[i].length()-1;j>=0;j--){
    		   System.out.print(sp[i].charAt(j));
    	   }
    	   System.out.print(" ");
       }
       
       //find out the duplicate character in String
       System.out.println(" ");
       String dup = "";
     
       
       for (int i=0;i<str.length();i++){
    	   for (int j = i+1;j<str.length();j++){
    		   if (str.charAt(i)==str.charAt(j)){
    			 dup +=  str.charAt(i) + " ";
    			   
    		   }
    	   }
       }
              
       System.out.print(dup);
     
       
       
       
	}

}
