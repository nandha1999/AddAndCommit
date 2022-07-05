package workingWithExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// Writing data from 2 Dimensional Array into excel worksheet using nested forloop
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EmpDa");
		
		Object empData[][] = {{"Name","Job_Id"},{"nandha",101},{"mark antony",595}};
		
		int rows = empData.length;
		int cols = empData[0].length;
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empData[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
			
		}
		
		String filePath = ".\\Data_Folder\\Writing_Into_ExcelSheet.xlsx";
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		outputStream.close();
		System.out.println("Excel file has been written successfully");
			

	}

}
