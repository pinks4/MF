package com.fool.au.shareadvisor;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

//This is Austrlian Share Advisor Ecap Test
public class Shareadvisor extends PageObjectModule {
    public Boolean desider = true;
    LoginToFool login = new LoginToFool();	

	@Test(priority = 1)
    public void emailCapAUShareadvisor() throws Throwable {
		   login.loginPreau();
             try {          	         	         	 
                     	 
            	 String xpath = read.readData("ECap", 10, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 10, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 10, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 10, 3);
                 super.enterText(read.getObject("Edit_shareadvqry"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }               
             super.clickButton(read.getObject("button_shaadv"));
             Thread.sleep(3000);
             String web = read.readData("ECap", 1, 0);
             List<WebElement> element = driver.findElements(By.xpath("//form/div[2][text()='Your message was sent successfully. Thanks.']"));
             if (element.size() > 0) {
            	 Reporter.log("Motley Fool Share Advisor Ecap Test  Passed");
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Motley Fool Share Advisor']"));
            if (element1.size() > 0) {
              
                                 Reporter.log("Motley Fool Share Advisor Test Passed");
                Thread.sleep(2000);
                     
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        }
    }
	
	@Test(priority = 2)
    public void emailCapAUShareadvisorUpd() throws Throwable {
		   super.clickButton(read.getObject("Link_Updates"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 11, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 11, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 11, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 11, 3);
                 super.enterText(read.getObject("Edit_shareadvqry"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }               
             super.clickButton(read.getObject("button_shaadv"));
             Thread.sleep(3000);
             String web = read.readData("ECap", 1, 0);
             List<WebElement> element = driver.findElements(By.xpath("//form/div[2][text()='Your message was sent successfully. Thanks.']"));
             if (element.size() > 0) {
            	 Reporter.log("Motley Fool Share Advisor Update Ecap Test  Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Share Advisor Updates']"));
            if (element1.size() > 0) {
                Thread.sleep(2000);
                                 Reporter.log("Motley Fool Share Advisor Update Test Passed");
                Thread.sleep(2000);
                driver.quit();
                Thread.sleep(2000);
            
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        }
    }
	
	
	
	
	
    }
		

  
    

