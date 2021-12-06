package com.fool.us.actinvst;

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

public class actinvst extends PageObjectModule {

    public Boolean desider = true;

    LoginToFool login = new LoginToFool();
    @Test(priority = 1)
    public void Activeinvestorcard1() throws Throwable {
        login.loginUSAct();
        Thread.sleep(2000);
        
        try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 1, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Card-1 Existance Verification Passed");
            	try{
            	super.clickButton(read.readData("US", 1, 1));           
            	String MF1 = driver.getTitle();
            	if (MF1.contains("Roundtable Replay: Tom Talks Everlasting Portfolio Stocks - Motley Fool One")) {
            		Reporter.log(MF1 + " Website Verification Passed");
                	driver.navigate().back();
    			} else {
    				 Reporter.log(MF1+ " Website Verification Failed");                                          
    				 Assert.assertFalse(true);        			
    			}
            	
            	
            	}
                catch (Throwable e) {
                    // TODO Auto-generated catch block
                	driver.navigate().back();
                    e.printStackTrace();
                    Assert.assertFalse(true);
                }
            } else {            	
                Reporter.log("Card-1 Existance Verification Failed");
                Assert.assertFalse(true);
            }
                        
           
        } catch (Throwable e) {
            // TODO Auto-generated catch block        	
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 2)
    public void Activeinvestorcard2() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 2, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Card-2 Existance Verification Passed");
            	
            } else {            	
                Reporter.log("Card-2 Existance Verification Failed");
                Assert.assertFalse(true);
            }
            
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 3)
    public void Activeinvestorcard3() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 3, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Tom's Everlasting Portfolio Card Existance Verification Passed");
            } else {            	
                Reporter.log("Tom's Everlasting Portfolio Card Existance Verification Failed");
                Assert.assertFalse(true);
            }
            
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 3, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Tom's Everlasting Portfolio Header Verification Passed");
            	
            } else {            	
                Reporter.log("Tom's Everlasting Portfolio Header Verification Failed");                    
                Assert.assertFalse(true);
            }
            try{
        	super.clickButton(read.readData("US", 3, 1));
        	List<WebElement> Pageverify1 = driver.findElements(By.xpath(read.readData("US", 3, 5)));
            if (Pageverify1.size() > 0) { 
            	Reporter.log("Tom's Everlasting Portfolio Website Verification Passed");
            	driver.navigate().back();
            } else {            	
                Reporter.log("Tom's Everlasting Portfolio Website Verification Failed");
                Assert.assertFalse(true);
            }
        	}
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                Assert.assertFalse(true);
            }
                        
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 4)
    public void Activeinvestorcard4() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 4, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Motley Fool Touchstone Existance Verification Passed");
            } else {            	
                Reporter.log("Motley Fool Touchstone Existance Verification Failed");
                Assert.assertFalse(true);
            }
            
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 4, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Motley Fool Touchstone Header Verification Passed");
            } else {            	
                Reporter.log("Motley Fool Touchstone Header Verification Failed");
                Assert.assertFalse(true);
            }
            List<WebElement> cardimg1 = driver.findElements(By.xpath(read.readData("US", 4, 3)));
            if (cardimg1.size() > 0) { 
            	Reporter.log("Motley Fool Touchstone Chart Verification Passed");
            	try{
            		String parentHandle = driver.getWindowHandle();
            		super.clickButton(read.getObject("MFTSCRD"));
            		Thread.sleep(5000);
                	//super.clickButton(read.readData("US", 4, 1));
                	for (String winHandle : driver.getWindowHandles()) {
                	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                	}
                	String Wealthmgt = "//img[@alt='Motley Fool Wealth Management']";
                	super.sync(Wealthmgt);
                //	Thread.sleep(5000);
                	String MF1 = driver.getTitle();
                	if (MF1.contains("Welcome to Motley Fool Wealth Management")) {
                		Reporter.log("Motley Fool Touchstone Website Verification Passed");
                    //	driver.navigate().back();
        			} else {
        				 Reporter.log("Motley Fool Touchstone Website Verification Failed");                                               Assert.assertFalse(true);        			
        			}
                	driver.close(); // close newly opened window when done with it
                	driver.switchTo().window(parentHandle); // switch back to the original window
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }
           
            } else {
            	Reporter.log("Motley Fool Touchstone Chart Verification Failed");
            	Assert.assertFalse(true);
            }        
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 5)
    public void Activeinvestorcard5() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 5, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Talk to a Financial Advisor Existance Verification Passed");
            } else {            	
                Reporter.log("Talk to a Financial Advisor Existance Verification Failed");
                Assert.assertFalse(true);
            }
            
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 5, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Talk to a Financial Advisor Header Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 5, 1));
                	List<WebElement> Pageverify1 = driver.findElements(By.xpath(read.readData("US", 5, 5)));
                    if (Pageverify1.size() > 0) { 
                    	Reporter.log("Talk to a Financial Advisor Website Verification Passed");
                    	driver.navigate().back();
                    } else {            	
                        Reporter.log("Talk to a Financial Advisor Website Verification Failed");                      
                        Assert.assertFalse(true);
                    }
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }
            } else {            	
                Reporter.log("Talk to a Financial Advisor Header Verification Failed");
                Assert.assertFalse(true);
            } 

        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
         
    } 
    @Test(priority = 10)
    public void Activeinvestorcard6() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 6, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Scorecard Header Existance Verification Passed");
            } else {            	
                Reporter.log("Scorecard Header Existance Verification Failed");
                Assert.assertFalse(true);
            }
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 6, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Scorecard Header Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 6, 1));
                	String MF1 = driver.getTitle();
                	if (MF1.contains("Motley Fool Scorecards")) {
                		Reporter.log("Scorecard Website Verification Passed");
                    	driver.navigate().back();
        			} else {
        				 Reporter.log("Scorecard Website Verification Failed");                      
                         Assert.assertFalse(true);        			
        			}
                	
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }
            } else {            	
                Reporter.log("Scorecard Header Verification Failed");
                Assert.assertFalse(true);
            }
        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 7)
    public void Activeinvestorcard7() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 7, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Fool One's Top Recs Existance Verification Passed");
            } else {            	
                Reporter.log("Fool One's Top Recs Existance Verification Failed");
             //   Assert.assertFalse(true);
            }
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 7, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Fool One's Top Recs Header Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 7, 1));
                	String MF1 = driver.getTitle();
                	if (MF1.contains("Top Recommendations Around The Fool - Motley Fool One")) {
                		Reporter.log("Fool One's Top Recs Website Verification Passed");
                    	driver.navigate().back();
        			} else {
        				 Reporter.log("Fool One's Top Recs Website Verification Failed");                                               Assert.assertFalse(true);        			
        			}
                	
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }	
            } else {            	
                Reporter.log("Fool One's Top Recs Header Verification Failed");
                Assert.assertFalse(true);
            }

        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 6)
    public void Activeinvestorcard8() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 8, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Rave Podcast: Paccar Card Existancee Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 8, 1));
                	String MF1 = driver.getTitle();
                	if (MF1.contains("EP Performance Review: Fourth Quarter 2014 - Motley Fool One")) {
                		Reporter.log(MF1+" Website Verification Passed");
                    	driver.navigate().back();
        			} else {
        				 Reporter.log(MF1+" Website Verification Failed");                                               Assert.assertFalse(true);        			
        			}
                	
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }	            
            } else {            	
                Reporter.log("EP Rave Podcast: Baidu Card Existance Verification Failed");
                Assert.assertFalse(true);
            } 
        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 8)
    public void Activeinvestorcard9() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 9, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Video Library Existance Verification Passed");
            } else {            	
                Reporter.log("Video Library Existancee Verification Failed");
                Assert.assertFalse(true);
            } 
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 9, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Video Library Header Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 9, 1));
                	String MF1 = driver.getTitle();
                	if (MF1.contains("Motley Fool One")) {
                		Reporter.log("Video Library Website Verification Passed");
                    	driver.navigate().back();
        			} else {
        				 Reporter.log("Video Library Website Verification Failed");                                               Assert.assertFalse(true);        			
        			}
                	
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }	
            } else {            	
                Reporter.log("Video Library Header Verification Failed");
                Assert.assertFalse(true);
            } 
        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } 
    } 
    @Test(priority = 9)
    public void Activeinvestorcard90() throws Throwable {
         try {  
        	List<WebElement> cardname1 = driver.findElements(By.xpath(read.readData("US", 10, 1)));
            if (cardname1.size() > 0) { 
            	Reporter.log("Help Card Name Verification Passed");
            } else {            	
                Reporter.log("Help Card Name Verification Failed");
                Assert.assertFalse(true);
            }
            List<WebElement> cardhead1 = driver.findElements(By.xpath(read.readData("US", 10, 2)));
            if (cardhead1.size() > 0) { 
            	Reporter.log("Help & Support Header Verification Passed");
            	try{
                	super.clickButton(read.readData("US", 10, 1));
                	String MF1 = driver.getTitle();
                	if (MF1.contains("Ask the Fool")) {
                		Reporter.log(MF1+ " Verification Passed");
                    	driver.navigate().back();
        			} else {
        				 Reporter.log(MF1+ " Verification Failed");                                               Assert.assertFalse(true);        			
        			}
                	
                	}
                    catch (Throwable e) {
                        // TODO Auto-generated catch block
                    	driver.navigate().back();
                        e.printStackTrace();
                        Assert.assertFalse(true);
                    }	
            } else {            	
                Reporter.log("Help & Support Header Verification Failed");
                Assert.assertFalse(true);
            }

        	     
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        } driver.quit();
    } 
}