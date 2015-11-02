package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectNCustomer_page {

	
	@FindBy(xpath="//select[@name='selectedCustomer']")
	public WebElement selectTab;
	
	public WebElement selectTab(){
		
		return selectTab;
	}
}
