package com.fool.UK.deletepost;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class DeletePost extends PageObjectModule {
    
    LoginToFool login = new LoginToFool();
    
    @Test
    public void deleteCreatedPost() throws Throwable {

        login.loginUK();
/*
        String dashboard = read.getObject("Link_NewCanada");
        try {
            super.sync(dashboard);
            super.clickButton(read.getObject("Link_NewCanada"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        */
        
        try {
            super.clickButton(read.getObject("Link_AllArticles"));
        } catch (Throwable e3) {
            // TODO Auto-generated catch block
            e3.printStackTrace();
            Assert.assertFalse(true);
        }                
       
        Thread.sleep(2000);
        String editedPost = read.readData("EditPost", 1, 0);
        String deleMsg = "//a[text()='" + editedPost + "']";
        super.sync(deleMsg);
        List<WebElement> ele = driver.findElements(By.xpath(deleMsg));
        if (ele.size() > 0) {
            driver.findElement(By.xpath(deleMsg)).click();
          //  Thread.sleep(2000);
            super.clickButton(read.getObject("Link_Trash"));
    
            String viewLink=read.getObject("postmsg");
            super.sync(viewLink);
            String s = driver.findElement(By.xpath(viewLink)).getText().trim();
            if (s.equalsIgnoreCase("1 post moved to the Trash. Undo")) {         
            	Reporter.log("Motely Fool UK Article is Deleted successfully");
            }        
                      
            // driver.quit();
        } else {
            Reporter.log("Expected Element " + editedPost + " not found to trash");
            Assert.assertFalse(true);
        }

        try {
            super.getUrl(read.readData("Browser&URL", 29, 2));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        title = read.readData("PostMessage", 1, 0);
        String titleAfter1 = read.readData("EditPost", 1, 0);
        String str = titleAfter1;
        String str1 = title;
        //Thread.sleep(5000);
        List<WebElement> ele2 = driver.findElements(By.xpath("//a[text()='" + str + "']"));
        List<WebElement> ele1 = driver.findElements(By.xpath("//a[text()='" + str1 + "']"));
        if (ele2.size() > 0 || ele1.size() > 0) {
            Reporter.log("Message is not deleted Properly");
            Assert.assertFalse(true);
        } else {
            Reporter.log("Motely Fool UK Article Deletion Verified successfully");
        }
        
        Thread.sleep(3000);
        driver.quit();

    }
}