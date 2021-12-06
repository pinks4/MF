package com.fool.au.editpost;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;

public class EditPost extends LoginToFool {
    public Boolean desider = true;

    @Test
    public void editingPost() throws Throwable {       
    	try {          
       //     super.getUrl(read.readData("Browser&URL", 27, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
        //	super.clickButton(read.getObject("Menu_AU"));
        	super.clickButton(read.getObject("Art_edit"));
            title = read.readData("PostMessage", 1, 0);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
     
        String editMsg="//a[text()='" + title + "']";
        super.sync(editMsg);
        System.out.println(title);
        List<WebElement> list = driver.findElements(By.xpath(editMsg));
        if (list.size() > 0) {
            driver.findElement(By.xpath(editMsg)).click();
        } else {
            Reporter.log("Element which is to be edited not found");
            Assert.assertFalse(true);
        }
        String clrpost = read.getObject("Clrpost");
        driver.findElement(By.xpath(clrpost)).clear();

        super.enterText(read.getObject("Edit_Title"), read.readData("EditPost", 1, 0));

        try {
            super.clickButton(read.getObject("Button_Text"));
        } catch (Throwable e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
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
            super.clickButton(Ml);
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	super.sync(read.getObject("Link_Image2"));
            super.clickButton(read.getObject("Link_Image2"));
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

        super.clickButton(read.getObject("Button_Visual"));
        String BP= read.getObject("Button_Publish");
        super.sync(BP);
        super.clickButton(BP);

        String postmsg = read.getObject("postmsg1");
        super.sync(postmsg);
        String s = driver.findElement(By.xpath(postmsg)).getText().trim();
        if (s.equalsIgnoreCase("Post updated. View post")) {

            Reporter.log("Motely Fool Australia Article is Edited successfully");
            try {
                super.getUrl(read.readData("Browser&URL", 1, 2));
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
                WebElement ele = driver.findElement(By.xpath(MP));
                super.highlightElement(ele);
                Assert.assertEquals(title, title);
                Reporter.log("Motely Fool Australia Article Edit Verified successfully");
                driver.quit();
            } else {
                Reporter.log("Edited post is not found");
                Assert.assertFalse(true);
            }  
            
        } else {
            desider = false;
            Assert.assertFalse(true);
        }

    }
}
