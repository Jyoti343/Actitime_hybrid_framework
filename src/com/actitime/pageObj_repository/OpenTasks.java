package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {

	@FindBy(linkText="Projects & Customers")
	private WebElement projAndCustLink;
	
	@FindBy(linkText="Projects & Tasks")
	private WebElement projNTasks;
	
	@FindBy(linkText="Reports")
	private WebElement reports;
	
	@FindBy(linkText="Users")
	private WebElement users;
	
	public WebElement getPNC_link(){
		return projAndCustLink;
		
	}public WebElement getProjNTasksPage(){
		return projNTasks;
	}public WebElement getReports(){
	
		return reports;
		
	}public WebElement getUsers(){
		
		return users;
	}
	
}
