package org.dayone;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewWorkbook {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\HARII\\eclipse-workspace1\\MavenProject1\\Excel\\Sample.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Raja");
		
		Row row = sheet.createRow(10);
		
		Cell cell = row.createCell(2);
		
		cell.setCellValue("Prakash");
		
		FileOutputStream out = new FileOutputStream(file);
		
		workbook.write(out);
	
	}

}
