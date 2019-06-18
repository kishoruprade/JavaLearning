package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadAndWrite{
	public static void main(String[] args) throws IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\UpradeK\\OneDrive - SQS Group Limited\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet  sheet = wb.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()){
			Row row = rowIterator.next();
			
			Iterator<Cell> cellIterator =row.iterator();
			
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				
				System.out.print(cell.getStringCellValue() + "\t");
				
				if (cell.getStringCellValue().equals("A4")){
					System.out.print(cell.getRowIndex() +" ");
				}
				
			}
			System.out.println(" ");
		}
	
		file.close();
		
	}
}