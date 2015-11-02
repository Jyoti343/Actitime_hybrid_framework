package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.generic_lib.WebDriverCommonLib;

public class EditCustomerInfo {

	@FindBy()
	private WebElement custInfo;
	
	
	public WebElement custInfo(){
		
		return custInfo;
	}
}
