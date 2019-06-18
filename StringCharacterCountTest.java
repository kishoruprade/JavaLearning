package stringPractice;

public class StringCharacterCountTest {

	public static void main(String[] args) {
		String str = "Welcome to Java";
		int count = 0;
		int space = 0;
		
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)!=' '){
				count++;
			}else {
				space++;
			}
		}
		
		System.out.println(count);
		System.out.println(space);
		
		char ch[]= str.toCharArray();
		int count1 =0;
		
		for (int i = 0; i<str.length();i++){
			System.out.println(ch[i]);
			count1 ++;
		}
		
		System.out.println(count1);

	}

}
