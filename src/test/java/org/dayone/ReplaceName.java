package org.dayone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReplaceName {
		
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\HARII\\eclipse-workspace1\\MavenProject1\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet2");
		
//		Row row = sheet.getRow(4);
//		
//		Cell cell = row.getCell(0);
//		// Get the next value from cell
//		String value = cell.getStringCellValue();
//		//Verify cell data is equal to selenium
//		if (value.equals("Ajith")) {
//			//Set value in cell
//			cell.setCellValue("Dharmesh");	
//		}
//		//Convert object textfile
//		FileOutputStream outputStream = new FileOutputStream(file);
//		//Write in workbook
//		workbook.write(outputStream);
		
//		// Cell is empty
//		Row row = sheet.getRow(1);
//		//Create cell
//		Cell cell = row.createCell(9);
//		//Set value in Cell
//		cell.setCellValue("Rajasekar");
//		//Convert object to file
//		FileOutputStream out = new FileOutputStream(file);
//		//Write in Workbbok
//		workbook.write(out);
		
//		Row row = sheet.createRow(7);
//		
//		Cell cell = row.createCell(1);
//		
//		cell.setCellValue("Rajasekar");
//		
//		FileOutputStream out = new FileOutputStream(file);
//		
//		workbook.write(out);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
