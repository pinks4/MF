package com.fool.GR.ecap;
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
            String teur = read.readData("ECap", 46, 0);
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
        String postmsg = "//input[@id='ecap-submit']";
        super.sync(postmsg);
        super.clickButton(read.getObject("button_Ecapsub1"));
        Thread.sleep(10000);
        List<WebElement> element = driver.findElements(By.xpath("//h2[text()='Danke']"));
        if (element.size() > 0) {
        	Reporter.log("Motley Fool Germany Home Ecap Test Passed");
      } else {
            Reporter.log("Motley Fool Germany Home Ecap Test Failed");
            Assert.assertFalse(true);
        }
        driver.quit();  
	}
}
