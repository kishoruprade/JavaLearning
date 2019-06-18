package currentDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//Zensar question identify the outdated version using Java program
public class SystemCurrentTime {

	public static void main(String[] args) {
		String[][] ver = {{"abc","bcbcn","bcbc"},{"jdjd","fhfhf","19/03/31"}};	
			                
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		String str = dtf.format(now);
		System.out.println(str);
		
		for(String[] i: ver){
			if(str.equals(i)){
				System.out.println("version is not outdated");
			}
			else{
				System.out.println("version is outdated");
			}
		}
		
		
		

	}

}
