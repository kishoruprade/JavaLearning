package string;

public class SplitSpace {

	public static void main(String[] args) {
		String str = "Welcome to Automation";
		String[] word = str.split("\\s");
		
		for(String w: word){
		System.out.print(w);
		}

	}

}
