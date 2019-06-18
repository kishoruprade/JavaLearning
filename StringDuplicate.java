package stringExamples;

public class StringDuplicate {

	public static void main(String[] args) {
		String str = "1313913791398827391237adbjfdhs";
		char ch[] = str.toCharArray();
		int count = 0;
		
		for (int i=0;i<str.length();i++){
			for (int j=i+1;j<str.length();j++){
				if (str.charAt(i)==str.charAt(j)){
					
					count++;
					break;
				}
				
			}
			System.out.print(str.charAt(i) + "--"+count);
		}
        
	}

}
