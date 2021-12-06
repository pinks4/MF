package com.fool.us.evlcol;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class Evellstcol extends PageObjectModule {	
	    public Boolean desider = true;

	    LoginToFool login = new LoginToFool();
	    @Test(priority = 1)
	    public void Verifyheaders() throws Throwable {
	        login.loginUSAct();
	        Thread.sleep(2000);
	        String cmpname = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();
	        if (cmpname.equals("Company") ) {     	
	        }
	        else {            	
	            Reporter.log("Company Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String ticker = driver.findElement(By.xpath(read.getObject("Head_tic"))).getText();
	        if (ticker.equals("Ticker") ) {     	
	        }
	        else {            	
	            Reporter.log("Ticker Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String rave = driver.findElement(By.xpath(read.getObject("Head_rave"))).getText();
	        if (rave.equals("Rave") ) {     	
	        }
	        else {            	
	            Reporter.log("Rave Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String recdate = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
	        if (recdate.equals("Rec Date") ) {     	
	        }
	        else {            	
	            Reporter.log("Rec Date Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String perport = driver.findElement(By.xpath(read.getObject("Head_perport"))).getText();
	        if (perport.equals("% of Port") ) {     	
	        }
	        else {            	
	            Reporter.log("% of Port Header Verification Failed");
	            Assert.assertFalse(true);            
	        }
	        String Avgcst = driver.findElement(By.xpath(read.getObject("Head_avgcst"))).getText();
	        if (Avgcst.equals("Avg. Cost Basis") ) {     	
	        }
	        else {            	
	            Reporter.log("Avg. Cost Basis Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String curprc = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
	        if (curprc.equals("Current Price") ) {     	
	        }
	        else {            	
	            Reporter.log("Current Price Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String mktval = driver.findElement(By.xpath(read.getObject("Head_mktval"))).getText();
	        if (mktval.equals("Market Value") ) {     	
	        }
	        else {            	
	            Reporter.log("Market Value Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String ret = driver.findElement(By.xpath(read.getObject("Head_ret"))).getText();
	        if (ret.equals("Return") ) {     	
	        }
	        else {            	
	            Reporter.log("Return Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String Ml= read.getObject("clmsel");
        	super.sync(Ml);
	        String act = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
	        if (act.equals("Actions") ) {     
	        	Reporter.log("All Headers Verification For Toggle Selection Passed");
	        }
	        else {            	
	            Reporter.log("Actions Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	    }
	        @Test(priority = 3)
	        public void StackHeaders() throws Throwable {
	        
	    //    super.clickButton(read.getObject("Toggle"));
	        super.clickButton(read.getObject("Stack"));
	        Thread.sleep(2000);
	        String cmpname = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();
	        if (cmpname.equals("Company") ) {     	
	        }
	        else {            	
	            Reporter.log("Company Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String ticker = driver.findElement(By.xpath(read.getObject("Head_tic"))).getText();
	        if (ticker.equals("Ticker") ) {     	
	        }
	        else {            	
	            Reporter.log("Ticker Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String rave = driver.findElement(By.xpath(read.getObject("Head_rave"))).getText();
	        if (rave.equals("Rave") ) {     	
	        }
	        else {            	
	            Reporter.log("Rave Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String recdate = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
	        if (recdate.equals("Rec Date") ) {     	
	        }
	        else {            	
	            Reporter.log("Rec Date Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String perport = driver.findElement(By.xpath(read.getObject("Head_perport"))).getText();
	        if (perport.equals("% of Port") ) {     	
	        }
	        else {            	
	            Reporter.log("% of Port Header Verification Failed");
	            Assert.assertFalse(true);            
	        }
	        String Avgcst = driver.findElement(By.xpath(read.getObject("Head_avgcst"))).getText();
	        if (Avgcst.equals("Avg. Cost Basis") ) {     	
	        }
	        else {            	
	            Reporter.log("Avg. Cost Basis Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String curprc = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
	        if (curprc.equals("Current Price") ) {     	
	        }
	        else {            	
	            Reporter.log("Current Price Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String mktval = driver.findElement(By.xpath(read.getObject("Head_mktval"))).getText();
	        if (mktval.equals("Market Value") ) {     	
	        }
	        else {            	
	            Reporter.log("Market Value Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String loss = driver.findElement(By.xpath(read.getObject("Head_lossgain"))).getText();
	        System.out.println(loss);
	        if (loss.equals("Loss/Gain") ) {     	
	        }
	        else {            	
	        	//Reporter.log(lossgain);
	            Reporter.log("Loss/Gain Header Verification Failed");
	            Assert.assertFalse(true);
	        } 
	        String ret = driver.findElement(By.xpath(read.getObject("Head_ret"))).getText();
	        if (ret.equals("Return") ) {     	
	        }
	        else {            	
	            Reporter.log("Return Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String act = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
	        if (act.equals("Actions") ) {     
	        	Reporter.log("All Headers Verification For Stack Selection Passed");
	        }
	        else {            	
	            Reporter.log("Actions Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        } 
	        
	        @Test(priority = 2)
	        public void SwipeHeaders() throws Throwable {
	        
	  //      super.clickButton(read.getObject("Toggle"));
	        super.clickButton(read.getObject("Swipe"));
	        Thread.sleep(2000);
	        String cmpname = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();
	        if (cmpname.equals("Company") ) {     	
	        }
	        else {            	
	            Reporter.log("Company Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String ticker = driver.findElement(By.xpath(read.getObject("Head_tic"))).getText();
	        if (ticker.equals("Ticker") ) {     	
	        }
	        else {            	
	            Reporter.log("Ticker Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String rave = driver.findElement(By.xpath(read.getObject("Head_rave"))).getText();
	        if (rave.equals("Rave") ) {     	
	        }
	        else {            	
	            Reporter.log("Rave Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String recdate = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
	        if (recdate.equals("Rec Date") ) {     	
	        }
	        else {            	
	            Reporter.log("Rec Date Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String perport = driver.findElement(By.xpath(read.getObject("Head_perport"))).getText();
	        if (perport.equals("% of Port") ) {     	
	        }
	        else {            	
	            Reporter.log("% of Port Header Verification Failed");
	            Assert.assertFalse(true);            
	        }
	        String Avgcst = driver.findElement(By.xpath(read.getObject("Head_avgcst"))).getText();
	        if (Avgcst.equals("Avg. Cost Basis") ) {     	
	        }
	        else {            	
	            Reporter.log("Avg. Cost Basis Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String curprc = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
	        if (curprc.equals("Current Price") ) {     	
	        }
	        else {            	
	            Reporter.log("Current Price Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String mktval = driver.findElement(By.xpath(read.getObject("Head_mktval"))).getText();
	        if (mktval.equals("Market Value") ) {     	
	        }
	        else {            	
	            Reporter.log("Market Value Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        String lossgain = driver.findElement(By.xpath(read.getObject("Head_lossgain"))).getText();
	       
	        if (lossgain.equals("Loss/Gain") ) {     	
	        }
	        else {            	
	        	Reporter.log(lossgain);
	            Reporter.log("Loss/Gain Header Verification Failed");
	            Assert.assertFalse(true);
	        } 
	        String ret = driver.findElement(By.xpath(read.getObject("Head_ret"))).getText();
	        System.out.println(ret);
	        if (ret.equals("Return") ) {     	
	        }
	        else {            	
	            Reporter.log("Return Header Verification Failed");
	            Assert.assertFalse(true);
	        }
	        super.clickButton(read.getObject("Swipe_exp"));	        
	        String act = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
	        if (act.equals("Actions") ) {     
	        	Reporter.log("All Headers Verification For Swipe Selection Passed");
	        }
	        else {            	
	            Reporter.log("Actions Header Swipe Verification Failed");
	            Assert.assertFalse(true);
	        }driver.quit();
	        }      
	        

	        

}
