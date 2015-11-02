package com.actitime.project_and_customer_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.ExcelLib;
import com.actitime.generic_lib.ReportLib;
import com.actitime.generic_lib.WebDriverCommonLib;

public class User_alter_test {
	
	ExcelLib elib;
	ReportLib rlib;
	WebDriverCommonLib wlib;
	ProjectAndCustomerLib blib;
	
	@BeforeClass
	 public void configBeforeClass(){
		
		elib=new ExcelLib();
	    rlib=new ReportLib();
		wlib=new WebDriverCommonLib();
		blib=new ProjectAndCustomerLib();
	}
	
	@BeforeMethod
	public void loginToApp() throws InvalidFormatException, IOException{	
		
		String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 21, 1);
		//login to application
		blib.logIn(uName, passw);
		
		//blib.navigateToCustPage();
	}
	
	
	@Test
	public void create_user() throws InvalidFormatException, IOException{
		
		String uName=elib.getExcelData("Sheet2", 26,0);
		String passw=elib.getExcelData("Sheet2", 26,1);
		String fName=elib.getExcelData("Sheet2", 26,2);
		String lName=elib.getExcelData("Sheet2", 26,3);
		String gmail=elib.getExcelData("Sheet2", 26,4);
		String phone=elib.getExcelData("Sheet2", 26,5);
		String fax=elib.getExcelData("Sheet2", 26,6);
		String mobile=elib.getExcelData("Sheet2", 26,7);
		String otherContact=elib.getExcelData("Sheet2",26 ,8);
		blib.createUsers(uName, passw, fName, lName, phone,fax, mobile, otherContact);
		
	}

}
