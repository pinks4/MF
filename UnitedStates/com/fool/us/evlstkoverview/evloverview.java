package com.fool.us.evlstkoverview;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class evloverview extends PageObjectModule {
	public Boolean desider = true;
	
	@Test(priority = 1)
    public void MF1homepageverification() throws Throwable {
      	super.browser();
    	super.getUrl(read.readData("Browser&URL", 33, 1));
    	String Homepgnm = driver.findElement(By.xpath(read.getObject("MF1_Hmpgheader"))).getText();
    	if (Homepgnm.equals("Welcome to Motley Fool One!") ) {     
        	Reporter.log("MF1 Home page Headers Verification Passed");
        }
        else {            	
            Reporter.log("MF1 Home page Verification Failed");
            Assert.assertFalse(true);
        } 
   
	
	}
	@Test(priority = 2)
    public void MF1EVLpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_EVLbtn"));
		super.clickButton(read.getObject("MF1_EVLOVRbtn"));
    	String EVLpgnm = driver.findElement(By.xpath(read.getObject("MF1_EVLpgheader"))).getText();
    	if (EVLpgnm.equals("Welcome to Tom's Everlasting Portfolio!") ) {     
        	Reporter.log("Tom's Everlasting page Headers Verification Passed");
        }
        else {            	
            Reporter.log("Tom's Everlasting page Verification Failed");
            Assert.assertFalse(true);
        } 
       
	
	}
	@Test(priority = 3)
    public void MF1Allaccpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Allaccbtn"));
		super.clickButton(read.getObject("MF1_AllaccOVRbtn"));
    	String Allacpgnm = driver.findElement(By.xpath(read.getObject("MF1_Allaccpgheader"))).getText();
    	if (Allacpgnm.equals("Welcome to Motley Fool One's All Access Pass!") ) {     
        	Reporter.log("All Access page Headers Verification Passed");
        }
        else {            	
            Reporter.log("All Access page Verification Failed");
            Assert.assertFalse(true);
        } 
       
	
	}
	@Test(priority = 4)
    public void MF1Msetpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Msetbtn"));
		super.clickButton(read.getObject("MF1_MsetOVRbtn"));
    	String Msetpgnm = driver.findElement(By.xpath(read.getObject("MF1_Msetpgheader"))).getText();
    	if (Msetpgnm.equals("Welcome to Motley Fool Mindset!") ) {     
        	Reporter.log("Mindset page Headers Verification Passed");
        }
        else {            	
            Reporter.log("All Access page Verification Failed");
            Assert.assertFalse(true);
        } 
      
	
	}
	
	@Test(priority = 5)
    public void MF1Wltpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Wltbtn"));
		super.clickButton(read.getObject("MF1_WltOVRbtn"));
    	String Wltpgnm = driver.findElement(By.xpath(read.getObject("MF1_Wltpgheader"))).getText();
    	if (Wltpgnm.equals("Start Your Fool Wealth SMAs Today!") ) {     
        	Reporter.log("Wealth page Headers Verification Passed");
        }
        else {            	
            Reporter.log("Wealth page Verification Failed");
            Assert.assertFalse(true);
        }        
	
	}/*
	@Test(priority = 6)
    public void MF1Scrpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Scrbtn"));
	//	Thread.sleep(2000);
		super.clickButton(read.getObject("MF1_ScrOVRbtn"));
    	String Scrpgnm = driver.findElement(By.xpath(read.getObject("MF1_Scrpgheader"))).getText();
    	if (Scrpgnm.equals("All Scorecards") ) {     
        	Reporter.log("Scorecards Headers Verification Passed");
        }
        else {            	
            Reporter.log("Scorecards page Verification Failed");
            Assert.assertFalse(true);
        } 
        driver.quit();
	
	}*/
	@Test(priority = 7)
    public void MF1Compageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Combtn"));	
    	String Compgnm = driver.findElement(By.xpath(read.getObject("MF1_Compgheader"))).getText();
    	if (Compgnm.equals("Get to know the Fool One community") ) {     
        	Reporter.log("Community Headers Verification Passed");
        }
        else {            	
            Reporter.log("Community page Verification Failed");
            Assert.assertFalse(true);
        } 
        	
	}
	@Test(priority = 8)
    public void MF1Labpageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Labbtn"));	
    	String Labpgnm = driver.findElement(By.xpath(read.getObject("MF1_Labpgheader"))).getText();
    	if (Labpgnm.contains("Fool IQ Screener") ) {     
        	Reporter.log("Lab Headers Verification Passed");
        }
        else {            	
            Reporter.log("Lab page Verification Failed");
            Assert.assertFalse(true);
        } 
    
	}
	
	@Test(priority = 9)
    public void MF1Hlppageverification() throws Throwable {
		super.clickButton(read.getObject("MF1_Hlpbtn"));	
    	String Hlppgnm = driver.findElement(By.xpath(read.getObject("MF1_Hlppgheader"))).getText();
    	if (Hlppgnm.contains("Ask the Fool") ) {     
        	Reporter.log("Help Headers Verification Passed");
        }
        else {            	
            Reporter.log("Help page Verification Failed");
            Assert.assertFalse(true);
        } 
        driver.quit();
}
}
