package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\excel.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(3);
		Cell cel = row.createCell(7);
		cel.setCellValue("chetan");
		
		FileOutputStream fis = new FileOutputStream("C:\\Users\\HP\\Downloads\\excel.xlsx");
		book.write(fis);
		book.close();
		
		

	}

}
