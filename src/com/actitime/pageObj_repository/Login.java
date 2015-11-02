package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.generic_lib.WebDriverCommonLib;

public class Login {

	
	@FindBy(xpath="//tbody/tr[2]/td[2]/input")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwEdt;
	
	@FindBy(xpath="//tbody/tr[6]/td[2]/input")
	private WebElement submit;
	
	
	public WebElement getUserNameEdt(){
		
		return userNameEdt;
	}public WebElement getPasswEdt(){
		return passwEdt;
		
	}public WebElement getSubmitButton(){
		
		return submit;
	}
	
}
