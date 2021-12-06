package com.fool.au.deletepost;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;

public class DeletePost extends LoginToFool {
    @Test
    public void deleteCreatedPost() throws Throwable {
    	try {          
        //    super.getUrl(read.readData("Browser&URL", 27, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        try {
            title = read.readData("PostMessage", 1, 0);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String titleAfter = read.readData("EditPost", 1, 0);
        String deleMsg = "//a[text()='" + titleAfter + "']";
        super.sync(deleMsg);
        List<WebElement> ele = driver.findElements(By.xpath(deleMsg));
        if (ele.size() > 0) {
            driver.findElement(By.xpath(deleMsg)).click();
            super.clickButton(read.getObject("Link_Trash"));
            String viewLink=read.getObject("postmsg");
            super.sync(viewLink);
            String s = driver.findElement(By.xpath(viewLink)).getText().trim();
            if (s.equalsIgnoreCase("1 post moved to the Trash. Undo")) {         
            	Reporter.log("Motely Fool Australia Article is Deleted successfully");
            }
        } else {
            Reporter.log("Expected Element " + titleAfter + " not found to trash");
            Assert.assertFalse(true);
        }

        try {
            super.getUrl(read.readData("Browser&URL", 1, 2));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

        title = read.readData("PostMessage", 1, 0);
        String titleAfter1 = read.readData("EditPost", 1, 0);
        String str = titleAfter1;
        String str1 = title;
        List<WebElement> ele2 = driver.findElements(By.xpath("//a[text()='" + str + "']"));
        List<WebElement> ele1 = driver.findElements(By.xpath("//a[text()='" + str1 + "']"));
        if (ele2.size() > 0 || ele1.size() > 0) {
            Reporter.log("Message is not deleted Properly");
            Assert.assertFalse(true);
        } else {
            Reporter.log("Motely Fool Australia Article Deletion Verified successfully");
        }
        driver.quit();

    }
}
