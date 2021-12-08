package com.qa.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * This method is used to get the data from excel sheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return required cell value from excel sheet
	 * @throws Throwable
	 */
	public String getExcelData(String sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream file=new FileInputStream(IpathConstant.EXCELFILE_PATH);
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}

}

