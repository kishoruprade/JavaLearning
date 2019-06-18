package currentDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentSystemDateAndTime {

	public static void main(String[] args) {
		
		String str = " ";
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dat = new Date();
		
		
		System.out.println(dt.format(dat));
		
		
	
		
	
		
		
		

	}

}
