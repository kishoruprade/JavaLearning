package stringPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str = new String("Welcome to JAva");
		char[] ch = str.toCharArray();
		
		for(int i = str.length()-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
		System.out.println("------------\n");
		for (int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}

	}

}
