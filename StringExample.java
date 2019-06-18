package string;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Java"; //creating string using Java String Literal
		char ch[] = {'S','t','r','i','n','g'};
		
		String s2 = new String(ch); //Converting character array to String
		String s3 = new String("Example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
