package string;

public class StringDuplicate {

	public static void main(String[] args) {
		String a = "ABCD";
		char[] ca = a.toCharArray();
		
		String b = "CD";
		char[] cb = b.toCharArray();
		String str = " ";

		// Logic for checking duplicate string in another string
		for (int i=0;i<a.length();i++){		
			for (int j=0;j<b.length();j++){
				if (ca[i]==cb[j]){
				System.out.print(cb[j]);
				}
			}			
		}
		System.out.println();
		//Logic to reverse the string
		for (int i=a.length()-1;i>=0;i--){
			System.out.print(ca[i]);
		}
	
	}

}
