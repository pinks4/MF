package com.fool.ca.order;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class Createorder extends PageObjectModule {
	
	@Test(priority = 1)
    public void CAordercreate() throws Throwable {

        super.browser();
        try {
            String teur = read.readData("ECap", 32, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        super.clickButton(read.getObject("test_Checkbox"));
        Thread.sleep(3000);
        WebElement ey=driver.findElement(By.xpath(".//*[@id='expires-year']"));
        Select y=new Select(ey);
        System.out.println("This is a git demo test by userA");
        Thread.sleep(2000);
        y.selectByValue("2018");
        super.clickButton(read.getObject("Btn_Continue"));
        Thread.sleep(38000);
    /*    List<WebElement> element = driver.findElements(By.xpath("//h3[text()='Your payment has been processed!']"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool Canada Order Payment Test Passed");
            Thread.sleep(2000);
        } else {
            Reporter.log("Motley Fool Canada Order Payment Test Failed");
            Assert.assertFalse(true);
        }*/
        String LS=read.getObject("Ribbon");
        super.sync(LS);
        try {
        	Random rg = new Random();
    		for (int idx = 1; idx <= 1; ++idx){
    		int randomInt = rg.nextInt(100000);
        	super.enterText(read.getObject("Input_UserName"),"test"+randomInt );
        	    		}
           } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
        	Thread.sleep(3000);
            String xpath = read.readData("ECap", 41, 0);
            super.enterText(read.getObject("Input_Password"), xpath);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {

            String xpath = read.readData("ECap", 41, 0);
            super.enterText(read.getObject("Input_ConfirmPassword"), xpath);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        Thread.sleep(3000);
        super.clickButton(read.getObject("Btn_SignUp"));
        Thread.sleep(2000);
        super.clickButton(read.getObject("Button_account"));
        List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Manage Account']"));
        if (element1.size() > 0) {
            Reporter.log("Motley Fool Stock Advisor Account Creation Test Passed");
            Thread.sleep(2000);
            driver.quit();
                
        } else {
            Reporter.log("Login not happend for Website");
            Assert.assertFalse(true);
        }
       
	}
		
	}
	