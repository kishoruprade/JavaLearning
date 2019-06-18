package infostretch;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Welcome to JavatPoint";
		String[] ss = s.split("\\s");
		
		for (int i = 0;i<ss.length;i++){
			for (int j=ss[i].length()-1;j>=0;j--){
				System.out.print(ss[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
