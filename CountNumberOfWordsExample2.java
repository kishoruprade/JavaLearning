package stringExamples;

public class CountNumberOfWordsExample2 {

	public static void main(String[] args) {
		String str="Don't wait for the right time. The best time to do something is now";
		String[] splittedString=str.split(" ");
		System.out.println("No of words in given String are: "+splittedString.length);
		
	}

}
