package com.actitime.generic_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	
	String path="C:\\Users\\JYOTI\\Desktop\\test_dat.xlsx";
	FileInputStream fis;
	FileOutputStream fos;
	public String getExcelData(String sheetName,int rowCount,int colCount) throws InvalidFormatException, IOException{
		
		fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowCount);
		String data=rw.getCell(colCount).getStringCellValue();
		return data;
		
	}
	
	public int rowCount(String sheetName) throws InvalidFormatException, IOException{
	
		
		fis=new FileInputStream(path);
		int rowC=WorkbookFactory.create(fis).getSheet(sheetName).getLastRowNum();
		return rowC;	
	}
	
	public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws InvalidFormatException, IOException{
		
		fis=new FileInputStream(path);
	    Row row=WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum);	
	    
	    Cell cell=row.createCell(colNum);
	    cell.setCellType(cell.CELL_TYPE_STRING);
	    
	    fos=new FileOutputStream(path);
	  
	    Workbook wb = null;
	    wb.write(fos);
	    
	    
	
	}

}
