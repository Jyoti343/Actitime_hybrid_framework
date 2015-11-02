package com.actitime.project_and_customer_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.Driver;
import com.actitime.generic_lib.ExcelLib;
import com.actitime.generic_lib.ReportLib;
import com.actitime.generic_lib.WebDriverCommonLib;

public class ProjectAndCustomerTest {

	
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
		
		blib.navigateToCustPage();
	}
	
    @Test
	public void createCustomer() throws InvalidFormatException, IOException{
		
		String custName=elib.getExcelData("Sheet2", 4, 0);
		blib.createCustomer(custName);  
		String fileName=elib.getExcelData("Sheet2", 4, 0);
		rlib.getScreenShot(fileName);
		
		String custName1=elib.getExcelData("Sheet2", 5, 0);
		blib.createCustomer(custName1);
		String fileName1=elib.getExcelData("Sheet2", 5, 0);
		rlib.getScreenShot(fileName1);
		
		String custName2=elib.getExcelData("Sheet2", 6, 0);
		blib.createCustomer(custName2);
		String fileName2=elib.getExcelData("Sheet2", 6, 0);
		rlib.getScreenShot(fileName2);
		
		String custName3=elib.getExcelData("Sheet2", 7, 0);
		blib.createCustomer(custName3);
		String fileName3=elib.getExcelData("Sheet2", 7, 0);
		rlib.getScreenShot(fileName3);
		
		String custName4=elib.getExcelData("Sheet2", 8, 0);
		blib.createCustomer(custName4);
		String fileName4=elib.getExcelData("Sheet2", 8, 0);
		rlib.getScreenShot(fileName4);
		
		String custName5=elib.getExcelData("Sheet2", 9, 0);
		blib.createCustomer(custName5);
		String fileName5=elib.getExcelData("Sheet2", 9, 0);
		rlib.getScreenShot(fileName5);
		
		String custName6=elib.getExcelData("Sheet2", 10, 0);
		blib.createCustomer(custName6);
		String fileName6=elib.getExcelData("Sheet2", 10, 0);
		rlib.getScreenShot(fileName6);
		
		String custName7=elib.getExcelData("Sheet2", 11, 0);
		blib.createCustomer(custName7);
		String fileName7=elib.getExcelData("Sheet2", 11, 0);
		rlib.getScreenShot(fileName7);
		
		String custName8=elib.getExcelData("Sheet2", 12, 0);
		blib.createCustomer(custName8);
		String fileName8=elib.getExcelData("Sheet2", 12, 0);
		rlib.getScreenShot(fileName8);
		
		String custName9=elib.getExcelData("Sheet2", 13, 0);
		blib.createCustomer(custName9);
		String fileName9=elib.getExcelData("Sheet2", 13, 0);
		rlib.getScreenShot(fileName9);
		
		String custName10=elib.getExcelData("Sheet2", 14, 0);
		blib.createCustomer(custName10);
		String fileName10=elib.getExcelData("Sheet2", 14, 0);
		rlib.getScreenShot(fileName10);
		
		
//		blib.navigateCustomerDetailsPage(custName);
	}
	
	@Test
	public void deleteCust() throws InvalidFormatException, IOException{
		
		/*String custToBeDeleted=elib.getExcelData("Sheet2",1,5);
		blib.deleteCust(custToBeDeleted);*/
		
		
		String custName=elib.getExcelData("Sheet2", 4, 0);
		blib.deleteCust(custName);  
		
		String custName1=elib.getExcelData("Sheet2", 5, 0);
		blib.deleteCust(custName1);
		
		String custName2=elib.getExcelData("Sheet2", 6, 0);
		blib.deleteCust(custName2);
		
		String custName3=elib.getExcelData("Sheet2", 7, 0);
		blib.deleteCust(custName3);
		
		String custName4=elib.getExcelData("Sheet2", 8, 0);
		blib.deleteCust(custName4);
		
		String custName5=elib.getExcelData("Sheet2", 9, 0);
		blib.deleteCust(custName5);
		
		String custName6=elib.getExcelData("Sheet2", 10, 0);
		blib.deleteCust(custName6);
		
		String custName7=elib.getExcelData("Sheet2", 11, 0);
		blib.deleteCust(custName7);
		
		String custName8=elib.getExcelData("Sheet2", 12, 0);
		blib.deleteCust(custName8);
		
		String custName9=elib.getExcelData("Sheet2", 13, 0);
		blib.deleteCust(custName9);
		
		String custName10=elib.getExcelData("Sheet2", 14, 0);
		blib.deleteCust(custName10);
		
	}@Test
	public void addProjectToCustomer() throws InvalidFormatException, IOException{
		
		String value=elib.getExcelData("Sheet2",2,0);
		String projName=elib.getExcelData("Sheet2", 2,1);
		String projDescription=elib.getExcelData("Sheet2",1,2);
		blib.assignProject(value, projName, projDescription);
	}
	
	@AfterMethod
	public void logout(){
		
		blib.logout();
	}
	
	@AfterClass
	public void closeBrowser(){
		
		Driver.driver.quit();
	}
	
}
