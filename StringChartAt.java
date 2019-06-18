package stringPractice;

public class StringChartAt {

	public static void main(String[] args) {
		String s = "Welcome to JavatPoint Portal";
		for (int i=0;i<s.length();i++){
			if (i%2!=0){
				System.out.println("Char at "+i+" place "+s.charAt(i));
			}
			
		}
		
		String sb = "Welcome to JavatPoint Portal";
		int count = 0;
		for (int i=0;i<sb.length();i++){
			if(s.charAt(i)=='t'){
				count++;
			}
		}
		System.out.println("\nCount of t: "+count);
		
		String sbr;
		sbr = new String();
		System.out.println(sbr.length());  //length and string is empty

	}

}
