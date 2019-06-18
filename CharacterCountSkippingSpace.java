package stringPractice;

public class CharacterCountSkippingSpace {

	public static void main(String[] args) {
		String str = "Welcome to JavatPoint";
		int count = 0;
		
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				count++;
				
			}
		}
		System.out.println(count);

	}

}
