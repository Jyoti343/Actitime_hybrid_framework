package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {
	
	@FindBy(linkText="My Account")
	private WebElement myAccLink;
	
	@FindBy(name="passwordCur")
	private WebElement currPassword;
	
	@FindBy(name="passwordNew")
	private WebElement newPassword;
	
	@FindBy(name="passwordRetype")
	private WebElement retypePassword;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="email")
	private WebElement email;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveChangesClick;
	
	public WebElement myAccLink(){
		return myAccLink;
	}public WebElement currPassword(){
		return currPassword;
	}public WebElement newPassword(){
		return newPassword;
	}public WebElement retypePassword(){
		return retypePassword;
	}public WebElement firstName(){
		return firstName;
	}public WebElement phone(){
		return phone;
	}public WebElement email(){
		return email;
	}public WebElement saveChangesClick(){
		return saveChangesClick;
	}
	

}
