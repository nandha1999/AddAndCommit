package workingWithExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath=".//Data_Folder//READING_EXCEL.xlsx";
		FileInputStream inputStream = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		// Getting the last row and cell number in the excel worksheet
		
//		int rows = sheet.getLastRowNum();
//		int cells = sheet.getRow(0).getLastCellNum();
//		
//		System.out.println(rows +" "+cells);
//		
		//iterating through rows and cells to print the value inside each cell using a nested for loop
		
//		for(int r=1;r<=rows;r++)
//		{
//			XSSFRow currentRow = sheet.getRow(r);
//			for(int c=0;c<cells;c++)
//			{
//				XSSFCell currentCell = currentRow.getCell(c);
//				switch(currentCell.getCellType())
//				{
//					case STRING:System.out.print(currentCell.getStringCellValue());break;
//					case NUMERIC:System.out.print(currentCell.getNumericCellValue());break;
//					case BOOLEAN:System.out.print(currentCell.getBooleanCellValue());break;
//					
//				}
//				System.out.print(" | ");
//			}
//			System.out.println();
//			
//		}
		
		// Reading excel files using iterator method
		
		Iterator rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext())
		{
			XSSFRow row = (XSSFRow) rowIterator.next();
			
			Iterator cellIterator = row.iterator();
			
			while(cellIterator.hasNext()) {
				
				XSSFCell cell = (XSSFCell) cellIterator.next();
				
				switch(cell.getCellType())
				{
				
				case STRING : System.out.print(cell.getStringCellValue());break;
				case NUMERIC : System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN : System.out.print(cell.getBooleanCellValue());break;
				
				
				
				}
				System.out.print(" | ");
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
