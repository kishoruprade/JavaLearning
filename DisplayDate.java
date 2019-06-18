import java.util.Date;

public class DisplayDate {

	public static void main(String[] args) {
		//Display current system date and time
		Date currentDate = new Date();
		
		System.out.println(currentDate.toString());
		String str = currentDate.toString();
		if(str.contains("Apr 11")){
			System.out.println("System is running corrrectly");
		}else{
			System.out.println("Invalid time shows");
		}
		

	}

}
