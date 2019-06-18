package interviewprograms;

public class Substring {

	public static void main(String[] args) {
		String s = "ABCD";
		String s2 = "XY";
		char[] sarr= s.toCharArray();
		char[] s2arr = s2.toCharArray();
		
		System.out.println(isPresent(sarr,s2arr));

	}
	public static boolean isPresent(char[] s, char[]s2){
		for (int i=0;i<s.length;i++){
			for (int j=0;j<s2.length;j++){
				if(s[i]==s2[j]){
					System.out.println(s2[j]);
					break;
				}
				
			}
		}
		
		
		return false;
		
	}

}
