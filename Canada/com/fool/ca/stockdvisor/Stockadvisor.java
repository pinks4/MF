package com.fool.ca.stockdvisor;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class Stockadvisor extends PageObjectModule {
    public Boolean desider = true;
    LoginToFool login = new LoginToFool();	
    
	@Test(priority = 1)
    public void emailCapCAStockadvisor() throws Throwable {
		login.loginCAStAdv();
             try {          	         	         	 
                     	 
            	 String xpath = read.readData("ECap", 24, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 24, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 24, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 24, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Ecap Test Passed");
            	 String title = driver.getTitle();
					if (title.equals("Motley Fool Stock Advisor Canada")) {
						Reporter.log("Motley Fool Stock Advisor Test Passed");
		                Thread.sleep(2000);
                  
                    } else {
                    	Reporter.log("Login not happend for Stock Advisor");
                    	Assert.assertFalse(true);
                    } 
             } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        }
    }
	
    /*
	@Test(priority = 2)
    public void emailCapCAStockadvisorissu() throws Throwable {
		   super.clickButton(read.getObject("Link_Updatecaiss"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 26, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 26, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 26, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 26, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Issues Ecap Test Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Issues']"));
            if (element1.size() > 0) {
                Reporter.log("Motley Fool Stock Advisor Issues Test Passed");
                Thread.sleep(2000);
            
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        }
    } */
	/*
	@Test(priority = 3)
    public void emailCapCAStockadvisorUpd() throws Throwable {
		//  login.loginCAStAdv();
		   super.clickButton(read.getObject("Link_Updatecastk"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 25, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
            	   Thread.sleep(3000);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 25, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 25, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 25, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Update Ecap Test Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Stock Advisor Updates']"));
            if (element1.size() > 0) {
                Reporter.log("Motley Fool Stock Advisor Updates Test Passed");
                Thread.sleep(2000);
            
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        }
    } */
	/*
	@Test(priority = 6)
	public void emailCapCAStockadvisorscr() throws Throwable {
		super.clickButton(read.getObject("Link_Updatecascr"));
		List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Scorecard']"));
        if (element1.size() > 0) {
            Reporter.log("Motley Fool Stock Advisor Scorecard Test Passed");
            Thread.sleep(2000);
            driver.quit();         
            
        } else {
            Reporter.log("Login not happend for Website");
            Assert.assertFalse(true);
        }
	}
	
	/*
    public void emailCapCAStockadvisorscr() throws Throwable {
				super.clickButton(read.getObject("Link_Updatecascr"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 27, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 27, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 27, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 27, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Scorecard Ecap Test Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Scorecard']"));
            if (element1.size() > 0) {
                Reporter.log("Motley Fool Stock Advisor Scorecard Test Passed");
                Thread.sleep(2000);
                      
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        } 
    } */
    
	
	@Test(priority = 5)
    public void emailCapCAStockadvisorsplrep() throws Throwable {
			super.clickButton(read.getObject("Link_Updatecasplrep"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 29, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 29, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 29, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 29, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Special Reports Centre Ecap Test Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Special Reports Centre']"));
            if (element1.size() > 0) {
                Reporter.log("Motley Fool Stock Advisor Special Reports Centre Test Passed");
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
	
	@Test(priority = 4)
    public void emailCapCAStockadvisorfaq() throws Throwable {
	//	login.loginCAStAdv();
		   super.clickButton(read.getObject("Link_Updatecasafaq"));
		        try {          	         	         	 
                 	 
            	 String xpath = read.readData("ECap", 30, 1);
            	 Thread.sleep(2000);
            	 super.enterText(read.getObject("Edit_shareadvname"), xpath);
             } catch (Throwable e) {
            	 // TODO Auto-generated catch block
            	 e.printStackTrace();
            	 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 30, 2);
                 super.enterText(read.getObject("Edit_shareadvemail"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }
             try {

                 String xpath = read.readData("ECap", 30, 3);
                 super.enterText(read.getObject("Edit_shareadvsub"), xpath);
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }  
             try {

                 String xpath = read.readData("ECap", 30, 3);
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
            	 Reporter.log("Motley Fool Stock Advisor Frequently Asked Questions Ecap Test Passed");     
            List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Frequently Asked Questions']"));
            if (element1.size() > 0) {
                Reporter.log("Motley Fool Stock Advisor Frequently Asked Questions Test Passed");
                Thread.sleep(2000);
            //    driver.quit();          
                
            } else {
                Reporter.log("Login not happend for Website");
                Assert.assertFalse(true);
            }
        } else {
            Reporter.log("Login not happend for " + web + " Website");
            Assert.assertFalse(true);
        } 
	} 
	@Test(priority = 7)
	public void emailCapCAStockadvisoracc() throws Throwable {
	//	login.loginCAStAdv();
	//	login.loginCAStAdv1();
		   super.clickButton(read.getObject("Link_Updatecasaacc1"));
		   Thread.sleep(2000);
		   
         List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Manage Account']"));
         if (element1.size() > 0) {
                  Reporter.log("Motley Fool Stock Advisor Your Account Test Passed");
        
                  Thread.sleep(2000);
                //  driver.quit();
         } else {
             Reporter.log("Login not happend for Website");
             Assert.assertFalse(true);
         
         }
	} 
	
	@Test(priority = 8)
	public void emailCapCAStockadvisorfrm() throws Throwable {
	//	login.loginCAStAdv();
		   super.clickButton(read.getObject("Link_Updatecafrm"));
		      
         List<WebElement> element1 = driver.findElements(By.xpath("//h2[text()='Stock Advisor Canada Discussions']"));
         if (element1.size() > 0) {
             Reporter.log("Motley Fool Stock Advisor Forum Test Passed");
             Thread.sleep(2000);
             driver.quit();
         } else {
             Reporter.log("Login not happend for Website");
             Assert.assertFalse(true);
         }
     
    
         } 
	
	
	
	
    }
		