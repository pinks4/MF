package com.fool.us.evlstks;

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

public class Evelststks extends PageObjectModule {

    public Boolean desider = true;

    LoginToFool login = new LoginToFool();
    @Test(priority = 1)
    public void Verifyheaders() throws Throwable {
        login.loginUSAct();
        Thread.sleep(5000);
      //  super.browser();
    	super.getUrl(read.readData("Browser&URL", 31, 1));
        Thread.sleep(5000);
       // driver.navigate().refresh();        
        System.out.println(1);/*
        String cmpname = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();       
        if (cmpname.equals("Company") ) {    
        	System.out.println(3);
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
        if (rave.contains("Rave") ) {     	
        }
        else {            	
            Reporter.log("Rave Header Verification Failed");
            Assert.assertFalse(true);
        }
        String recdate = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
        if (recdate.contains("Latest") ) {     	
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
        if (Avgcst.contains("Avg Cost") ) {     	
        }
        else {            	
            Reporter.log("Avg. Cost Basis Header Verification Failed");
            Assert.assertFalse(true);
        }
        String curprc = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
        if (curprc.equals("Price") ) {     	
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
        String ac = driver.findElement(By.xpath(read.getObject("Head_ac"))).getText();
        System.out.println(ac);
        if (ac.equals("Asset Class") ) {     	
        }
        else {            	
            Reporter.log("Asset Class Header Verification Failed");
            Assert.assertFalse(true);
        }

        String sec = driver.findElement(By.xpath(read.getObject("Head_sec"))).getText();
        if (sec.equals("Sector") ) {     	
        }
        else {            	
            Reporter.log("Sector Header Verification Failed");
            Assert.assertFalse(true);
        }
        
        String mc1 = driver.findElement(By.xpath(read.getObject("Head_1mc"))).getText();
        if (mc1.contains("1 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("1 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String mc3 = driver.findElement(By.xpath(read.getObject("Head_3mc"))).getText();
        if (mc3.contains("3 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("3 Mo Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String yc1 = driver.findElement(By.xpath(read.getObject("Head_1yr"))).getText();
        if (yc1.contains("1 Yr Change") ) {     	
        }
        else {            	
            Reporter.log("1 Yr Change Header Verification Failed");
            Assert.assertFalse(true);
        }
        String dy = driver.findElement(By.xpath(read.getObject("Head_dy"))).getText();
        if (dy.equals("Dividend Yield") ) {     	
        }
        else {            	
            Reporter.log("Dividend Yield Header Verification Failed");
            Assert.assertFalse(true);
        }
        String vo = driver.findElement(By.xpath(read.getObject("Head_vo"))).getText();
        if (vo.contains("Volatility") ) {     	
        }
        else {            	
            Reporter.log("Volatility Header Verification Failed");
            Assert.assertFalse(true);
        }
        String gr = driver.findElement(By.xpath(read.getObject("Head_gr"))).getText();
        if (gr.equals("Glassdoor Rating") ) {     	
        }
        else {            	
            Reporter.log("Glassdoor Rating Header Verification Failed");
            Assert.assertFalse(true);
        }
        String pro = driver.findElement(By.xpath(read.getObject("Head_pro"))).getText();
        if (pro.contains("Prosocial") ) {     	
        }
        else {            	
            Reporter.log("Prosocial Header Verification Failed");
            Assert.assertFalse(true);
        }
        String act = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
        if (act.equals("Add to Scorecard") ) {     
        	Reporter.log("All Headers Verification Passed");
        }
        else {            	
            Reporter.log("Actions Header Verification Failed");
            Assert.assertFalse(true);
        } */
    }
    
