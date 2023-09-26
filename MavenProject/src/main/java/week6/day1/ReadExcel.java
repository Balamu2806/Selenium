package week6.day1;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("data/CreateData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row; 
		
		//to get row count in the excel
		int rowCount = sheet.getLastRowNum();
		System.out.println("The total number of Row is : "+rowCount);
		
		//to get column count in the excel
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The total number of Column is : "+columnCount);
		
		// get all the values in the excel ->Iterate via loop
		String cellValue;
		for (int i = 1; i <=rowCount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				cellValue = row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
				
			}
			
		}
		
		
	}
	
}


