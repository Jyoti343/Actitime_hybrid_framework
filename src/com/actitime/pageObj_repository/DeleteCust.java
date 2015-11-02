package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCust {

	
	@FindBy(linkText="Projects & Customers")
	private WebElement goToCustPage;
	
	@FindBy(xpath="//select[@name='selectedCustomer']")
	private WebElement amongCustomers;
	
	
	
	public WebElement goToCustPage(){
		
		return goToCustPage;
	}
	public WebElement selectAmongCust(){
		
		return amongCustomers;
	}
}
