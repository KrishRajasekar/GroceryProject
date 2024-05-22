package org.dayone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\\\Users\\\\HARII\\\\eclipse-workspace1\\\\MavenProject1\\\\Excel\\\\OmrBranch.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("OmrBranchDetails");
		
		
				}
				
				
				
			}
			
		
	


	