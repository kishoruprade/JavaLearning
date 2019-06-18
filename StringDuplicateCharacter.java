package interviewPrograms;

// Write a program to check character duplicated in one string
// This does not work if more than one character duplicate
public class StringDuplicateCharacter {

	public static void main(String[] args) {
		String s = "Welcsdfsdfddome";
		int count  = 0;
		char ch = ' ';
		
		for (int i=0;i<s.length();i++){
			for (int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					System.out.print(s.charAt(i) + " ");
//					count = count+1;
//					ch = s.charAt(i);
				}
			}
		}
//          System.out.print(ch + " " + count);
	}

}
