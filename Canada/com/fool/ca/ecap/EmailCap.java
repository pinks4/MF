package com.fool.ca.ecap;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class EmailCap extends PageObjectModule {
	@Test(priority = 1)
    public void emailCapCAHome() throws Throwable {
		super.browser();
        try {
            String teur = read.readData("ECap", 4, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {

            String xpath = read.readData("ECap", 4, 1);
            super.enterText(read.getObject("Edit_emailecap1"), xpath);
            super.clickButton(read.getObject("acpterms1"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        super.clickButton(read.getObject("button_Ecapsub3"));
        Thread.sleep(3000);
            List<WebElement> element = driver.findElements(By.xpath("//h2[text()='Thanks for subscribing!']"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool Canada Home Ecap Test Passed");
            Thread.sleep(3000);
        } else {
            Reporter.log("Motley Fool Canada Home Ecap Test Failed");
            Assert.assertFalse(true);
        }
	}/*
        @Test(priority = 2)
        public void emailCapCAHeadlines() throws Throwable {
        try {
            String teur = read.readData("ECap", 5, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {

            String xpath = read.readData("ECap", 5, 1);
            super.enterText(read.getObject("Edit_emailecap1"), xpath);

        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        super.clickButton(read.getObject("button_Ecapsub1"));
        Thread.sleep(3000);
           List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Thanks!']"));
        if (element1.size() > 0) {
        	Reporter.log("Motley Fool Canada Headlines Ecap Test Passed");
            Thread.sleep(3000);
        } else {
        	Reporter.log("Motley Fool Canada Headlines Ecap Test Failed");
            Assert.assertFalse(true);
        }
        }*/
        @Test(priority = 3)
        public void emailCapCAsplrep() throws Throwable {
        try {

            super.getUrl(read.readData("ECap", 6, 0));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            super.enterText(read.getObject("Edit_emailecap1"), read.readData("Ecap", 6, 1));
            super.clickButton(read.getObject("acpterms"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        super.clickButton(read.getObject("button_Ecapsub1"));
        Thread.sleep(8000);
        List<WebElement> ele = driver.findElements(By.xpath("//h4[text()='Sorry about that. The problem is on our end.']"));
        if (ele.size() > 0) {
        	Reporter.log("Motley Fool Canada Special Report Ecap Test Failed");
            Assert.assertFalse(true);
        } else {
        	Reporter.log("Motley Fool Canada Special Report Ecap Test Passed");
        	Thread.sleep(2000);
            driver.quit();
        }

    }  
    
}
