package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewProject {
	
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement chooseCust;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement assignProj;
	
	@FindBy(name="description")
	private WebElement projDescription;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjBtn;
	
	public WebElement chooseCust(){
		
		return chooseCust;
	}public WebElement assignProj(){
		
		return assignProj;
	}public WebElement projDescription(){
		
		return projDescription;
	}public WebElement createprojBtn(){
		
		return createProjBtn;
	}

}
