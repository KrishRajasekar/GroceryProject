package org.dayone;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		//1.Mention the path Excel
		File file = new File("C:\\Users\\HARII\\eclipse-workspace1\\MavenProject1\\Excel\\New Microsoft Excel Worksheet.xlsx");
		//2.Get the Objects From file
		FileInputStream stream = new FileInputStream(file);
		//3.Create the workbook
		Workbook workbook = new XSSFWorkbook(stream);
		//4.Get the SheetName
		Sheet sheet = workbook.getSheet("Sheet2");
		//5.Iterate All row
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			//6.Get the All Row
			Row row = sheet.getRow(i);
			//7.Get the All Cell
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
			//8.Cell type STRING->TextNumeric->Num
				CellType Type = cell.getCellType();
						
				switch (Type) {
				case STRING:
					//9.Get String values
					String value = cell.getStringCellValue();
					System.out.println(value);
					break;
				case NUMERIC:
					//10.Get Date 
					if (DateUtil.isCellDateFormatted(cell)) {
						//11.date Cell
						Date dateCellValue = cell.getDateCellValue();
						//12.Date format->"D-M-Y"
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-YYYY");
						//13.Date String Value
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					
				} else {
					//1
					double d = cell.getNumericCellValue();
					//2
					long round = Math.round(d);
					//3
					if (round==d) {
						//4
					String valueOf = String.valueOf(round);
					//5
					System.out.println(valueOf);
					} else {
						String valueOf = String.valueOf(d);
						System.out.println(valueOf);

					}
				}

				default:
					break;
				}
			}
		}
	}
	
}
						
						
						


		
		
	


