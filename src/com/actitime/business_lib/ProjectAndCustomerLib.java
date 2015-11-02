package com.actitime.business_lib;

import org.apache.bcel.generic.DDIV;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic_lib.Driver;
import com.actitime.generic_lib.WebDriverCommonLib;
import com.actitime.pageObj_repository.ActiveProjectCust;
import com.actitime.pageObj_repository.AddNewCustomer;
import com.actitime.pageObj_repository.AddNewProject;
import com.actitime.pageObj_repository.CommonPage;
import com.actitime.pageObj_repository.DeleteCust;
import com.actitime.pageObj_repository.Login;
import com.actitime.pageObj_repository.MyAccount;
import com.actitime.pageObj_repository.OpenTasks;
import com.actitime.pageObj_repository.ProjectNCustomer_page;
import com.actitime.pageObj_repository.ReportsPage;
import com.actitime.pageObj_repository.Staff_output_page;
import com.actitime.pageObj_repository.UserPage;
import com.gargoylesoftware.htmlunit.Page;
import com.sun.jna.platform.win32.Netapi32Util.User;

public class ProjectAndCustomerLib extends WebDriverCommonLib{
    
	Login loginPage=PageFactory.initElements(Driver.driver,Login.class);
	OpenTasks openTasks=PageFactory.initElements(Driver.driver, OpenTasks.class);
	ActiveProjectCust activProjCust=PageFactory.initElements(Driver.driver, ActiveProjectCust.class);
    AddNewCustomer addNewCust=PageFactory.initElements(Driver.driver, AddNewCustomer.class);
    DeleteCust deleteCust=PageFactory.initElements(Driver.driver, DeleteCust.class);
    AddNewProject addNewProj=PageFactory.initElements(Driver.driver, AddNewProject.class);
    CommonPage commonPage=PageFactory.initElements(Driver.driver, CommonPage.class);
    ProjectNCustomer_page proNCustPage=PageFactory.initElements(Driver.driver, ProjectNCustomer_page.class);	
    ReportsPage reportPage=PageFactory.initElements(Driver.driver, ReportsPage.class);
	Staff_output_page staffOutputPage=PageFactory.initElements(Driver.driver, Staff_output_page.class);
	MyAccount myAccount=PageFactory.initElements(Driver.driver, MyAccount.class);
	UserPage userPage=PageFactory.initElements(Driver.driver, UserPage.class);
	
    public void logIn(String userName,String password){
		
		Driver.driver.get("http://127.0.0.1:82/login.do");
		loginPage.getUserNameEdt().sendKeys(userName);
	    loginPage.getPasswEdt().sendKeys(password);
	    loginPage.getSubmitButton().click();
	    waitForPageToLoad();
	}

	
	public void navigateToCustPage(){
		openTasks.getPNC_link().click();
		
	}
	
	public void createCustomer(String custName){
		
		activProjCust.clickCustBtn().click();
		waitForPageToLoad();
		
		addNewCust.getCName().sendKeys(custName);
		addNewCust.getCDesc().sendKeys("Sunny leone");
		addNewCust.createCu().click();
		WebDriverCommonLib.waitForPageToLoad();
	}
/*  //copied	
	public void navigateCustomerDetailsPage(String customerName){
		
		select(activProjCust.getSelectAllCustLst(), "100");
		waitForWebLinkTextPresrent(customerName);
		Driver.driver.findElement(By.linkText(customerName)).click();
		waitForPageToLoad();
	}*/
	
	public void deleteCust(String dltCust){
	//	openTasks.getPNC_link().click();
		select(deleteCust.selectAmongCust(),dltCust);
		activProjCust.clickOnShowBtn().click();
		
		//it's need to be modified
		
		Driver.driver.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[2]/td[1]/a[2]")).click();
		Driver.driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		
		accept();
	}
	
	public void verifyCustToBePresent(String name){
		
		openTasks.getPNC_link().click();
		getOptions(proNCustPage.selectTab,name);
	}
	
	public void generateReport(String custName,String projectName){
		reportPage.reportsPage().click();
		staffOutputPage.chooseStaffCheckBox().click();
		select(staffOutputPage.chooseCusromer_select(), 1);
		select(staffOutputPage.chooseProject_select(), 3);
		select(staffOutputPage.chooseTasksType(),0);
		staffOutputPage.chooseCNP_radiobtn().click();
		staffOutputPage.genReport_click().click();
		accept();
	}
	
	public void modifyProfile(String curPasw,String newPasw,String phone,String email,String newName){
		
		myAccount.myAccLink().click();
		myAccount.currPassword().sendKeys(curPasw);
		myAccount.newPassword().sendKeys(newPasw);
		myAccount.retypePassword().sendKeys(newPasw);
		myAccount.firstName().clear();
		myAccount.firstName().sendKeys(newName);
		myAccount.email().clear();
		myAccount.email().sendKeys(email);
		myAccount.phone().clear();
		myAccount.phone().sendKeys(phone);
		myAccount.saveChangesClick().click();
		
	}public void goToMyAcc(){
		myAccount.myAccLink().click();
	}
	
	
	public void assignProject(String value,String projName,String projDescription){ 
		
		activProjCust.clickOnNewProj().click();
		//openTasks.getProjNTasksPage().click();
		select(addNewProj.chooseCust(),value);
		addNewProj.assignProj().sendKeys(projName);
		addNewProj.projDescription().sendKeys(projDescription);
		addNewProj.createprojBtn().click();
	}
	
	public void createUsers(String uName,String passw,String fName,String lName,String phone,
			String fax,String mobile,String otherContact){
		userPage.user_link().click();
		
		waitForPageToLoad();
		userPage.addNewUser_btn().click();
		waitForPageToLoad();
		
		userPage.username().sendKeys(uName);
		userPage.passwordText().sendKeys(passw);
		userPage.passwordTextRetype().sendKeys(passw);
		select(userPage.select_active(),1);
		
		userPage.firstName().sendKeys(fName);
		userPage.lastName().sendKeys(lName);
		userPage.middleName().sendKeys("");
		userPage.phone().sendKeys(phone);
		
		userPage.fax().sendKeys(fax);
		userPage.mobile().sendKeys(mobile);
		userPage.otherContact().sendKeys(otherContact);
		
		userPage.enable_overtime_tracking().click();
		select(userPage.select_work_duration(),3);
		userPage.visible_for_user();
		userPage.enter_time_track().click();
		userPage.generate_reports().click();
		userPage.prepare_invoice_data().click();
		userPage.task_hierarchy_management();
		userPage.sysAdmin_manage_user().click();
		userPage.sysAdmin_manage_billing_type().click();
		userPage.sysAdmin_manage_work_schedule().click();
		userPage.sysAdmin_manage_general_setting().click();
		
		userPage.create_user_btn().click();
		
		
	}
	
	
	public void logout(){
		
		commonPage.getOutOf().click();
	}

	
	
}
