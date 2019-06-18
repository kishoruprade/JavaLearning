package interviewPrograms;


// HCL - 2nd Technical round -Write a program to seperate the String and number and print it
public class StringNumberSeperation {

	public static void main(String[] args) {
		String s = "Welcome123Java123134Selenium24828";
		
		String str = "";
		String num = "";
		
		for (int i=0;i<s.length();i++){
			
			if(Character.isAlphabetic(s.charAt(i))){
				str = str+ s.charAt(i);
			}else {
				num = num +s.charAt(i);
			}
		}
		
		System.out.println(str);
		System.out.println(num);

	}

}
