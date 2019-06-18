package stringExamples;

public class FindingDuplicateCharacter {

	public static void main(String[] args) {
		String s1="Sharadra";
		int count=0;
		char ch='0';
	 for(int i=0;i<s1.length();i++)
	 {
		for(int j=i+1;j<s1.length();j++)
		{
			if((s1.charAt(i))==(s1.charAt(j)))
			{
			    ch=s1.charAt(i);
				count++;
				
			}
		}
	
	 }
	 System.out.println(ch+" is "+count+" times");	
  }
}
