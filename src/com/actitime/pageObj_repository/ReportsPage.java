package com.actitime.pageObj_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage {
	
	@FindBy(linkText="Reports")
	private WebElement reportsPage;
	
	@FindBy(linkText="Staff Output Report")
	private WebElement staffOutputReport;
	
	@FindBy(linkText="Billing Summary Report")
	private WebElement billingSummryReport;
	
	@FindBy(linkText="Overtime Report")
	private WebElement overTimereport;
	
	@FindBy(linkText="Prepare Invoice Data")
	private WebElement prepareInvoiceData;
	
    public WebElement reportsPage(){
		
		return reportsPage;
	}
	public WebElement staffingOutputReportLink(){
		
		return staffOutputReport;
	}
	
    public WebElement BillingSummryReportLink(){
		
		return billingSummryReport;
     	}
    public WebElement OverTimereportLink(){
	
	return overTimereport;
        }
    public WebElement PrepareInvoiceDataLink(){
	
	return prepareInvoiceData;
       }

    }
