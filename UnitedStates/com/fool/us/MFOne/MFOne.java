package com.fool.us.MFOne;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;
	
public class MFOne extends PageObjectModule {
	public Boolean desider = true;
	SoftAssert s_assert = new SoftAssert();
	
    LoginToFool login = new LoginToFool();
    @Test(priority = 3)
    public void Mf1Tab1() throws Throwable {
     //   login.loginUSAct();           
 
        super.clickButton(read.getObject("MF1EP")); 
        super.clickButton(read.getObject("MF1EPdw")); 
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Tom's Everlasting Portfolio - Motley Fool One")) {
        		Reporter.log("Tom's Everlasting Portfolio - Motley Fool One Verification Passed"); 
        		 try { 
        			 super.sync(read.getObject("STKADD"));
        			 super.clickButton(read.getObject("STKADD"));
        			 super.sync(read.getObject("STKYES"));
        			 List<WebElement> STKADDED= driver.findElements(By.xpath(read.getObject("STKYES")));
        	            if (STKADDED.size() > 0) { 
        	            	Reporter.log("Stock Added Button Verification Passed");
        	            	
        	            } else {            	
        	                Reporter.log("Stock Added Verification Failed");
        	                Assert.assertFalse(true);
        	            }
        	            try {
               			super.getUrl(read.getObject("STKDET"));
               		//	super.sync(read.getObject("STKEDT"));
               			super.clickButton(read.getObject("STKEDT"));
               			super.clickButton(read.getObject("STKDEL"));
               			super.clickButton(read.getObject("STKDELCFM"));
               			Thread.sleep(3000); 
               			List<WebElement> STKDELETED= driver.findElements(By.xpath(read.getObject("STKDELVER")));
                        if (STKDELETED.size() > 0) { 
                        	Reporter.log("Stock Deletion Verification Passed");
                        	
                        } else {            	
                            Reporter.log("Stock Deletion Verification Failed");
                            Assert.assertFalse(true);
                        }
               			Reporter.log("Stock Deleted Succesfully");
        	            }
                        catch (Throwable e) {
                            // TODO Auto-generated catch block
                        	driver.navigate().back();
                            e.printStackTrace();
                            Assert.assertFalse(true);
                        }
        		 }
                 catch (Throwable e) {
                     // TODO Auto-generated catch block
                	 Reporter.log("Added Stock verification Failed");
                	 super.getUrl(read.getObject("MF1HOME")); 
                     e.printStackTrace();
                     s_assert.assertFalse(true);
                 } 
			} else {
				 Reporter.log("Tom's Everlasting Portfolio - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        	 try {
        		    super.getUrl(read.getObject("MF1HOME")); 
        	        super.clickButton(read.getObject("MF1EP")); 
        	        super.clickButton(read.getObject("MF1EPer"));   
        	        	String MF2 = driver.getTitle();
        	        	if (MF2.contains("Everlasting Raves | The Motley Fool")) {
        	        		Reporter.log("Everlasting Raves | The Motley Fool Verification Passed");  
        	        		driver.navigate().back();
        				} else {
        					 Reporter.log("Everlasting Raves | The Motley Fool Verification Failed");                                               Assert.assertFalse(true);        			
        				}
        	        }
        	        catch (Throwable e) {
        	            // TODO Auto-generated catch block
        	        	driver.navigate().back();
        	            e.printStackTrace();
        	            s_assert.assertFalse(true);
        	        }
        	 super.sync(read.getObject("MF1EP")); 
             super.clickButton(read.getObject("MF1EP")); 
             super.clickButton(read.getObject("MF1EPex")); 
             try {  
             	String MF3 = driver.getTitle();
             	if (MF3.contains("EP Exclusives - Motley Fool One")) {
             		Reporter.log("EP Exclusives - Motley Fool One Verification Passed");   
             		driver.navigate().back();
     			} else {
     				 Reporter.log("EP Exclusives - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
     			}
             }
                 catch (Throwable e) {
                     // TODO Auto-generated catch block
                 	driver.navigate().back();
                     e.printStackTrace();
                     Assert.assertFalse(true);
                 }
             s_assert.assertAll();               
}
   @Test(priority = 1)
    public void Mf1Tab2() throws Throwable {
	   login.loginUSAct(); 
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1AA1")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("All Fool One Coverage - Motley Fool One")) {
        		Reporter.log("All Fool One Coverage - Motley Fool One Verification Passed");  
        		driver.navigate().back();
			} else {
				 Reporter.log("All Fool One Coverage - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            }   
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1F1")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Fool One Exclusives - Motley Fool One")) {
        		Reporter.log("Fool One Exclusives - Motley Fool One Verification Passed");  
        		driver.navigate().back();
			} else {
				 Reporter.log("Fool One Exclusives - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            }
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1TR")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Top Recommendations Around The Fool - Motley Fool One")) {
        		Reporter.log("Top Recommendations Around The Fool - Motley Fool One Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log("Top Recommendations Around The Fool - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            } 
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1VL")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Video Library - Motley Fool One")) {
        		Reporter.log("Video Library - Motley Fool One Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log("Video Library - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            } 
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1SS")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Screener - Motley Fool One")) {
        		Reporter.log("Screener - Motley Fool One Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log("Screener - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            }
        super.clickButton(read.getObject("MF1AA")); 
        super.clickButton(read.getObject("MF1SR")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Special Reports - Motley Fool One")) {
        		Reporter.log("Special Reports - Motley Fool One Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log("Special Reports - Motley Fool One Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                Assert.assertFalse(true);
            }
} 
    @Test(priority = 2)
    public void Mf1Tab3() throws Throwable { 
    	//  login.loginUSAct();
    /*	String parentHandle = driver.getWindowHandle();
        super.clickButton(read.getObject("MF1WM"));        
        super.clickButton(read.getObject("MF1WMTS"));  
    	for (String winHandle : driver.getWindowHandles()) {
    	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
    	}     	
        try {
        	super.sync(read.getObject("WELMGMT")); 
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Welcome to Motley Fool Wealth Management")) {
        		Reporter.log(MF1+" TouchStone Verification Passed");  
        		driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Verificatio Failed");                                               
				 Assert.assertFalse(true);        			
			}
            driver.close(); // close newly opened window when done with it
        	driver.switchTo().window(parentHandle); // switch back to the original window
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                s_assert.assertFalse(true);
            }        
        super.clickButton(read.getObject("MF1WM")); 
        super.clickButton(read.getObject("MF1WMMA")); 
        for (String winHandle : driver.getWindowHandles()) {
    	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
    	}   
        try {  
        String Wealthmgt1 = "//img[@alt='Motley Fool Wealth Management']";
    	super.sync(Wealthmgt1);
      
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Welcome to Motley Fool Wealth Management")) {
        		Reporter.log(MF1+" Manage Account Verification Passed");  
        	//	driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Manage Account Verification Failed");                                               Assert.assertFalse(true);        			
			}
        	Thread.sleep(5000);
            driver.close(); // close newly opened window when done with it
            Thread.sleep(5000);
        	driver.switchTo().window(parentHandle); // switch back to the original window
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	Thread.sleep(5000);
                driver.close(); // close newly opened window when done with it
                Thread.sleep(5000);
            	driver.switchTo().window(parentHandle); // switch back to the original window
                e.printStackTrace();
                Reporter.log("Manage Account Verification Failed"); 
                s_assert.assertFalse(true);        	  
            } */
        super.clickButton(read.getObject("MF1WM")); 
        super.clickButton(read.getObject("MF1WMFA")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Making Your Financial Planning Phone Call With Ayco - Motley Fool One")) {
        		Reporter.log(MF1+" Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                Assert.assertFalse(true);
            }    
        s_assert.assertAll();
       // driver.quit();
} 
    @Test(priority = 5)
    public void Mf1Tab4() throws Throwable {
        super.clickButton(read.getObject("MF1SC")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Motley Fool Scorecards")) {
        		Reporter.log(MF1+" Page Title Verification Passed");  
        	//	driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Page Title Verification Failed");
				 s_assert.assertFalse(true);      			
			}  
        	Thread.sleep(2000);
        	List<WebElement> scorecard = driver.findElements(By.xpath("//header/div/span[text()='All Scorecards']"));
        	Thread.sleep(6000);
        	if (scorecard.size() > 0) {       		        		
            	Reporter.log("Dashboard Page Verification Passed"); 
          } else {            	
              Reporter.log("Dashboard page Verification Failed");
              s_assert.assertFalse(true);
          }   
        super.clickButton(read.getObject("MF1SCSTK"));
        Thread.sleep(2000);
        List<WebElement> scroverall = driver.findElements(By.xpath(read.getObject("MF1SCOVR")));
    	if (scroverall.size() > 0) {        		        		
    	Reporter.log("Stock Overall Tab Verification Passed");
    	} else {            	
            Reporter.log("Stock Overall Tab Verification Failed");
            s_assert.assertFalse(true);
        }
    	 super.clickButton(read.getObject("MF1SCSTKTOD"));
         Thread.sleep(2000);
         List<WebElement> scrtod = driver.findElements(By.xpath(read.getObject("MF1SCSTKTODA")));
     	if (scrtod.size() > 0) {        		        		
     	Reporter.log("Today Tab Verification Passed");
     	} else {            	
             Reporter.log("Today Tab Verification Failed");
             s_assert.assertFalse(true);
         }
     	 super.clickButton(read.getObject("MF1SCSTKAV"));
         Thread.sleep(2000);
         List<WebElement> scrAV = driver.findElements(By.xpath(read.getObject("MF1SCSTKAVH")));
     	if (scrAV.size() > 0) {        		        		
     	Reporter.log("Add a View Tab Verification Passed");
     	} else {            	
             Reporter.log("Add a View Tab Verification Failed");
             s_assert.assertFalse(true);
         }
    	super.clickButton(read.getObject("MF1SCNEWS"));
        Thread.sleep(2000);
        List<WebElement> scrnews = driver.findElements(By.xpath(read.getObject("MF1SCNEWSHD")));
    	if (scrnews.size() > 0) {        		        		
    	Reporter.log("News Tab Verification Passed");
    	} else {            	
            Reporter.log("News Tab Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCNEWTA"));
        Thread.sleep(2000);
        List<WebElement> scrnewta = driver.findElements(By.xpath(read.getObject("MF1SCNEWTAH")));
    	if (scrnewta.size() > 0) {        		        		
    	Reporter.log("Trade Alerts Verification Passed");
    	} else {            	
            Reporter.log("Trade Alerts Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCNEWBP"));
        Thread.sleep(2000);
        List<WebElement> scrnewbp = driver.findElements(By.xpath(read.getObject("MF1SCNEWBPH")));
    	if (scrnewbp.size() > 0) {        		        		
    	Reporter.log("Boards Posts Verification Passed");
    	} else {            	
            Reporter.log("Boards Posts Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCSET"));
        Thread.sleep(2000);
        List<WebElement> scrset = driver.findElements(By.xpath(read.getObject("MF1SCSETSS")));
    	if (scrset.size() > 0) {        		        		
    	Reporter.log("Settings Tab Verification Passed");
    	} else {            	
            Reporter.log("Settings Tab Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCSETMSC"));
        Thread.sleep(2000);
        List<WebElement> scrsetms = driver.findElements(By.xpath(read.getObject("MF1SCSETMSCH")));
    	if (scrsetms.size() > 0) {        		        		
    	Reporter.log("Manage Scorecards Verification Passed");
    	} else {            	
            Reporter.log("Manage Scorecards Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCSETASC"));
    	Thread.sleep(2000);
        List<WebElement> scrsetasc = driver.findElements(By.xpath(read.getObject("MF1SCSETASCH")));
    	if (scrsetasc.size() > 0) {        		        		
    	Reporter.log("Add a Scorecard Verification Passed");
    	} else {            	
            Reporter.log("Add a Scorecard Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCSETID"));
    	Thread.sleep(2000);
        List<WebElement> scrsetid = driver.findElements(By.xpath(read.getObject("MF1SCSETIDH")));
    	if (scrsetid.size() > 0) {        		        		
    	Reporter.log("In Development Verification Passed");
    	} else {            	
            Reporter.log("In Development Verification Failed");
            s_assert.assertFalse(true);
        }
    	super.clickButton(read.getObject("MF1SCHLP"));
        Thread.sleep(2000);
        List<WebElement> scrhlpvt = driver.findElements(By.xpath(read.getObject("MF1SCHLPVT")));
    	if (scrhlpvt.size() > 0) {        		        		
    	Reporter.log("Video Tutorials Verification Passed");
    	} else {            	
            Reporter.log("Video Tutorials Verification Failed");
            s_assert.assertFalse(true);
        }
    	
    	super.clickButton(read.getObject("MF1SCHLPFAQ"));
    	Thread.sleep(2000);
        List<WebElement> scrhlpfq = driver.findElements(By.xpath(read.getObject("MF1SCHLPFAQTX")));
    	if (scrhlpfq.size() > 0) {        		        		
    	Reporter.log("FAQ Verification Passed");
    	driver.navigate().back();
    	} else {            	
            Reporter.log("FAQ Verification Failed");
            s_assert.assertFalse(true);
            driver.navigate().back();
        }
        }
    	catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            s_assert.assertFalse(true);
         //   driver.navigate().back();
        }
        
}  
    @Test(priority = 4)
    public void Mf1Tab5() throws Throwable {
    	//  login.loginUSAct(); 
        super.clickButton(read.getObject("MF1CM")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Community - Motley Fool One")) {
        		Reporter.log("Community - Motley Fool One Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Verification Passed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                Assert.assertFalse(true);
            }
        super.clickButton(read.getObject("MF1HLP")); 
        try {  
        	String MF1 = driver.getTitle();
        	if (MF1.contains("Ask the Fool")) {
        		Reporter.log("Ask the Fool Verification Passed");   
        		driver.navigate().back();
			} else {
				 Reporter.log(MF1+" Verification Failed");                                               Assert.assertFalse(true);        			
			}
        }
            catch (Throwable e) {
                // TODO Auto-generated catch block
            	driver.navigate().back();
                e.printStackTrace();
                Assert.assertFalse(true);
            } driver.quit();
} 
}    