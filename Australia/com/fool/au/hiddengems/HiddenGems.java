package com.fool.au.hiddengems;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class HiddenGems extends PageObjectModule {
	public Boolean desider = true;
    LoginToFool login = new LoginToFool();	
    @Test(priority = 1)
    public void hiddenGemsHome() throws Throwable {
		  login.loginHiddengem();
          super.clickButton(read.getObject("Link_HidGRec")); 
          List<WebElement> element2 = driver.findElements(By.xpath("//h2[text()='Recommendations']"));
          if (element2.size() > 0) {
              Thread.sleep(1000);
                               Reporter.log("Motley Fool Hidden Gems Recommendations Test Passed");
              Thread.sleep(1000);
                             
          } else {
              Reporter.log("Login not happend for Hidden Gems Recommendations");
              Assert.assertFalse(true);
          }
          
              super.clickButton(read.getObject("Link_HidGupd")); 
              List<WebElement> element3 = driver.findElements(By.xpath("//h2[text()='Updates']"));
                  if (element3.size() > 0) {
                  Thread.sleep(2000);
                                   Reporter.log("Motley Fool Hidden Gems Updates Test Passed");
                                             
              } else {
                  Reporter.log("Login not happend for Hidden Gems Updates");
                  Assert.assertFalse(true);
              }    
              
                  super.clickButton(read.getObject("Link_HidGScr")); 
                  List<WebElement> element4 = driver.findElements(By.xpath("//h2[text()='Hidden Gems Scorecard']"));
                      if (element4.size() > 0) {
                      Thread.sleep(2000);
                                       Reporter.log("Motley Fool Hidden Gems Scorecard Test Passed");
                      Thread.sleep(1000);
                     driver.quit();
                                   
                  } else {
                      Reporter.log("Login not happend for Hidden Gems Scorecard");
                      Assert.assertFalse(true);
                  }     
    }
}
