package com.actitime.generic_lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ReportLib {
	
	public void getScreenShot(String fileName) throws IOException{
		
		EventFiringWebDriver eDriver=new EventFiringWebDriver(Driver.driver);
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("C:\\Users\\JYOTI\\Desktop\\screen_shot\\"+fileName+".png");
		FileUtils.copyFile(srcFile,dstFile);
	}



}
