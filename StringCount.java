package stringExamples;

public class StringCount {

	public static void main(String[] args) {
	 String str = "Welcome to Java";
	 char []ch = str.toCharArray();
	 int count = 0;
	
	 
	 // Program for Reverse the String and count the characters in the string
	 for (int i = str.length()-1 ;i>=0;i--){	 
		 count =count+1;	
		 
		 System.out.print(ch[i]);
	 }
	 System.out.println(count);
	 
	 System.out.println("..........Reverse the String with it's precision position.....");
	 
	 String []arr = str.split(" ");
	 
	 for (int i=0;i<arr.length;i++){
		 
		 for (int j=arr[i].length()-1;j>=0;j--){		    
		    System.out.print(arr[i].charAt(j));	   
		 }	
		 System.out.print(" ");
	 }	 

	}
	
	
	
	
	

}
