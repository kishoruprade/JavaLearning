
public class StringReverseTest {

	public static void main(String[] args) {
		String str = "Welcome to Selenium";
			String revstr = "";
		
			
			//logic one
		for (int i = str.length()-1;i>=0;i--){
			revstr = revstr + str.charAt(i);
		}	
		System.out.println(revstr);
		
		String str1 = "Welcome to Selenium";
		String revstr1 = "";
		
		//another logic
		for (int i = str1.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}

}
