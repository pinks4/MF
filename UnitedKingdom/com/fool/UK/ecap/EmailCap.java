package com.fool.UK.ecap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.fool.pageobject.PageObjectModule;
public class EmailCap extends PageObjectModule {
	@Test(priority = 1)
	 public void emailCapGRHomepage() throws Throwable {
        super.browser();
        try {
            String teur = read.readData("ECap", 50, 0);
            super.getUrl(teur);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            String xpath = read.readData("ECap", 47, 1);
            super.enterText(read.getObject("Edit_emailecap1"), xpath);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        String postmsg = "//form[@id='ecap-3']/input[14]";
        super.sync(postmsg);
        super.clickButton(read.getObject("button_Ecapsub4"));
        Thread.sleep(3000);
        List<WebElement> element = driver.findElements(By.xpath("//aside/div/h2[contains(text(),'Thanks')]"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool United Kingdom Home Ecap Test Passed");
      } else {
            Reporter.log("Motley Fool Germany Home Ecap Test Failed");
            Assert.assertFalse(true);
        }
        driver.quit();  
	}
}
