package javaString;

public class StringDuplicate {

	public static void main(String[] args) {
		//  Write a java program to find duplicate characters in a string?
		
		String s =  "ajava";
		char[] ch = s.toCharArray();
		int count ;
		
		for (int i = 0;i<s.length();i++)
		{
			for (int j = 1; j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					System.out.println("duplicate");
					count = ch[i];
				}
				
				
				
			}
			
		}
		

	}

}
