package stringPractice;

public class StringCharacterCount {

	public static void main(String[] args) {
		String str = "Welcome JavaTPoint";
		int count = 0;
		String[] words = str.split("a");
		
		for (int i = 0;i<str.length();i++){
			count = count+1;
			
		}
		System.out.println(count);
		
		int count2=0;

		for (String s: words){
			count2 = count2+1;
			System.out.println(s);
			
		}
		System.out.println(count2);

	}

}
