package com.fool.au.shareadvisor;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

//This is Austrlian Share Advisor Ecap Test
public class Shareadvisornew extends PageObjectModule {
    public Boolean desider = true;
    LoginToFool login = new LoginToFool();	

	@Test(priority = 1)
    public void AUShareadvisorHome() throws Throwable {
		   login.loginPreau();
		   try {  
		   String SAH= driver.getTitle();
			if (SAH.contains("Motley Fool Share Advisor")) {
				Reporter.log(SAH + " Page Title Verified");
			} else {
				Reporter.log(SAH + " Verification Failed");
				Assert.assertFalse(true);
			}
		   }
			catch (Throwable e) {
           	 // TODO Auto-generated catch block
           	 e.printStackTrace();
           	 Assert.assertFalse(true);
            }
	}
	@Test(priority = 2)
    public void AUShareadvisorREC() throws Throwable {
		try {
			super.getUrl(read.readData("Browser&URL", 19, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Recommendations")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }

	}
	@Test(priority = 3)
    public void AUShareadvisorUPD() throws Throwable {
		try {
		super.clickButton(read.getObject("Link_UpdateSAU"));
		super.clickButton(read.getObject("Link_UpdateSAU"));
		   String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » All Share Advisor Coverage")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " 1Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
       	 // TODO Auto-generated catch block
       	 e.printStackTrace();
       	 Assert.assertFalse(true);
        }
		try {
			super.getUrl(read.readData("Browser&URL", 5, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Share Advisor Updates")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 10, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Best Buys Now")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 11, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Stocks On Our Radar")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 12, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Multi-media")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 13, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Income Extra")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 14, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » 10% Promise")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 15, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » How To Invest Foolishly")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }try {
		super.getUrl(read.readData("Browser&URL", 16, 1));
		String SAU= driver.getTitle();
		if (SAU.contains("Motley Fool Share Advisor » New Member Centre")) {
			Reporter.log(SAU + " Page Title Verified");
		} else {
			Reporter.log(SAU + " Verification Failed");
			Assert.assertFalse(true);
		}
	}
	catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		Assert.assertFalse(true);
}try {
	super.getUrl(read.readData("Browser&URL", 17, 1));
	String SAU= driver.getTitle();
	if (SAU.contains("Motley Fool Share Advisor » Frequently Asked Questions")) {
		Reporter.log(SAU + " Page Title Verified");
	} else {
		Reporter.log(SAU + " Verification Failed");
		Assert.assertFalse(true);
	}
}
catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	Assert.assertFalse(true);
}


	}
	@Test(priority = 4)
    public void AUShareadvisorSCR() throws Throwable {
		try {
			super.getUrl(read.readData("Browser&URL", 20, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Share Advisor Scorecard")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }

	}
	@Test(priority = 5)
    public void AUShareadvisorFRM() throws Throwable {
		try {
			super.getUrl(read.readData("Browser&URL", 22, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Forums")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }

		try {
			super.getUrl(read.readData("Browser&URL", 23, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Forum: General Investing")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 24, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Forum: Foolish Banter!")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
			super.getUrl(read.readData("Browser&URL", 25, 1));
			String SAU= driver.getTitle();
			if (SAU.contains("Motley Fool Share Advisor » Forum: Account / Site Help")) {
				Reporter.log(SAU + " Page Title Verified");
			} else {
				Reporter.log(SAU + " Verification Failed");
				Assert.assertFalse(true);
			}
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertFalse(true);
    }
		try {
		super.getUrl(read.readData("Browser&URL", 18, 1));
		String SAU= driver.getTitle();
		if (SAU.contains("Manage Account | Motley Fool Australia")) {
			Reporter.log(SAU + " Page Title Verified");
		} else {
			Reporter.log(SAU + " Verification Failed");
			Assert.assertFalse(true);
		}
	}
	catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		Assert.assertFalse(true);
	} 	driver.quit(); 
	}
	}
		

  
    

