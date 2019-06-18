package stringPractice;

public class StringSplitMethod {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint";
		
		for(String s:str.split("\\s",0)){
			System.out.println(s);
		}
		
		System.out.println("---------------");
		for(String s:str.split("t",0)){
			System.out.println(s);
		}
	}
}
