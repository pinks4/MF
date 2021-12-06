package com.fool.au.ecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class EmailCap extends PageObjectModule {
	@Test(priority = 1)
    public void emailCapAUHomepage() throws Throwable {
        super.browser();
        try {
            String teur = read.readData("ECap", 1, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            String xpath = read.readData("ECap", 1, 1);
            super.enterText(read.getObject("Edit_emailecap1"), xpath);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        String postmsg = "//a[@id='lp-pom-button-17']/span";
        super.sync(postmsg);
        super.clickButton(read.getObject("button_Ecapsub2"));
        String THK= "//h2[text()='The Motley Fool’s Top Stock for 2016']";
        super.sync(THK);
        List<WebElement> element = driver.findElements(By.xpath("//h2[text()='The Motley Fool’s Top Stock for 2016']"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool Australia Home Ecap Test Passed");
        	Thread.sleep(1000);
         
        } else {
            Reporter.log("Home page Ecap test failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(1000);
	    
	}
		
 @Test(priority = 3)
    public void emailCapAUSplRep() throws Throwable {

    //    super.browser();
       // String s = read.readData("ECap", 3, 0); */
        try {

            super.getUrl(read.readData("ECap", 3, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            super.enterText(read.getObject("Edit_emailecap1"), read.readData("Ecap", 3, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        String subm = "//a[@id='lp-pom-button-17']/span";
        super.sync(subm);
        super.clickButton(read.getObject("button_Ecapsub2"));
        Thread.sleep(2000);
        List<WebElement> ele = driver.findElements(By.xpath("//h4[text()='Sorry about that. The problem is on our end.']"));
        if (ele.size() > 0) {
            Reporter.log("Login not happend for Website");
            Assert.assertFalse(true);
        } else {
        	 Reporter.log("Motley Fool Australia Special Report Ecap Test Passed");
        	Thread.sleep(2000);
            driver.quit();
        }
    } 
  
  }  
    

