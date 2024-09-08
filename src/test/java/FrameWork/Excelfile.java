package FrameWork;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {

	public static void main(String[] args) throws Throwable {
		
		

			
				// TODO Auto-generated method stub
				
				FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\excel.xlsx");
				
				Workbook book = WorkbookFactory.create(file);
				Sheet sheet = book.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			Cell cel = row.getCell(0);
			String excelData = cel.getStringCellValue();
			System.out.println(excelData);
			

			}

		
		// TODO Auto-generated method stub

	}


