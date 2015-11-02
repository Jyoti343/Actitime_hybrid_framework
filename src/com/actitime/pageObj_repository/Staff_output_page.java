package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Staff_output_page {

	
	@FindBy(xpath="//input[@id='users_all']")
	private WebElement chooseStaff; 
	
	@FindBy(xpath="//select[@name='firstGrouping']")
	private WebElement chooseCustomer; 
	
	@FindBy(xpath="//select[@name='secondGrouping']")
	private WebElement chooseProject; 
	
	@FindBy(xpath="//select[@name='detailsLevel']")
	private WebElement chooseTasksType; 
	
	@FindBy(xpath="//input[@class='daterangebutton' and @value='Set Current Week']")
	private WebElement specifyDateRange; 
	
	@FindBy(xpath="//input[@id='customerProjectStatus_all']")
	private WebElement chooseCNP; 
	
	@FindBy(xpath="//input[@name='genCSV']")
	private WebElement genReport;
	
	public WebElement chooseStaffCheckBox(){
		
		return chooseStaff;
	}public WebElement chooseCusromer_select(){
		
		return chooseCustomer;
	}public WebElement chooseProject_select(){
		
		return chooseProject;
	}public WebElement chooseTasksType(){
		
		return chooseTasksType;
	}public WebElement specifyDataRange_btn(){
		
		return specifyDateRange;
	}public WebElement chooseCNP_radiobtn(){
		
		return chooseCNP;
	}public WebElement genReport_click(){
		
		return genReport;
	}
	
}
