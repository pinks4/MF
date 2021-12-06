package com.fool.au.createpost;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;

public class CreatePost extends LoginToFool {

    public Boolean desider = true;

    @Test
    public void messagePost() throws Throwable {

        String DB=read.getObject("Dashboard");
        try {
            super.sync(DB);
            super.getUrl(read.readData("Browser&URL", 26, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

       try {
            super.enterText(read.getObject("Edit_Title"), read.readData("PostMessage", 1, 0));
          
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            super.clickButton(read.getObject("Button_Text"));
        } catch (Throwable e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
          
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
        	WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(read.getObject("Link_Image"))));
        	
        	super.clickButton(read.getObject("Link_Image"));
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
   System.out.println(1);
        	String BIP= read.getObject("Button_InsertToPost");
        	super.sync(BIP);
        	super.clickButton(BIP);
        } catch (Throwable e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
        	System.out.println(2);
            super.clickButton(read.getObject("Button_Visual"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        System.out.println(3);
        String BP= read.getObject("Button_Publish");
        super.sync(BP);
        super.clickButton(BP);

        String postmsg = read.getObject("postmsg1");
        System.out.println();
        super.sync(postmsg);
        String s = driver.findElement(By.xpath(postmsg)).getText().trim();
        if (s.equalsIgnoreCase("Post published. View post")) {
     
            Reporter.log("Motely Fool Australia Article posted successfully");
            System.out.println(4);
          //Verifying if the post has appeared on website 
            try {
                super.getUrl(read.readData("Browser&URL", 1, 2));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }

            title = read.readData("PostMessage", 1, 0);
     //       String titleAfter = read.readData("EditPost", 1, 0);
            String str = title;
            System.out.println(str);
            Boolean isPresent = driver.findElements(By.xpath("//a[text()='" + str + "']")).size() > 0;

            String MP= "//a[text()='" + str + "']";
            super.sync(MP);
            if (isPresent.equals(true)) {
                WebElement ele = driver.findElement(By.xpath(MP));
                super.highlightElement(ele);
                Assert.assertEquals(title, title);
                Reporter.log("Motely Fool Australia Article post verified successfully");
            }else{
                Reporter.log("Posted message is not seen");
                Assert.assertFalse(true);
            }
            driver.quit();
            
        } else {
            desider = false;
            Assert.assertFalse(true);
        }

    }

}
