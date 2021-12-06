package com.fool.sg.ecap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.pageobject.PageObjectModule;

public class EmailCap extends PageObjectModule {
	@Test(priority = 1)
    public void emailCapSGHome() throws Throwable {

        super.browser();
        try {
            String teur = read.readData("ECap", 34, 0);
            super.getUrl(teur);
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
        String postmsg = "//form[@id='ecap-2']/input[14]";
        super.sync(postmsg);
        super.clickButton(read.getObject("button_Ecapsub3"));
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
        
	}
         
    
}