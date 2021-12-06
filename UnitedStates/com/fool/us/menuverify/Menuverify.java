package com.fool.us.menuverify;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class Menuverify extends PageObjectModule {
	@Test(priority = 1)
    public void MenuVerify() throws Throwable {
        super.browser();
        try {
            String MF1 = read.readData("ECap", 34, 0);
            super.getUrl(MF1);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {

            String xpath = read.readData("ECap", 4, 1);
            super.enterText(read.getObject("Edit_emailecap1"), xpath);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        String postmsg = "//input[@id='ecap-submit']";
        super.sync(postmsg);
        super.clickButton(read.getObject("button_Ecapsub1"));
       // Thread.sleep(3000);
        String THK= "//h2[text()='Thanks!']";
        super.sync(THK);
            List<WebElement> element = driver.findElements(By.xpath("//h2[text()='Thanks!']"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool Singapore Home Ecap Test Passed");
            Thread.sleep(1000);
            driver.quit();
        } else {
            Reporter.log("Motley Fool Singapore Home Ecap Test Failed");
            Assert.assertFalse(true);
        }
        driver.quit(); 
	}
         
    
}
