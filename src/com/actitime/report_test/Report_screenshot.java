package com.actitime.report_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.ExcelLib;
import com.actitime.generic_lib.ReportLib;

public class Report_screenshot {
	
	
	ExcelLib elib;
	ReportLib  rlib;
	ProjectAndCustomerLib blib;
	
	@BeforeClass
	public void configBeforeClass(){
		
		elib=new ExcelLib();
		rlib=new ReportLib();
		blib=new ProjectAndCustomerLib();
	}
	@BeforeMethod
	public void logInToApp() throws InvalidFormatException, IOException{
		
		String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 21, 1);
		blib.logIn(uName, passw);
	}@Test
	public void takeAScreenshot() throws IOException, InvalidFormatException{
		String fileName=elib.getExcelData("Sheet2", 3, 0);
		rlib.getScreenShot(fileName);
		
		
	}

}
