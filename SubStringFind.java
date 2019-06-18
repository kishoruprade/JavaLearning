package practicePrograms;
/*
 * 3 – Find out the substring of String. Example I have string “Selenium is Automation Tool” I want to find substring “Auto” and print that string.
 */
public class SubStringFind {

	public static void main(String[] args) {
		String s = "Selenium is Automation Tool";  //Declare the full string
		System.out.println("Full String: "+s);
         String s2 = s.substring(12,16);  //Find the substring using index start and end value
          System.out.println("The SubString is: "+s2);        //Print the substring
	}

}
