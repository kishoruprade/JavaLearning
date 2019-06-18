package infostretch;

public class StringDuplicate {

	public static void main(String[] args) {
	 String str = "Welcome";
	 int count = 1;
	 char ch  = ' ';
	
	 
	 for (int i=0;i<str.length();i++){
		 for (int j=i+1;j<str.length();j++){
			 if(str.charAt(i)==str.charAt(j)){
				ch = str.charAt(j);
				count = count +1;
				break;
			 }
			 }		
		 
	 }	
	 
	 System.out.print(ch+ " " +count);

	}

}
