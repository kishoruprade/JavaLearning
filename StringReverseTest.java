package infostretch;

public class StringReverseTest {

	public static void main(String[] args) {
		String str = "Selenium and JavatPoint";
		
		String[] strsplit = str.split("\\s");		
		
		for (int i=0;i<strsplit.length;i++){               //continue the loop till string split end
			for (int j=strsplit[i].length()-1;j>=0;j--){      //print split end of each j
				System.out.print(strsplit[i].charAt(j)); // print the value in the positin of i
			}
			System.out.print(" ");         // put space after each i when next i loop executes
		}
		
	
		
		

	}

}
