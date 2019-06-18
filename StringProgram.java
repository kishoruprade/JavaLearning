package infostretch;

public class StringProgram {

	public static void main(java.lang.String[] args) {
		String str = "Welcome to Java and Seleniium";
		char[] rev =  str.toCharArray();
		
		String[] s = str.split("\\s");
		
		for (int i=str.length()-1;i>=0;i--){
			System.out.print(rev[i]);
		}
		
		
		
		
		

	}

}
