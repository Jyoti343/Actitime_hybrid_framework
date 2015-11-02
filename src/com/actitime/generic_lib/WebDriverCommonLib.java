package com.actitime.generic_lib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	Select sel;
	Alert alt;
	boolean flag=false;
	
	public static void waitForPageToLoad(){ 
		
		Driver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void waitForWebLinkTextPresrent(String linkText){
		
		WebDriverWait wait=new WebDriverWait(Driver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
	}
	
	public void waitForXpathPresent(String wbXpath){ 
		
		WebDriverWait wait=new WebDriverWait(Driver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbXpath)));
	}
	
	public boolean verifyText(String  wbXpath,String expectedText){
		
		String actText=Driver.driver.findElement(By.xpath(wbXpath)).getText();
		if(actText.equals(expectedText)){
			flag=true;
			System.out.println("Text is verified and decided to be present.");
		}else
			System.out.println("Text is not verified.");
		
		return flag;
		
	}
	
	public boolean  verifyTextPresent(String expectedString){
		
		flag
		=false;
		String entireHtmlPage=Driver.driver.getPageSource();
		if(entireHtmlPage.contains(expectedString)){
			flag= true;
			System.out.println(expectedString+"is present in UI");
		}else{
			System.out.println(expectedString+"is not present in UI");
		}
		
		return flag;
	}
	
	
	public void select(String xpath,String value){
		 sel=new Select(Driver.driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(value);
			
	}public void select(String xpath,int index){
		
		 sel=new Select(Driver.driver.findElement(By.xpath(xpath)));
		sel.selectByIndex(index);
	}public void select(WebElement wbEl,int index){
		
		 sel=new Select(wbEl);
		sel.selectByIndex(index);
	}public void selectByValue(WebElement wbEl,String value){
		
		 sel=new Select(wbEl);
		sel.selectByValue(value);
	}public void select(WebElement wbEl,String value){
		
		 sel=new Select(wbEl);
		sel.selectByVisibleText(value);
	}
	
	public void getOptions(WebElement wbEl,String expCust){
		flag=true;
		sel=new Select(wbEl);
		List<WebElement> lst=sel.getOptions();
		for(int i=0;i<lst.size();i++){
			
			String actCust=lst.get(i).getText();
			if(expCust.equals(actCust)){
				flag=false;
			    break;
			}
		}if(!flag)
			System.out.println(expCust+" named customer is really present.");
		else
			System.out.println(expCust+" named customer is not found.");
			
	}
	
	public void accept(){
		
		 alt=Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}public void dismissAlert(){
		
	 alt=Driver.driver.switchTo().alert();
	 System.out.println(alt.getText());
	 alt.dismiss();
	}
}
