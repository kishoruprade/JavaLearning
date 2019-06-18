package practicePrograms;

public class StringReverse {

	public static void main(String[] args) {
	String s = "Welcome Selenium";
	String s1 = "KadaK";

	
	//Reverse the String using String Builder
	StringBuilder sb = new StringBuilder("Welcome");
	System.out.println(sb.reverse());
	
	String reverse = "";
	
	for(int i=s1.length()-1;i>=0;i--) //using for loop
	{
		reverse += s1.charAt(i);
	}
	System.out.println(reverse);
	
	
	}
	
	
}
