package com.fool.ca.tagsverification;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class Tagsverification extends PageObjectModule {

@Test(priority = 1)
	    public void tagsverifyCa() throws Throwable {
		super.browser();
		try {
     	super.getUrl(read.readData("ECap", 7, 0));
     	String postmsg = read.getObject("tag1");
     	String ta1 = driver.findElement(By.xpath(postmsg)).getText().trim();
     	 if (ta1.equalsIgnoreCase("fool:tickers")) {
     	//List<WebElement> span = driver.findElements(By.xpath("//span[720]/span"));
		//if (span.size() > 0) {
			Reporter.log("Tag " +ta1 +" Verified");
		} else {
			Reporter.log(" Verification Failed");
			Assert.assertFalse(true);
		}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
		}
		try {
	     	String postmsg = read.getObject("tag2");
	     	String ta2 = driver.findElement(By.xpath(postmsg)).getText();
	     	if (ta2.equalsIgnoreCase("item")) {
	     //  	List<WebElement> span = driver.findElements(By.xpath("//span[722]/span"));
		//	if (span.size() > 0) {
				Reporter.log("Tag " +ta2 +" Verified");
			} else {
				Reporter.log(" Verification Failed");
				Assert.assertFalse(true);
			}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertFalse(true);
			}
		
		try {
	     	String postmsg = read.getObject("tag3");
	     	String ta3 = driver.findElement(By.xpath(postmsg)).getText();
	     	if (ta3.equalsIgnoreCase("channel")) {
	     	//	List<WebElement> span = driver.findElements(By.xpath("//span[724]/span"));
			//if (span.size() > 0) {
				Reporter.log("Tag " +ta3 +" Verified");
			} else {
				Reporter.log(" Verification Failed");
				Assert.assertFalse(true);
			}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertFalse(true);
			}
		try {
	     	String postmsg = read.getObject("tag4");
	     	String ta4 = driver.findElement(By.xpath(postmsg)).getText();
	     	if (ta4.equalsIgnoreCase("rss")) {
	  //   	List<WebElement> span = driver.findElements(By.xpath("//span[726]/span"));
		//	if (span.size() > 0) {
				Reporter.log("Tag " +ta4 +" Verified");
			} else {
				Reporter.log(" Verification Failed");
				Assert.assertFalse(true);
			}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertFalse(true);
			}
		try {
			List<WebElement> mersourc = driver.findElements(By.xpath("//a[contains(@href, 'merlinsource')]"));
            if (mersourc.size() > 0) {
              Reporter.log("merlinsource Found");                           
            } else {
            Reporter.log("merlinsource NOT Found");
            Assert.assertFalse(true);
            }			
            } catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertFalse(true);
			}
		try {
			List<WebElement> gasou = driver.findElements(By.xpath("//a[contains(@href, 'gasource')]"));
            if (gasou.size() > 0) {
              Reporter.log("gasource Found");                           
            } else {
            	Reporter.log("gasource NOT Found");
            Assert.assertFalse(true);
            }			
            } catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertFalse(true);
			}
}
}
