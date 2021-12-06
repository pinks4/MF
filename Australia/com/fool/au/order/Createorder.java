package com.fool.au.order;

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
    public void auordercreate() throws Throwable {
		Random rg = new Random();
		for (int idx = 1; idx <= 1; ++idx){
		int randomInt = rg.nextInt(100000);
		String usrnme = "test"+Integer.toString(randomInt);
		
		//System.out.println(usrnm);
		super.browser();
        try {
            String teur = read.readData("ECap", 21, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        super.clickButton(read.getObject("test_Checkbox"));
        Thread.sleep(3000);
     /*   WebElement ey=driver.findElement(By.xpath(".//*[@id='expires-year']"));
        Select y=new Select(ey);
        Thread.sleep(2000);
        y.selectByValue("2015");
        WebElement em=driver.findElement(By.xpath(".//*[@id='expires-month']"));
        Select m=new Select(em);
        Thread.sleep(2000);
        m.selectByValue("12"); */
        super.clickButton(read.getObject("Btn_Continue"));
        
        Thread.sleep(58000);
     
        try {
        	String UsrName = read.getObject("Input_UserName");
        	 super.sync(UsrName);
        	super.enterText(UsrName,usrnme );
    		
           } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
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
        driver.quit();
        Thread.sleep(2000);
        super.browser();
        try {
          super.getUrl(read.readData("ECap", 10, 0));
          Thread.sleep(2000);
          } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        try {
        	Thread.sleep(3000);
            super.enterText(read.getObject("Edit_Username"), usrnme );
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            super.enterText(read.getObject("Edit_Password"), read.readData("ECap", 41, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.clickButton(read.getObject("Button_Login"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        super.clickButton(read.getObject("Button_account1"));
        List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Manage Account']"));
        if (element1.size() > 0) {
            Reporter.log("Motley Fool Share Advisor Account Creation Test Passed");
            Thread.sleep(2000);
           // driver.quit();
            String usrnm = "User Name: test"+Integer.toString(randomInt);
            List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='account-management']/section[3]/ul/li"));
            if(allElements.contains(usrnme)) {
            	System.out.println(allElements);
            	Reporter.log("Motley Fool Share Advisor Account name Creation Test Passed");
            Thread.sleep(2000);
            driver.quit();
            }
            /*
            	List<WebElement> ele1 = driver.findElements(By.xpath("//section[3]/ul/li[contains("Name",,)]");
            	if (ele1.size() > 0) {
                    Reporter.log("Motley Fool Share Advisor Account name Creation Test Passed");
                    Thread.sleep(2000);
            	} */
            
                
        } else {
            Reporter.log("Login not happend for Website");
            Assert.assertFalse(true);
        } 
        
	}driver.quit();
	}	
	}