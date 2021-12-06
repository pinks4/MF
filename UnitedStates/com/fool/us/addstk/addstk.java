package com.fool.us.addstk;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class addstk extends PageObjectModule {
	LoginToFool login = new LoginToFool();
	@Test(priority = 1)
	public void Addstock() throws Throwable {
		login.loginUSAct();
		try { 
		 super.clickButton(read.getObject("MF1SC")); 
		 super.sync(read.getObject("MF1SCSTK"));
		 super.clickButton(read.getObject("MF1SCSTK"));
		 for (int idx = 1; idx <= 5; ++idx){
		 super.clickButton(read.getObject("STKADD1"));
		 WebElement dpdw=driver.findElement(By.xpath(read.getObject("TYPDPDN")));
		 Select typ=new Select(dpdw);
	     Thread.sleep(2000);
	     typ.selectByVisibleText("Buy");
		 super.enterText(read.getObject("STKQTY"), "10");
		 String stknme =read.readData("Stocks", idx, 0);
		 super.enterText(read.getObject("STKNME"),stknme);
		 super.clickButton(read.getObject("STKCMN"));
		 Thread.sleep(5000);
		 super.clickButton(read.getObject("STKWLT"));
		 Reporter.log(stknme + " Added Successfully");
		 }
		}
		 catch (Throwable e) {
             // TODO Auto-generated catch block
         	driver.navigate().back();
             e.printStackTrace();
             Assert.assertFalse(true);
         }
		driver.quit();
	}
	
}
