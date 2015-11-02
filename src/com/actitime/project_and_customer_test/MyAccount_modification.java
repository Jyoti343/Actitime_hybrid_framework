package com.actitime.project_and_customer_test;

import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.business_lib.ProjectAndCustomerLib;
import com.actitime.generic_lib.ExcelLib;
import com.actitime.generic_lib.WebDriverCommonLib;

public class MyAccount_modification {
	
	ExcelLib elib;
	WebDriverCommonLib wlib;
	ProjectAndCustomerLib blib;
	
	@BeforeClass
	public void configBeforeClass(){
		
		elib=new ExcelLib();
		wlib=new WebDriverCommonLib();
		blib=new ProjectAndCustomerLib();
	}
	@BeforeMethod
	public void logInToApp() throws IllegalFormatException, IOException, InvalidFormatException{
		
		String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 21, 1);
		blib.logIn(uName, passw);
		/*String curPasw=elib.getExcelData("Sheet3",0,0);
		String newPasw=elib.getExcelData("Sheet3",0,1);
		String phone=elib.getExcelData("Sheet3",0,2);
		System.out.printf(curPasw,newPasw,phone);*/
	}@Test
	public void MyAccount() throws InvalidFormatException, IOException{
		
//		blib.goToMyAcc();
		String curPasw=elib.getExcelData("Sheet3",0,1);
		String newPasw=elib.getExcelData("Sheet3",0,1);
		String phone=elib.getExcelData("Sheet3",0,2);
		String email=elib.getExcelData("Sheet3",0,3);
		String newName=elib.getExcelData("Sheet3",0, 4);
		blib.modifyProfile(curPasw, newPasw, phone, email, newName);
	}//@AfterMethod
	public void logOut() throws InvalidFormatException, IOException{
		
		blib.logout();
		String uName=elib.getExcelData("Sheet2", 5, 2);
		String passw=elib.getExcelData("Sheet2", 21, 1);
		blib.logIn(uName, passw);
	}

}
