package com.fool.sg.Allpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class Allpages extends PageObjectModule {
		
	@Test(priority = 1)
    public void emailAuPro() throws Throwable {
		super.browser();
		try {          	         	         	 
          	 String xpath = read.readData("ECap", 35, 1);
         	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
          } catch (Throwable e) {
         	 // TODO Auto-generated catch block
         	 e.printStackTrace();
         	 Assert.assertFalse(true);
          }	      
		  String MFP = driver.getTitle();
			if (MFP.contains("Motley Fool Pro")) {
				Reporter.log(MFP + " Page Title Verified");
			} else {
				Reporter.log(MFP + " Verification Failed");
				Assert.assertFalse(true);
			}
			
			super.clickButton(read.getObject("Tab_AuProAlt"));
            String MFP1 = driver.getTitle();
			if (MFP1.contains("Fool Pro » All Coverage")) {
				Reporter.log(MFP1 + " Page Title Verified");
			} else {
				Reporter.log(MFP1 + " Verification Failed");
				Assert.assertFalse(true);
			}
			
			List<WebElement> element = driver.findElements(By.xpath("//h2[text()='All Coverage']"));
      		if (element.size() > 0) {
        	Reporter.log(MFP1 + " Page Header Verified");
      		} else {
        	Reporter.log(MFP1 + " Verification Failed");
			Assert.assertFalse(true);
      		}
    
			
			super.clickButton(read.getObject("Tab_AuProAltUpd"));
            String MFP2 = driver.getTitle();
			if (MFP2.contains("Fool Pro » Updates")) {
				Reporter.log(MFP2 + " Page Title Verified");
			} else {
				Reporter.log(MFP2 + " Verification Failed");
				Assert.assertFalse(true);
			} 
			
			List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Updates']"));
      		if (element1.size() > 0) {
        	Reporter.log("Updates Page Header Verified");
      		} else {
        	Reporter.log(" Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProAltTdAlt"));
            String MFP3 = driver.getTitle();
			if (MFP3.contains("Fool Pro » Recommendations")) {
				Reporter.log(MFP3 + " Page Title Verified");
			} else {
				Reporter.log(MFP3 + " Verification Failed");
				Assert.assertFalse(true);
			} 
			
			List<WebElement> element2 = driver.findElements(By.xpath("//h2[text()='Trade Alerts']"));
      		if (element2.size() > 0) {
        	Reporter.log("Trade Alerts Page Header Verified");
      		} else {
        	Reporter.log(" Trade Alerts Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProAltMul"));
            String MFP4 = driver.getTitle();
			if (MFP4.contains("Fool Pro » Multimedia")) {
				Reporter.log(MFP4 + " Page Title Verified");
			} else {
				Reporter.log(MFP4 + " Verification Failed");
				Assert.assertFalse(true);
			} 
			
			List<WebElement> element3 = driver.findElements(By.xpath("//h2[text()='Multimedia']"));
      		if (element3.size() > 0) {
        	Reporter.log("Multimedia Page Header Verified");
      		} else {
        	Reporter.log(" Multimedia Verification Failed");
			Assert.assertFalse(true);
      		}
			    		
      		super.clickButton(read.getObject("Tab_AuProPfo"));
            String MFP5 = driver.getTitle();
			if (MFP5.contains("Fool Pro » Portfolio")) {
				Reporter.log(MFP5 + " Page Title Verified");
			} else {
				Reporter.log(MFP5 + " Verification Failed");
				Assert.assertFalse(true);
			}    
			
			List<WebElement> element4 = driver.findElements(By.xpath("//h2[text()='Portfolio']"));
      		if (element4.size() > 0) {
        	Reporter.log("Portfolio Page Header Verified");
      		} else {
        	Reporter.log("Portfolio Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProFrm"));
            String MFP6 = driver.getTitle();
			if (MFP6.contains("Fool Pro » Forums")) {
				Reporter.log(MFP6 + " Page Title Verified");
			} else {
				Reporter.log(MFP6 + " Verification Failed");
				Assert.assertFalse(true);
			}  
			
			List<WebElement> element5 = driver.findElements(By.xpath("//h2[text()='Forums']"));
      		if (element5.size() > 0) {
        	Reporter.log("Forums Page Header Verified");
      		} else {
        	Reporter.log("Forums Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProRcT"));
            String MFP7 = driver.getTitle();
			if (MFP7.contains("Fool Pro » Topics")) {
				Reporter.log(MFP7 + " Page Title Verified");
			} else {
				Reporter.log(MFP7 + " Verification Failed");
				Assert.assertFalse(true);
			}  
			
			List<WebElement> element6 = driver.findElements(By.xpath("//h2[text()='Topics']"));
      		if (element6.size() > 0) {
        	Reporter.log("Topics Page Header Verified");
      		} else {
        	Reporter.log("Topics Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProPrC"));
            String MFP8 = driver.getTitle();
			if (MFP8.contains("Fool Pro » Forum: Pro Central")) {
				Reporter.log(MFP8 + " Page Title Verified");
			} else {
				Reporter.log(MFP8 + " Verification Failed");
				Assert.assertFalse(true);
			}  
			
			List<WebElement> element7 = driver.findElements(By.xpath("//h2[text()='Pro Central']"));
      		if (element7.size() > 0) {
        	Reporter.log("Pro Central Page Header Verified");
      		} else {
        	Reporter.log("Pro Central Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProTL"));
            String MFP9 = driver.getTitle();
			if (MFP9.contains("Fool Pro » Forum: The Lounge")) {
				Reporter.log(MFP9 + " Page Title Verified");
			} else {
				Reporter.log(MFP9 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element8 = driver.findElements(By.xpath("//h2[text()='The Lounge']"));
      		if (element8.size() > 0) {
        	Reporter.log("The Lounge Page Header Verified");
      		} else {
        	Reporter.log("The Lounge Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProHlp"));
            String MFP10 = driver.getTitle();
			if (MFP10.contains("Fool Pro » Forum: Help")) {
				Reporter.log(MFP10 + " Page Title Verified");
			} else {
				Reporter.log(MFP10 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element9 = driver.findElements(By.xpath("//h2[text()='Help']"));
      		if (element9.size() > 0) {
        	Reporter.log("Help Page Header Verified");
      		} else {
        	Reporter.log("Help Verification Failed");
			Assert.assertFalse(true);
      		}
						
			super.clickButton(read.getObject("Tab_AuProGBk"));
            String MFP11 = driver.getTitle();
			if (MFP11.contains("Fool Pro » Guidebook")) {
				Reporter.log(MFP11 + " Page Title Verified");
			} else {
				Reporter.log(MFP11 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element10 = driver.findElements(By.xpath("//h2[text()='Guidebook']"));
      		if (element10.size() > 0) {
        	Reporter.log("Guidebook Page Header Verified");
      		} else {
        	Reporter.log("Guidebook Verification Failed");
			Assert.assertFalse(true);
      		}
      		
			super.clickButton(read.getObject("Tab_AuProGSWP"));
            String MFP12 = driver.getTitle();
			if (MFP12.contains("Fool Pro » Getting Started With Pro")) {
				Reporter.log(MFP12 + " Page Title Verified");
			} else {
				Reporter.log(MFP12 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element11 = driver.findElements(By.xpath("//h2[text()='Getting Started With Pro']"));
      		if (element11.size() > 0) {
        	Reporter.log("Getting Started With Pro Page Header Verified");
      		} else {
        	Reporter.log("Getting Started With Pro Verification Failed");
			Assert.assertFalse(true);
      		}
      		
			super.clickButton(read.getObject("Tab_AuProPPl"));
            String MFP13 = driver.getTitle();
			if (MFP13.contains("Fool Pro » Pro Philosophy")) {
				Reporter.log(MFP13 + " Page Title Verified");
			} else {
				Reporter.log(MFP13 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element12 = driver.findElements(By.xpath("//h2[text()='Pro Philosophy']"));
      		if (element12.size() > 0) {
        	Reporter.log("Pro Philosophy Page Header Verified");
      		} else {
        	Reporter.log("Pro Philosophy Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProMtT"));
            String MFP14 = driver.getTitle();
			if (MFP14.contains("Fool Pro » Meet the Team")) {
				Reporter.log(MFP14 + " Page Title Verified");
			} else {
				Reporter.log(MFP14 + " Verification Failed");
				Assert.assertFalse(true);
			} 

			List<WebElement> element13 = driver.findElements(By.xpath("//h2[text()='Meet the Team']"));
      		if (element13.size() > 0) {
        	Reporter.log("Meet the Team Page Header Verified");
      		} else {
        	Reporter.log("Meet the Team Verification Failed");
			Assert.assertFalse(true);
      		}
			
			super.clickButton(read.getObject("Tab_AuProFaq"));
            String MFP15 = driver.getTitle();
			if (MFP15.contains("Fool Pro » FAQ")) {
				Reporter.log(MFP15 + " Page Title Verified");
			} else {
				Reporter.log(MFP15 + " Verification Failed");
				Assert.assertFalse(true);
			} 
			
			List<WebElement> element14 = driver.findElements(By.xpath("//h2[text()='FAQ']"));
      		if (element14.size() > 0) {
        	Reporter.log("FAQ Page Header Verified");
      		} else {
        	Reporter.log("FAQ Verification Failed");
			Assert.assertFalse(true);
      		}
			
      		try {          	         	         	 
             	 
            	 String xpath = read.readData("ECap", 20, 1);
            	 super.enterText(read.getObject("Input_AuproSrch"), xpath);
            	 super.clickButton(read.getObject("Btn_SearchAupro"));
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
   		
   		List<WebElement> element16 = driver.findElements(By.xpath("//a[contains(text(),'Getting Started with Pro')]"));
     		if (element16.size() > 0) {
       	Reporter.log("Au Pro Search Field Test Passed");
     		} else {
       	Reporter.log("Au Pro Search Verification Failed");
   		Assert.assertFalse(true);
     		}
      		
      		
	        driver.quit();   
	}  	
  }