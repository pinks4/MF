package com.fool.us.IQScreener;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;
public class IQScreenerchrome extends PageObjectModule {
	public Boolean desider = true;

    LoginToFool login = new LoginToFool();
    @Test(priority = 1)
    public void Verifyheaders() throws Throwable {
   
    	login.loginUSAct();
   
    	Thread.sleep(2000);
    	super.getUrl(read.readData("Browser&URL", 32, 1));
   // 	super.clickButton(read.getObject("IQHead"));
    //    Thread.sleep(15000);        
   //     super.clickButton(read.getObject("IQSubHead"));
        String IHC=read.getObject("IQHead_cmp");
		super.sync(IHC);
        String cmpname = driver.findElement(By.xpath(read.getObject("IQHead_cmp"))).getText();
        System.out.println(cmpname);
        if (cmpname.equals("Company") ) {  
        	
        }
        else {            	
            Reporter.log("Company Header Verification Failed");
            Assert.assertFalse(true);
        }
        String ticker = driver.findElement(By.xpath(read.getObject("IQHead_tic"))).getText();
        if (ticker.equals("Ticker") ) {     	
        }
        else {            	
            Reporter.log("Ticker Header Verification Failed");
            Assert.assertFalse(true);
        }
        String ca = driver.findElement(By.xpath(read.getObject("IQHead_ca"))).getText();
        if (ca.contains("Coverage Analyst") ) {     	
        }
        else {            	
            Reporter.log("Coverage Analyst Header Verification Failed");
            Assert.assertFalse(true);
        }
        String cs = driver.findElement(By.xpath(read.getObject("IQHead_cs"))).getText();
        if (cs.contains("Conviction Status") ) {     	
        }
        else {            	
            Reporter.log("Conviction Status Header Verification Failed");
            Assert.assertFalse(true);
        }
        super.clickButton(read.getObject("clmsel"));        
        Thread.sleep(1000);
        super.clickButton(read.getObject("IQsel_pr"));
        Thread.sleep(200);
        
        super.clickButton(read.getObject("IQsel_1mc"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_3mc"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_1yc"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_dy"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_vo"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_gr"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_pro"));
        Thread.sleep(200);
        super.clickButton(read.getObject("IQsel_act"));
                
        String pr = driver.findElement(By.xpath(read.getObject("IQHead_pr"))).getText();
        if (pr.contains("Price") ) {     	
        }
        else {            	
            Reporter.log("Price Header Verification Failed");
            Assert.assertFalse(true);
        }
        String rs = driver.findElement(By.xpath(read.getObject("IQHead_rs"))).getText();
        if (rs.equals("Rec'ing Services") ) {     	
        }
        else {            	
            Reporter.log("Rec'ing Services Header Verification Failed");
            Assert.assertFalse(true);            
        }
        String ac = driver.findElement(By.xpath(read.getObject("IQHead_ac"))).getText();
        if (ac.contains("Asset Class") ) {     	
        }
        else {            	
            Reporter.log("Asset Class Basis Header Verification Failed");
            Assert.assertFalse(true);
        }
        String sec = driver.findElement(By.xpath(read.getObject("IQHead_sec"))).getText();
        if (sec.equals("Sector") ) {     	
        }
        else {            	
            Reporter.log("Sector Header Verification Failed");
            Assert.assertFalse(true);
        }
        String mc1 = driver.findElement(By.xpath(read.getObject("IQHead_1mc"))).getText();
        if (mc1.contains("1 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("1 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String mc3 = driver.findElement(By.xpath(read.getObject("IQHead_3mc"))).getText();
        if (mc3.contains("3 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("3 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String yc1 = driver.findElement(By.xpath(read.getObject("IQHead_1yc"))).getText();
        if (yc1.contains("1 Yr Change") ) {     	
        }
        else {            	
            Reporter.log("1 Yr Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String dy = driver.findElement(By.xpath(read.getObject("IQHead_dy"))).getText();
        if (dy.equals("Dividend Yield") ) {     	
        }
        else {            	
            Reporter.log("Dividend Yield Header Verification Failed");
            Assert.assertFalse(true);
        }
        String vo = driver.findElement(By.xpath(read.getObject("IQHead_vo"))).getText();
        if (vo.contains("Volatility") ) {     	
        }
        else {            	
            Reporter.log("Volatility Header Verification Failed");
            Assert.assertFalse(true);
        }
        String gr = driver.findElement(By.xpath(read.getObject("IQHead_gr"))).getText();
        if (gr.equals("Glassdoor Rating") ) {     	
        }
        else {            	
            Reporter.log("Glassdoor Rating Header Verification Failed");
            Assert.assertFalse(true);
        }
        String pro = driver.findElement(By.xpath(read.getObject("IQHead_pro"))).getText();
        if (pro.contains("Prosocial") ) {     	
        }
        else {            	
            Reporter.log("Prosocial Header Verification Failed");
            Assert.assertFalse(true);
        }
        
        String act = driver.findElement(By.xpath(read.getObject("IQHead_act"))).getText();
        
        if (act.equals("Add to Scorecards") ) {     
        	Reporter.log("All Headers Verification Passed");
        }
        else {            	
            Reporter.log("Actions Header Verification Failed");
            Assert.assertFalse(true);
        } 
    }
    @Test(priority = 2)
    public void Removeheaders() throws Throwable {
    //	super.clickButton(read.getObject("clmsel"));        
        Thread.sleep(1000);
    	System.out.println(1);
   // super.clickButton(read.getObject("clmsel"));
    super.clickButton(read.getObject("IQsel_clm"));
    Thread.sleep(2000);
    String cmpname1 = driver.findElement(By.xpath(read.getObject("IQHead_cmp"))).getText();
    if (cmpname1.isEmpty() ) {   
    	System.out.println(cmpname1);
    }
    else {            	
        Reporter.log("Company Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_ca"));
    Thread.sleep(1000);
    String ca1 = driver.findElement(By.xpath(read.getObject("IQHead_ca"))).getText();
    if (ca1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Coverage Analyst Removal Verification Failed");
        Assert.assertFalse(true);
    }
    Thread.sleep(200); 
    super.clickButton(read.getObject("IQsel_cs"));
    Thread.sleep(1000);
    String cs1 = driver.findElement(By.xpath(read.getObject("IQHead_cs"))).getText();
    if (cs1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Conviction Status Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_pr"));
    Thread.sleep(1000);
    String pr1 = driver.findElement(By.xpath(read.getObject("IQHead_pr"))).getText();
    if (pr1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Price Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_rs"));
    Thread.sleep(1000);
    String rs1 = driver.findElement(By.xpath(read.getObject("IQHead_rs"))).getText();
    if (rs1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Rec'ing Services Header Removal Verification Failed");
        Assert.assertFalse(true);
    } 
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_ac"));
    Thread.sleep(1000);
    String ac1 = driver.findElement(By.xpath(read.getObject("IQHead_ac"))).getText();
    if (ac1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Asset Class Header Removal Verification Failed");
        Assert.assertFalse(true);
    } 
    
    Thread.sleep(200); 
    super.clickButton(read.getObject("IQsel_sec"));
    Thread.sleep(1000);
    String sec1 = driver.findElement(By.xpath(read.getObject("IQHead_sec"))).getText();
    if (sec1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Sector Header Removal Verification Failed");
        Assert.assertFalse(true);
    } 
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_1mc"));
    Thread.sleep(200);
    String mc1 = driver.findElement(By.xpath(read.getObject("IQHead_1mc"))).getText();
    if (mc1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("1 Mo Change Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_3mc"));
    Thread.sleep(200);
    String mc3 = driver.findElement(By.xpath(read.getObject("IQHead_3mc"))).getText();
    if (mc3.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("3 Mo Change Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_1yc"));
    Thread.sleep(200);
    String yc1 = driver.findElement(By.xpath(read.getObject("IQHead_1yc"))).getText();
    if (yc1.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("1 Yr Change Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_dy"));
    Thread.sleep(200);
    String dy = driver.findElement(By.xpath(read.getObject("IQHead_dy"))).getText();
    if (dy.isEmpty() ) {     	
    }
    else {            	
        Reporter.log(""
        		+ "Dividend Yield Change Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_vo"));
    Thread.sleep(200);
    String vo = driver.findElement(By.xpath(read.getObject("IQHead_vo"))).getText();
    if (vo.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Volatility Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_gr"));
    Thread.sleep(200);
    String gr = driver.findElement(By.xpath(read.getObject("IQHead_gr"))).getText();
    if (gr.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Glassdoor Rating Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    super.clickButton(read.getObject("IQsel_pro"));
    Thread.sleep(200);
    String pro = driver.findElement(By.xpath(read.getObject("IQHead_pro"))).getText();
    if (pro.isEmpty() ) {     	
    }
    else {            	
        Reporter.log("Prosocial Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_act"));
    Thread.sleep(1000);
    String act1 = driver.findElement(By.xpath(read.getObject("IQHead_act"))).getText();
    if (act1.isEmpty() ) {  
    	Reporter.log("All Headers Removal Verification Passed");
    }
    else {            	
        Reporter.log("Actions Header Removal Verification Failed");
        Assert.assertFalse(true);
    }
    
}
    @Test(priority = 3)
    public void Addheaders() throws Throwable {
    super.clickButton(read.getObject("IQsel_clm"));
    Thread.sleep(2000);
    String cmpname = driver.findElement(By.xpath(read.getObject("IQHead_cmp"))).getText();
        if (cmpname.equals("Company") ) {     	
        }
        else {            	
            Reporter.log("Adding Company Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_ca"));
    Thread.sleep(200);
    String ca = driver.findElement(By.xpath(read.getObject("IQHead_ca"))).getText();
        if (ca.contains("Coverage Analyst") ) {     	
        }
        else {            	
            Reporter.log("Added Coverage Analyst Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200); 
    super.clickButton(read.getObject("IQsel_cs"));
    Thread.sleep(200);
    String cs = driver.findElement(By.xpath(read.getObject("IQHead_cs"))).getText();
        if (cs.contains("Conviction Status") ) {     	
        }
        else {            	
            Reporter.log("Added Conviction Status Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_pr"));
    Thread.sleep(200);
    String pr = driver.findElement(By.xpath(read.getObject("IQHead_pr"))).getText();
        if (pr.contains("Price") ) {     	
        }
        else {            	
            Reporter.log("Added Price Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_rs"));
    Thread.sleep(200);
    String rs = driver.findElement(By.xpath(read.getObject("IQHead_rs"))).getText();
        if (rs.equals("Rec'ing Services") ) {     	
        }
        else {            	
            Reporter.log("Adding Rec'ing Services Header Verification Failed");
            Assert.assertFalse(true);            
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_ac"));
    Thread.sleep(200);
    String ac = driver.findElement(By.xpath(read.getObject("IQHead_ac"))).getText();
        if (ac.contains("Asset Class") ) {     	
        }
        else {            	
            Reporter.log("Adding Asset Class Basis Header Verification Failed");
            Assert.assertFalse(true);
        }
    
    Thread.sleep(200); 
    super.clickButton(read.getObject("IQsel_sec"));
    Thread.sleep(200);
    String sec = driver.findElement(By.xpath(read.getObject("IQHead_sec"))).getText();
        if (sec.equals("Sector") ) {     	
        }
        else {            	
            Reporter.log("Adding Sector Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_1mc"));
    Thread.sleep(200);
    String mc1 = driver.findElement(By.xpath(read.getObject("IQHead_1mc"))).getText();
        if (mc1.contains("1 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("Adding 1 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_3mc"));
    Thread.sleep(200);
    String mc3 = driver.findElement(By.xpath(read.getObject("IQHead_3mc"))).getText();
        if (mc3.contains("3 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("Adding 3 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_1yc"));
    Thread.sleep(200);
    String yc1 = driver.findElement(By.xpath(read.getObject("IQHead_1yc"))).getText();
        if (yc1.contains("1 Yr Change") ) {     	
        }
        else {            	
            Reporter.log("Adding 1 Yr Change Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_dy"));
    Thread.sleep(200);
    String dy = driver.findElement(By.xpath(read.getObject("IQHead_dy"))).getText();
        if (dy.equals("Dividend Yield") ) {     	
        }
        else {            	
            Reporter.log("Adding Dividend Yield Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_vo"));
    Thread.sleep(200);
    String vo = driver.findElement(By.xpath(read.getObject("IQHead_vo"))).getText();
        if (vo.contains("Volatility") ) {     	
        }
        else {            	
            Reporter.log("Adding Volatility Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_gr"));
    Thread.sleep(200);
    String gr = driver.findElement(By.xpath(read.getObject("IQHead_gr"))).getText();
        if (gr.equals("Glassdoor Rating") ) {     	
        }
        else {            	
            Reporter.log("Adding Glassdoor Rating Header Verification Failed");
            Assert.assertFalse(true);
        }
    super.clickButton(read.getObject("IQsel_pro"));
    Thread.sleep(200);
    String pro = driver.findElement(By.xpath(read.getObject("IQHead_pro"))).getText();
        if (pro.contains("Prosocial") ) {     	
        }
        else {            	
            Reporter.log("Adding Prosocial Header Verification Failed");
            Assert.assertFalse(true);
        }
    Thread.sleep(200);
    super.clickButton(read.getObject("IQsel_act"));
    Thread.sleep(200);
    String act = driver.findElement(By.xpath(read.getObject("IQHead_act"))).getText();
        if (act.equals("Add to Scorecards") ) {     
        	Reporter.log("Adding All Headers Verification Passed");
        }
        else {            	
            Reporter.log("Actions Header Verification Failed");
            Assert.assertFalse(true);
        } 
        driver.quit();
    }
}
