package com.fool.au.pro;

//public class Aupro1 {

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class Aupro1 extends PageObjectModule {
	LoginToFool login = new LoginToFool();

	@Test(priority = 1)
    public void emailAuPro1() throws Throwable {
		login.loginProau(); 
		/*
		try {          	         	         	 
          	 
         	 String xpath = read.readData("ECap", 20, 1);
         	 super.enterText(read.getObject("Input_AuproSrch"), xpath);
         	 super.clickButton(read.getObject("Btn_SearchAupro"));
          } catch (Throwable e) {
         	 // TODO Auto-generated catch block
         	 e.printStackTrace();
         	 Assert.assertFalse(true);
          }
		
		List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'Getting Started with Pro')]"));
  		if (element.size() > 0) {
    	Reporter.log("Au Pro Search Verified");
  		} else {
    	Reporter.log("Au Pro Search Verification Failed");
		Assert.assertFalse(true);
  		} */
		
  		try {          	         	         	 
         	 
        	 String xpath = read.readData("ECap", 21, 1);
        	 super.enterText(read.getObject("Input_AuproSrch"), xpath);
        	 super.clickButton(read.getObject("Btn_SearchAupro"));
         } catch (Throwable e) {
        	 // TODO Auto-generated catch block
        	 e.printStackTrace();
        	 Assert.assertFalse(true);
         }
  		
  		List<WebElement> element1 = driver.findElements(By.xpath("//strong,'123456789')]"));
  		if (element1.size() > 0) {
    	Reporter.log("Au Pro Invalid Search Verified");
  		} else {
    	Reporter.log(" Verification Failed");
		Assert.assertFalse(true);
  		}
		
		
/*		super.clickButton(read.getObject("Tab_AuProAlt"));  
		List<WebElement> element = driver.findElements(By.xpath("//h2[text()='All Coverage']"));
      		if (element.size() > 0) {
        	Reporter.log("Page Title Verified");
        } else {
        	Reporter.log(" Verification Failed");
			Assert.assertFalse(true);
        }
    }
		
		
		
		String MFP = driver.getTitle();
			if (MFP.contains("Motley Fool Pro")) {
				Reporter.log(MFP + " Page Title Verified");
			} else {
				Reporter.log(MFP + " Verification Failed");
				Assert.assertFalse(true);
			}*/
	}
}