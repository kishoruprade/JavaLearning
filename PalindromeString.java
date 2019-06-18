package stringExamples;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="nitin";
		for(int i=0;i<s1.length();i++)
		{
		   if(s1.charAt(i)==s1.charAt(s1.length()-1-i))
		   {
			   if(i==s1.length()-1)
			   {
				   System.out.println(s1+" is a palindrome string");
				   break;
			   }
		   }else
		   {
			   System.out.println(s1+" is not a palindrome string");
			   break;
		   }
			
		}
	}

}
