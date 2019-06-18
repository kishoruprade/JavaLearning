package excelReadAndWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWrite {

	public static void main(String[] args) throws IOException {
		// load file
		FileInputStream fis = new FileInputStream("C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\SeleniumJava_Class\\AutoExcel.xlsx");
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load Sheet
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		
       
	}

}
