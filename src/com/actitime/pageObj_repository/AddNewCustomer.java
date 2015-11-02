package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {

	
	@FindBy(name="name")
	private WebElement cName;
	
	@FindBy(name="description")
	private WebElement cDesc;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCust;
	
	
	public WebElement getCName(){
		return cName;
				
	}public WebElement getCDesc(){
		return cDesc;
	}public WebElement createCu(){
		
		return createCust;
	}
}
