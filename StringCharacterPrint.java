package stringExamples;

import java.util.ArrayList;
import java.util.List;

public class StringCharacterPrint {

	public static void main(String[] args) {
		// String 
		
		StringBuilder str = new StringBuilder("Kishor");
		System.out.println(str.substring(1));
		
		//Tech Mahindra Interview questions
		List<String> strg = new ArrayList<String>();
		strg.add("Virendra");
		strg.add("Shailendra");
		strg.add("Mukesh");
		
		for(String s: strg){
			
			System.out.println(s.substring(1));			
			
		}
		
		//Write down the program to identify the character which should skip 0 and print rest character
		
		

	}

}
