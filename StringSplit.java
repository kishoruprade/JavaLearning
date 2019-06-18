
public class StringSplit {

	public static void main(String[] args) {
		String str = "Welcome to Goa Singham";
		String[] strSplit = str.split("\\s");
		
		for (int i=0;i<strSplit.length;i++){
		System.out.println(strSplit[i]);
		}
		
		String[] strSplit2 = str.split("\\d");
		for (int j=0;j<strSplit2.length;j++)
		{
			System.out.println(strSplit2[j]);
		}
		
		String abc = "";
		System.out.println(abc);   // Nothing will print

	}

}
