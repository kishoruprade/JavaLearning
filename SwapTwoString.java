package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SwapTwoString {

	public static void main(String[] args) throws IOException {
		String str1 = "Welcome";
		String str2 = "Java";
		
		System.out.println(str1+" "+str2);
		
		str1 = str1+str2;                             //Storing all string into one
		str2 = str1.substring(0,(str1.length()-str2.length()));       //swapping str2
		str1 = str1.substring(str2.length());            //swappping str1
		
		System.out.println(str1+" "+str2);

		
		
		
		
		
		
	}	
}
