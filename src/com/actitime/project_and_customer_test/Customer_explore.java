package com.actitime.project_and_customer_test;
import java.io.IOException;
import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.ExcelLib;

public class Customer_explore {

	
	ExcelLib elib;
//	WebDriverCommonLib wlib;
	ProjectAndCustomerLib blib;
	
	@BeforeClass
	public void configBeforeClass(){
		
		elib=new ExcelLib();
	//	wlib=new WebDriverCommonLib();
		blib=new ProjectAndCustomerLib();
	}
	@BeforeMethod
	public void logInToApp() throws InvalidFormatException, IOException{
		
		String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 5, 4);
		blib.logIn(uName, passw);
	}@Test
	public void verifyCustomer() throws InvalidFormatException, IOException{
		//Logger rootLogger=LogManager.getRootLogger();
		String expCustName=elib.getExcelData("Sheet2", 1, 0);
	     blib.verifyCustToBePresent(expCustName);
	}
}
