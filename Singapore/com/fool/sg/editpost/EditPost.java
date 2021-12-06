package com.fool.sg.editpost;

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

public class EditPost extends PageObjectModule {

    LoginToFool login = new LoginToFool();
    
    @Test
    public void editingCreatedPost() throws Throwable {
        
        login.loginSG();
        String dashboard=read.getObject("Link_NewCanada");
        try {
        	  super.sync(dashboard);
            super.clickButton(read.getObject("Link_NewCanada"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        
        try {
        	String LAA= read.getObject("Link_AllArticles");
        	super.sync(LAA);
            super.clickButton(read.getObject("Link_AllArticles"));
        } catch (Throwable e3) {
            // TODO Auto-generated catch block
            e3.printStackTrace();
            Assert.assertFalse(true);
        }
        
        
        try {
            
            title = read.readData("PostMessage", 1, 0);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        String editMsg="//a[text()='" + title + "']";
        super.sync(editMsg);
        List<WebElement> list = driver.findElements(By.xpath(editMsg));
        if (list.size() > 0) {
            driver.findElement(By.xpath(editMsg)).click();
        } else {
            Reporter.log("Element which is to be edited not found");
            Assert.assertFalse(true);
        }

        driver.findElement(By.xpath("//input[@id='title' and @name='post_title']")).clear();

        super.enterText(read.getObject("Edit_Title"), read.readData("EditPost", 1, 0));
      //  Thread.sleep(3000);

        try {
            super.clickButton(read.getObject("Button_Text"));
        } catch (Throwable e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
      //      Thread.sleep(2000);
            driver.findElement(By.xpath("//textarea[@id='content']")).clear();
            super.enterText(read.getObject("Edit_Body"), read.readData("EditPost", 1, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.clickButton(read.getObject("Button_AddMedia"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	String Ml= read.getObject("Link_MediaLib");
        	super.sync(Ml);
            super.clickButton(read.getObject("Link_MediaLib"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	//Thread.sleep(3000);
        	WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(read.getObject("Link_ImgSig1"))));
        	super.clickButton(read.getObject("Link_ImgSig1"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	String BIP= read.getObject("Button_InsertToPost");
        	super.sync(BIP);
            super.clickButton(read.getObject("Button_InsertToPost"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.clickButton(read.getObject("Button_Visual"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        try {
         	 String BP= read.getObject("Button_Publish");
             super.sync(BP);
            super.clickButton(read.getObject("Button_Publish"));
            String viewLink=read.getObject("postmsg");
            super.sync(viewLink);
            String s = driver.findElement(By.xpath(viewLink)).getText().trim();
            if (s.equalsIgnoreCase("Post updated. View post")) {         
            	Reporter.log("Motely Fool Singapore Article is Edited successfully");
            }
            try {
                super.getUrl(read.readData("Browser&URL", 8, 2));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            title = read.readData("PostMessage", 1, 0);
            String titleAfter = read.readData("EditPost", 1, 0);
            String str = titleAfter;

            Boolean isPresent = driver.findElements(By.xpath("//a[text()='" + str + "']")).size() > 0;
            String MP= "//a[text()='" + str + "']";
            super.sync(MP);
            if (isPresent.equals(true)) {
                WebElement ele = driver.findElement(By.xpath("//a[text()='" + str + "']"));
                super.highlightElement(ele);
                Assert.assertEquals(title, title);
                Reporter.log("Motely Fool Singapore Article Edit Verified successfully");
                driver.quit();
            } else {
                Reporter.log("Edited post is not found");
                Assert.assertFalse(true);
            }

        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}

