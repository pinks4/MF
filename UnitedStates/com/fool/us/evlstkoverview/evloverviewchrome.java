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

public class evloverviewchrome extends PageObjectModule {
	public Boolean desider = true;
	LoginToFool login = new LoginToFool();
	@Test(priority = 1)
	
	    public void MF1homepageverification() throws Throwable {
		login.loginUSAct();		   
		Thread.sleep(3000);
     // 	super.browser();
    	super.getUrl(read.readData("Browser&URL", 33, 1));
    	//Thread.sleep(10000);
    	String HPH=read.getObject("MF1_Hmpgheader");
		super.sync(HPH);
    	String LS=read.getObject("MF1_Hmpgheader");
        super.sync(LS);
        System.out.println(LS);
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
		String EB=read.getObject("MF1_EVLbtn");
		super.sync(EB);
		//Thread.sleep(3000);
		super.clickButton(read.getObject("MF1_EVLbtn"));
		String EOB=read.getObject("MF1_EVLOVRbtn");
		super.sync(EOB);
		//Thread.sleep(5000);
		super.clickButton(read.getObject("MF1_EVLOVRbtn"));
		//Thread.sleep(7000);
		String EPH=read.getObject("MF1_EVLpgheader");
		super.sync(EPH);
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
		String AAB=read.getObject("MF1_Allaccbtn");
		super.sync(AAB);
		super.clickButton(read.getObject("MF1_Allaccbtn"));
		//Thread.sleep(5000);
		String AAOB=read.getObject("MF1_AllaccOVRbtn");
		super.sync(AAOB);
		super.clickButton(read.getObject("MF1_AllaccOVRbtn"));
	//	super.clickButton(read.getObject("MF1_AllaccOVRbtn"));
		//Thread.sleep(6000);		
		String AAPH=read.getObject("MF1_Allaccpgheader");		
		super.sync(AAPH);		
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
		String MSB=read.getObject("MF1_Msetbtn");
		super.sync(MSB);
		super.clickButton(read.getObject("MF1_Msetbtn"));
		//Thread.sleep(7000);
		String MOB=read.getObject("MF1_MsetOVRbtn");
		super.sync(MOB);
		super.clickButton(read.getObject("MF1_MsetOVRbtn"));
		//Thread.sleep(7000);
		String MPH=read.getObject("MF1_Msetpgheader");
		super.sync(MPH);
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
		String WB=read.getObject("MF1_Wltbtn");
		System.out.println(WB);
		super.sync(WB);
		super.clickButton(read.getObject("MF1_Wltbtn"));
		//Thread.sleep(7000);
		System.out.println(2);
		String WOB=read.getObject("MF1_WltOVRbtn");
		System.out.println(2);
		super.sync(WOB);
		super.clickButton(read.getObject("MF1_WltOVRbtn"));
		System.out.println(2);
		//Thread.sleep(7000);
		String WPH=read.getObject("MF1_Wltpgheader");
		super.sync(WPH);
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
		String CB=read.getObject("MF1_Combtn");
		super.sync(CB);
		super.clickButton(read.getObject("MF1_Combtn"));	
		//Thread.sleep(7000);
		String CPH=read.getObject("MF1_Compgheader");
		super.sync(CPH);
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
		String LBBTN=read.getObject("MF1_Labbtn");
		super.syncmore(LBBTN);
		super.clickButton(read.getObject("MF1_Labbtn"));	
		//Thread.sleep(7000);
		String LPH=read.getObject("MF1_Labpgheader");
		super.syncmore(LPH);
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
		String HP=read.getObject("MF1_Hlpbtn");
		super.sync(HP);		
		super.clickButton(read.getObject("MF1_Hlpbtn"));	
	//	Thread.sleep(7000);
		String HPH=read.getObject("MF1_Hlppgheader");
		super.sync(HPH);
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
