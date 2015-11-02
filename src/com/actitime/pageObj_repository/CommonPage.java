package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.generic_lib.WebDriverCommonLib;

public class CommonPage {

	
	@FindBy(xpath="//img[@hspace='10']")
	private WebElement logOutBtn;
	
	public WebElement getOutOf(){
		
		return logOutBtn;
	}
}
