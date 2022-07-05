package workingWithExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataUsingEnhancedForLoop {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("ExcelOperations");
		
		Object empData[][] = {{"Name","JobId"},{"Nandha Kumar","101"},{"Rohan","102"}};
		
		//Writing data into excel using enhanced for loop
		int rowCount=0;
		
		
		for(Object emp[]:empData)
		{
			XSSFRow row = sheet.createRow(rowCount++);
			int colCount=0;
			
			for(Object value:emp)
			{
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
	
		String filePath = ".\\Data_Folder\\EmpData.xlsx";
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		outputStream.close();	

	}

}
