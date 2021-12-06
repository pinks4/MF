package com.fool.au.cardverification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;


public class cardverification extends PageObjectModule {

@Test
public void Successcases() throws Throwable {
	super.browser();
	try {
        String teur = read.readData("ECap", 21, 0);
        super.getUrl(teur);
    } catch (Throwable e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        Assert.assertFalse(true);
    }
	 try {
		 String emailid = read.readData("CCtestdata", 1, 5);
		 String eid = read.getObject("Cardemail");
     	 super.sync(eid);
     	super.enterText(eid,emailid );
 		
        } catch (Throwable e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         Assert.assertFalse(true);
     }
	 try {
		 String cnfemailid = read.readData("CCtestdata", 1, 5);
		 String eid = read.getObject("Cardcnfemail");
     	 super.sync(eid);
     	super.enterText(eid,cnfemailid );
 		
        } catch (Throwable e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         Assert.assertFalse(true);
     }
	 try {
		 String ccno = read.readData("CCtestdata", 1, 0);
		 String ccn = read.getObject("CreditCardno");
     	 super.sync(ccn);
     	super.enterText(ccn,ccno);
     	WebElement mn=driver.findElement(By.xpath(".//*[@id='expires-month']"));
        Select m=new Select(mn);
        Thread.sleep(2000);
        m.selectByValue("12");
     	WebElement ey=driver.findElement(By.xpath(".//*[@id='expires-year']"));
        Select y=new Select(ey);
        Thread.sleep(2000);
        y.selectByValue("2015");
 		
        } catch (Throwable e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         Assert.assertFalse(true);
     }
	 try {
		 String usrnme = read.readData("CCtestdata", 1, 6);
		 String UsrName = read.getObject("Cardholdername");
     	 super.sync(UsrName);
     	super.enterText(UsrName,usrnme );
 		
        } catch (Throwable e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         Assert.assertFalse(true);
     }
	 try {
		 String usrnme = "123456";
		 String UsrName = read.getObject("auzipcode");
     	 super.sync(UsrName);
     	super.enterText(UsrName,usrnme );
     	Thread.sleep(8000);
        super.clickButton(read.getObject("Btn_Continue"));
        } catch (Throwable e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         Assert.assertFalse(true);
     }
}
public void Softfailcases() throws Throwable {


}
public void Hardfailcases() throws Throwable {


}
}
