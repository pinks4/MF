package com.fool.UK.createpost;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class CreatePost extends PageObjectModule {

    public Boolean desider = true;

    LoginToFool login = new LoginToFool();

    @Test
    public void messagePost() throws Throwable {

        login.loginUK();
        String dashboard=read.getObject("Link_NewCanada");
        super.sync(dashboard);
        try {
            super.clickButton(read.getObject("Link_NewCanada"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.enterText(read.getObject("Edit_Title"), read.readData("PostMessage", 1, 0));
            //Thread.sleep(3000);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.clickButton(read.getObject("Button_TextUK"));
        } catch (Throwable e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
           // Thread.sleep(2000);
            super.enterText(read.getObject("Edit_Body"), read.readData("PostMessage", 1, 1));
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
            super.clickButton(Ml);
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	//Thread.sleep(2000);
        	WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(read.getObject("Link_ImgCanada"))));
        	super.clickButton(read.getObject("Link_ImgCanada"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	String BIP= read.getObject("Button_InsertToPost");
        	super.sync(BIP);
            super.clickButton(BIP);
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.clickButton(read.getObject("Button_VisualUK"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        String BP= read.getObject("Button_Publish");
        super.sync(BP);
        super.clickButton(BP);
        String postmsg = read.getObject("postmsg");
        super.sync(postmsg);
        String s = driver.findElement(By.xpath(postmsg)).getText().trim();
        if (s.equalsIgnoreCase("Post published. View post")) {
        	
             Reporter.log("Motely Fool UK Article posted successfully");
           //Verifying if the post has appeared on website 
             try {
                 super.getUrl(read.readData("Browser&URL", 29, 2));
             } catch (Throwable e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 Assert.assertFalse(true);
             }

             title = read.readData("PostMessage", 1, 0);
         //    String titleAfter = read.readData("EditPost", 1, 0);
             String str = title;

             Boolean isPresent = driver.findElements(By.xpath("//h3[text()='" + str + "']")).size() > 0;
             String MP= "//h3[text()='" + str + "']";
             super.sync(MP);

             if (isPresent.equals(true)) {
                 WebElement ele = driver.findElement(By.xpath(MP));
                 super.highlightElement(ele);
                 Assert.assertEquals(title, title);
                 Reporter.log("Motely Fool UK Article post verified successfully");
             }else{
                 Reporter.log("Posted message is not seen");
                 Assert.assertFalse(true);
             }
             
             Thread.sleep(2000);
             driver.quit();
             
         } else {
             desider = false;
             Assert.assertFalse(true);
         }

     }

 }