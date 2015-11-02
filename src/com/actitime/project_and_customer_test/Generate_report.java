package com.actitime.project_and_customer_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.ExcelLib;
import com.actitime.generic_lib.WebDriverCommonLib;

public class Generate_report {
	
	ExcelLib elib;
	WebDriverCommonLib wlib;
    ProjectAndCustomerLib blib;
    
    @BeforeClass
    public void configBeforeClass(){
       
    	elib=new ExcelLib();
    	wlib=new WebDriverCommonLib();
    	blib=new ProjectAndCustomerLib();
    	
    	
    }@BeforeMethod
    public void logIn() throws InvalidFormatException, IOException{
    	
    	String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 21, 1);
		blib.logIn(uName, passw);
    }@Test
    public void reportSheet() throws InvalidFormatException, IOException{
    	
    	String custName=elib.getExcelData("Sheet2", 1, 0);
    	String projectName=elib.getExcelData("Sheet2", 1,1);
        blib.generateReport(custName, projectName);
    }
    
}
