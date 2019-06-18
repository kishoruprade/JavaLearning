package stringExamples;


// Write a program to reverse the String without changing the position----FIS Global

public class stringspace {
	public static void reverseString(String str){
		char[] ch = str.toCharArray();
		char[] res = new char[ch.length];		

		
		for (int i=0;i<ch.length;i++){
			if(ch[i]==' '){
				res[i]=' ';				
			}
		}
		
		int j=res.length-1;
		for (int i = 0;i<ch.length;i++){
			if(ch[i]!=' '){
				if(res[i]==' '){
					j--;
				}
				res[j]=ch[i];
				j--;
			}
		}
      System.out.println(str+"  "+String.valueOf(res) +" ");
	}
	

	public static void main(String[] args) {
		 reverseString("India is my country");
	}

}