        @Test(priority = 2)
        public void Removeheaders() throws Throwable {
        
        super.clickButton(read.getObject("clmsel"));
        super.clickButton(read.getObject("sel_clm"));
        Thread.sleep(2000);
        String cmpname1 = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();
        if (cmpname1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Company Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_rave"));
        Thread.sleep(1000);
        String rave1 = driver.findElement(By.xpath(read.getObject("Head_rave"))).getText();
        if (rave1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Rave Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_recdate"));
        Thread.sleep(1000);
        String recdate1 = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
        if (recdate1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Rec Date Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_perport"));
        Thread.sleep(1000);
        String perport1 = driver.findElement(By.xpath(read.getObject("Head_perport"))).getText();
        if (perport1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("% of Port Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_avgcst"));
        Thread.sleep(1000);
        String avgcst1 = driver.findElement(By.xpath(read.getObject("Head_avgcst"))).getText();
        if (avgcst1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Average Cost Header Removal Verification Failed");
            Assert.assertFalse(true);
        } 
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_curprc"));
        Thread.sleep(1000);
        String curprc1 = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
        if (curprc1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Current Price Header Removal Verification Failed");
            Assert.assertFalse(true);
        } 
        
        Thread.sleep(200); 
        super.clickButton(read.getObject("sel_mktval"));
        Thread.sleep(1000);
        String mktval1 = driver.findElement(By.xpath(read.getObject("Head_mktval"))).getText();
        if (mktval1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Market Value Header Removal Verification Failed");
            Assert.assertFalse(true);
        } 
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_ret"));
        Thread.sleep(1000);
        String ret1 = driver.findElement(By.xpath(read.getObject("Head_ret"))).getText();
        if (ret1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Return Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_ac"));
        Thread.sleep(1000);
        String ac = driver.findElement(By.xpath(read.getObject("Head_ac"))).getText();
        if (ac.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Asset Class  Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_sec"));
        Thread.sleep(1000);
        String sec = driver.findElement(By.xpath(read.getObject("Head_sec"))).getText();
        if (sec.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Sector Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_1mc"));
        Thread.sleep(1000);
        String mc1 = driver.findElement(By.xpath(read.getObject("Head_1mc"))).getText();
        if (mc1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("1 Month Change Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_3mc"));
        Thread.sleep(1000);
        String mc3 = driver.findElement(By.xpath(read.getObject("Head_1mc"))).getText();
        if (mc3.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("3 Month Change Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_1yr"));
        Thread.sleep(1000);
        String yr1 = driver.findElement(By.xpath(read.getObject("Head_1yr"))).getText();
        if (yr1.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("1 Year Change Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_dy"));
        Thread.sleep(1000);
        String dy = driver.findElement(By.xpath(read.getObject("Head_dy"))).getText();
        if (dy.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Dividend Yield Header Removal Verification Failed");
            Assert.assertFalse(true);
        }

Thread.sleep(200);
        super.clickButton(read.getObject("sel_vo"));
        Thread.sleep(1000);
        String vo = driver.findElement(By.xpath(read.getObject("Head_vo"))).getText();
        if (vo.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Volality Header Removal Verification Failed");
            Assert.assertFalse(true);
        }

Thread.sleep(200);
        super.clickButton(read.getObject("sel_gr"));
        Thread.sleep(1000);
        String gr = driver.findElement(By.xpath(read.getObject("Head_gr"))).getText();
        if (gr.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("Glass Door rating Header Removal Verification Failed");
            Assert.assertFalse(true);
        }

Thread.sleep(200);
        super.clickButton(read.getObject("sel_pro"));
        Thread.sleep(1000);
        String pro = driver.findElement(By.xpath(read.getObject("Head_pro"))).getText();
        if (pro.isEmpty() ) {     	
        }
        else {            	
            Reporter.log("pro Header Removal Verification Failed");
            Assert.assertFalse(true);
        }
        
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_act"));
        Thread.sleep(1000);
        String act1 = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
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
        	String ticker = driver.findElement(By.xpath(read.getObject("Head_tic"))).getText();
            if (ticker.equals("Ticker") ) {     	
            }
            else {            	
                Reporter.log("Ticker Header Verification Failed");
                Assert.assertFalse(true);
            }  
            super.clickButton(read.getObject("sel_clm"));
            Thread.sleep(1000);
            String cmpname = driver.findElement(By.xpath(read.getObject("Head_cmp"))).getText();
            if (cmpname.equals("Company") ) {  
            }
            else {            	
                Reporter.log("Company Header Addition Failed");
                Assert.assertFalse(true);
            }
            Thread.sleep(200);
        	super.clickButton(read.getObject("sel_rave"));
            Thread.sleep(1000);
            String rave = driver.findElement(By.xpath(read.getObject("Head_rave"))).getText();
             if (rave.contains("Rave") ) {    
            }
            else {            	
                Reporter.log("Rave Header Addition Failed");
                Assert.assertFalse(true);
            }
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_recdate"));
            Thread.sleep(1000);
            String recdate = driver.findElement(By.xpath(read.getObject("Head_recdate"))).getText();
            if (recdate.contains("Latest") ) {     
            }
            else {            	
                Reporter.log("Rec Date Header Addition Failed");
                Assert.assertFalse(true);
            }
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_perport"));
            Thread.sleep(1000);
            String perport = driver.findElement(By.xpath(read.getObject("Head_perport"))).getText();
            if (perport.equals("% of Port") ) {     	
            }
            else {            	
                Reporter.log("% of Port Header Addition Failed");
                Assert.assertFalse(true);
            }
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_avgcst"));
            Thread.sleep(1000);
            String avgcst = driver.findElement(By.xpath(read.getObject("Head_avgcst"))).getText();
           if (avgcst.contains("Avg Cost") ) {     	
            }
            else {            	
                Reporter.log("Average Cost Header Addition Failed");
                Assert.assertFalse(true);
            } 
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_curprc"));
            Thread.sleep(1000);
            String curprc = driver.findElement(By.xpath(read.getObject("Head_curprc"))).getText();
           if (curprc.equals("Price") ) {     	
            }
            else {            	
                Reporter.log("Current Price Header Addition Failed");
                Assert.assertFalse(true);
            } 
            
            Thread.sleep(200); 
            super.clickButton(read.getObject("sel_mktval"));
            Thread.sleep(1000);
            String mktval = driver.findElement(By.xpath(read.getObject("Head_mktval"))).getText();
            if (mktval.equals("Market Value") ) {     	
            }
            else {            	
                Reporter.log("Market Value Header Addition Failed");
                Assert.assertFalse(true);
            } 
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_ret"));
            Thread.sleep(1000);
            String ret = driver.findElement(By.xpath(read.getObject("Head_ret"))).getText();
           if (ret.equals("Return") ) {     	
            }
            else {            	
                Reporter.log("Return Header Addition Failed");
                Assert.assertFalse(true);
            }
           Thread.sleep(200);
           super.clickButton(read.getObject("sel_ac"));
           Thread.sleep(1000);
           String ac = driver.findElement(By.xpath(read.getObject("Head_ac"))).getText();
          if (ac.equals("Asset Class") ) {     	
           }
           else {            	
               Reporter.log("Asset Class Header Addition Failed");
               Assert.assertFalse(true);
           }
          Thread.sleep(200);
          super.clickButton(read.getObject("sel_sec"));
          Thread.sleep(1000);
          String sec = driver.findElement(By.xpath(read.getObject("Head_sec"))).getText();
         if (sec.equals("Sector") ) {     	
          }
          else {            	
              Reporter.log("Sector Header Addition Failed");
              Assert.assertFalse(true);
          }
         Thread.sleep(200);
         super.clickButton(read.getObject("sel_1mc"));
         Thread.sleep(1000);
         String mc1 = driver.findElement(By.xpath(read.getObject("Head_1mc"))).getText();
        if (mc1.equals("1 Mo Change") ) {     	
         }
         else {            	
             Reporter.log("1 Mo Change Header Addition Failed");
             Assert.assertFalse(true);
         }
        Thread.sleep(200);
        super.clickButton(read.getObject("sel_3mc"));
        Thread.sleep(1000);
        String mc3 = driver.findElement(By.xpath(read.getObject("Head_3mc"))).getText();
       if (mc3.equals("3 Mo Change") ) {     	
        }
        else {            	
            Reporter.log("3 Mo Change Header Addition Failed");
            Assert.assertFalse(true);
        }
       Thread.sleep(200);
       super.clickButton(read.getObject("sel_1yr"));
       Thread.sleep(1000);
       String yr1 = driver.findElement(By.xpath(read.getObject("Head_1yr"))).getText();
      if (yr1.equals("1 Yr Change") ) {     	
       }
       else {            	
           Reporter.log("1 Year Change Header Addition Failed");
           Assert.assertFalse(true);
       }
      Thread.sleep(200);
      super.clickButton(read.getObject("sel_dy"));
      Thread.sleep(1000);
      String dy1 = driver.findElement(By.xpath(read.getObject("Head_dy"))).getText();
     if (dy1.equals("Dividend Yield") ) {     	
      }
      else {            	
          Reporter.log("Divident Yield Header Addition Failed");
          Assert.assertFalse(true);
      }
     Thread.sleep(200);
     super.clickButton(read.getObject("sel_vo"));
     Thread.sleep(1000);
     String vo = driver.findElement(By.xpath(read.getObject("Head_vo"))).getText();
    if (vo.equals("Volatility") ) {     	
     }
     else {            	
         Reporter.log("Volatlity Header Addition Failed");
         Assert.assertFalse(true);
     }
    
    Thread.sleep(200);
    super.clickButton(read.getObject("sel_gr"));
    Thread.sleep(1000);
    String gr = driver.findElement(By.xpath(read.getObject("Head_gr"))).getText();
   if (gr.equals("Glassdoor Rating") ) {     	
    }
    else {            	
        Reporter.log("Glassdoor Rating Header Addition Failed");
        Assert.assertFalse(true);
    }
   Thread.sleep(200);
   super.clickButton(read.getObject("sel_pro"));
   Thread.sleep(1000);
   String pro = driver.findElement(By.xpath(read.getObject("Head_pro"))).getText();
  if (pro.equals("Prosocial") ) {     	
   }
   else {            	
       Reporter.log("Prosocial Header Addition Failed");
       Assert.assertFalse(true);
   }
            Thread.sleep(200);
            super.clickButton(read.getObject("sel_act"));
            Thread.sleep(1000);
            String act = driver.findElement(By.xpath(read.getObject("Head_act"))).getText();
            if (act.equals("Add to Scorecard") ) {     
            	Reporter.log("All Headers Addition Passed");
            	// driver.quit();
            }
            else {            	
                Reporter.log("Actions Header Addition Failed");
                Assert.assertFalse(true);
            }driver.quit();
        }
        }     

        