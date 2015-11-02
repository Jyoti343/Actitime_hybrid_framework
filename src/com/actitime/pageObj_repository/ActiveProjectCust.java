package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectCust {

	
	@FindBy(xpath="//input[@onclick='addCustomer(this.form)']")
	private WebElement clickCustBtn; 
	
	@FindBy(xpath="//table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[2]")
	private WebElement addNewProjBtn;
	
	@FindBy(xpath="//input[normalize-space(@value)='Show']")
	private WebElement clickOnShowBtn;
	
	
	
	
	
	
	@FindBy(xpath="//select[@name='recordsPerPage']")
	private WebElement selectAllCustLst;
	
	public WebElement getSelectAllCustLst() {
		return selectAllCustLst;
	}

	
	
	
	
	
	
	public WebElement clickCustBtn(){
		
		return clickCustBtn;
	}public WebElement clickOnNewProj(){
		
		return addNewProjBtn;
	}public WebElement clickOnShowBtn(){
		
		return clickOnShowBtn;
	}
	
	
	
}
