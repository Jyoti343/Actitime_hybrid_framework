package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {

	
	@FindBy(xpath="//span[@class='menu_link_act']")
	private WebElement users;
	
	@FindBy(xpath="//input[@value='Add New User']")
	private WebElement addNewUser_btn;
	

	@FindBy(xpath="//input[@value='Add New User']")
	private WebElement add_new_user;
	

	@FindBy(name="username")
	private WebElement username;
	

	
	@FindBy(name="passwordText")
	private WebElement passwordText;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement select_active;
	
	@FindBy(name="passwordTextRetype")
	private WebElement passwordTextRetype;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="middleName")
	private WebElement middleName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="fax")
	private WebElement fax;
	
	@FindBy(name="mobile")
	private WebElement mobile;
	
	@FindBy(name="otherContact")
	private WebElement otherContact;
	
	@FindBy(name="overtimeTracking")
	private WebElement enable_overtime_tracking;
	
	@FindBy(xpath="//select[@name='workdayDuration']")
	private WebElement select_work_duration;
	
	@FindBy(name="overtimeTrackingLevel")
	private WebElement visible_for_user;
	
	@FindBy(xpath="//input[@id='overtimeTracking_Disable']")
	private WebElement disable_overtime_tracking;
	
	@FindBy(name="rightGranted[9]")
	private WebElement enter_time_track;
	
	@FindBy(name="rightGranted[12]")
	private WebElement modify_other_users;
	
	@FindBy(name="rightGranted[1]")
	private WebElement generate_reports;
	
	@FindBy(name="rightGranted[8]")
	private WebElement prepare_invoice_data;
	
	@FindBy(name="rightGranted[2]")
	private WebElement task_hierarchy_management;
	
	@FindBy(name="rightGranted[5]")
	private WebElement sysAdmin_manage_user;
	
	@FindBy(name="rightGranted[7]")
	private WebElement sysAdmin_manage_billing_type;
	
	@FindBy(name="rightGranted[10]")
	private WebElement sysAdmin_manage_work_schedule;
	
	@FindBy(name="rightGranted[11]")
	private WebElement sysAdmin_manage_general_setting;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement create_user_btn;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement cancel_btn;
	
	public WebElement user_link(){
		
		return users;
	}
	
	public WebElement addNewUser_btn(){
		return addNewUser_btn;
	}
	
public WebElement add_new_user(){
		
		return add_new_user;
	}
public WebElement username(){
	
	return username;
}
public WebElement passwordText(){
	
	return passwordText;
}
public WebElement select_active(){
	
	return select_active;
}
public WebElement passwordTextRetype(){
	
	return passwordTextRetype;
}
public WebElement firstName(){
	
	return firstName;
}
public WebElement lastName(){
	
	return lastName;
}
public WebElement middleName(){
	
	return middleName;
}
public WebElement email(){
	
	return email;
}
public WebElement phone(){
	
	return phone;
}
public WebElement fax(){
	
	return fax;
}
public WebElement mobile(){
	
	return mobile;
}
public WebElement otherContact(){
	
	return otherContact;
}
public WebElement enable_overtime_tracking(){
	
	return enable_overtime_tracking;
}
public WebElement select_work_duration(){
	
	return select_work_duration;
}
public WebElement visible_for_user(){
	
	return visible_for_user;
}
public WebElement disable_overtime_tracking(){
	
	return disable_overtime_tracking;
}
public WebElement enter_time_track(){
	
	return enter_time_track;
}
public WebElement modify_other_users(){
	
	return modify_other_users;
}
public WebElement generate_reports(){
	
	return generate_reports;
}
public WebElement prepare_invoice_data(){
	
	return prepare_invoice_data;
}
public WebElement task_hierarchy_management(){
	
	return task_hierarchy_management;
}
public WebElement sysAdmin_manage_user(){
	
	return sysAdmin_manage_user;
}
public WebElement sysAdmin_manage_billing_type(){
	
	return sysAdmin_manage_billing_type;
}
public WebElement sysAdmin_manage_work_schedule(){
	
	return sysAdmin_manage_work_schedule;
}
public WebElement sysAdmin_manage_general_setting(){
	
	return sysAdmin_manage_general_setting;
}
public WebElement create_user_btn(){
	
	return create_user_btn;
}public WebElement cancel_btn(){
	
	return cancel_btn;
}

}
