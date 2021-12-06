package com.fool.us.IQScreener;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class IQScreenerFilter extends PageObjectModule {
	public Boolean desider = true;

    LoginToFool login = new LoginToFool();
    @Test(priority = 1)
    public void AssetClassfilter() throws Throwable {
      	super.browser();
    	super.getUrl(read.readData("Browser&URL", 32, 1));
    	super.clickButton(read.getObject("IQSmallcap"));
       	List<WebElement> links=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i1=links.iterator();
    	   while(i1.hasNext()){    	 
    	      WebElement ele1=i1.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("Small Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	  Reporter.log("Small Cap Filter Verification Failed");
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	         	    
    	   }    Reporter.log("Small Cap Filter Verified successfully"); 	   
 //   }
 //   @Test(priority = 2)
//    public void Largecapfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQSmallcap"));
    	Thread.sleep(500);
    	
    	super.clickButton(read.getObject("IQMidcap"));
       	List<WebElement> linkm=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i2=linkm.iterator();
    	   while(i2.hasNext()){    	 
    	      WebElement ele1=i2.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("Mid Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   }    Reporter.log("Mid Cap Filter Verified successfully");	   
 //   }
 //   @Test(priority = 3)
 //   public void InterNatfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLargecap"));
    	Thread.sleep(500);
    	
    	
    	super.clickButton(read.getObject("IQLargecap"));
       	List<WebElement> linkslc=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i3=linkslc.iterator();
    	   while(i2.hasNext()){    	 
    	      WebElement ele1=i3.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("Large Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   }    Reporter.log("Large Cap Filter Verified successfully");	   
 //   }
 //   @Test(priority = 3)
 //   public void InterNatfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLargecap"));
    	Thread.sleep(500);
    	super.clickButton(read.getObject("IQInterNat"));
       	List<WebElement> linksin=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i4=linksin.iterator();
    	   while(i3.hasNext()){    	 
    	      WebElement ele1=i4.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("International")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   } Reporter.log("International Cap Filter Verified successfully");   	   
  //  }
 //   @Test(priority = 4)
 //   public void LargeInterfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLargecap"));    	
       	List<WebElement> linksli=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i5=linksli.iterator();
    	   while(i4.hasNext()){    	 
    	      WebElement ele1=i5.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("International")||name.equals("Large Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   } Reporter.log("Large and International Cap Filter Verified successfully");   	   
 //   }
 //   @Test(priority = 5)
 //   public void SmallLargeInterfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQSmallcap"));    	
       	List<WebElement> linkssli=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i6=linkssli.iterator();
    	   while(i5.hasNext()){    	 
    	      WebElement ele1=i6.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("International")||name.equals("Small Cap")||name.equals("Large Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   } Reporter.log("Small, Large and International Cap Filter Verified successfully");   	   
 //   }
 //   @Test(priority = 6)
 //   public void SmallInterfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLargecap"));    	
       	List<WebElement> linkssi=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i7=linkssi.iterator();
    	   while(i6.hasNext()){    	 
    	      WebElement ele1=i7.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("International")||name.equals("Small Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   } Reporter.log("Small and International Cap Filter Verified successfully");   	   
  //  }
  //  @Test(priority = 7)
 //   public void SmallLargefilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLargecap")); 
    	Thread.sleep(500);
    	super.clickButton(read.getObject("IQInterNat"));
       	List<WebElement> linkssl=driver.findElements(By.xpath(read.getObject("IQtable")));
    	Iterator<WebElement> i8=linkssl.iterator();
    	   while(i7.hasNext()){    	 
    	      WebElement ele1=i8.next();    	 
    	      String name=ele1.getText();	
    	      if((name.equals("Large Cap")||name.equals("Small Cap")||name.equals(""))){      	
    	    	 
    	      }else{
    	    	 	Assert.assertTrue(false, "no match");    	        
    	       }     	      
    	   } Reporter.log("Small and International Cap Filter Verified successfully");
    	   super.clickButton(read.getObject("IQSmallcap"));
    	   super.clickButton(read.getObject("IQLargecap"));
    }
    @Test(priority = 2)
    public void AddSectorfilter() throws Throwable { 
  	super.clickButton(read.getObject("IQServ"));
    List<WebElement> linkser=driver.findElements(By.xpath(read.getObject("IQtablesec")));
  	Iterator<WebElement> i1=linkser.iterator();
  	   while(i1.hasNext()){    	 
  	      WebElement ele1=i1.next();    	 
  	      String name=ele1.getText();	
  	      if((name.equals("Services")||name.equals(""))){      	
  	    	 
  	      }else{
  	    	 	Assert.assertTrue(false, "no match");    	        
  	       }     	      
  	   }    Reporter.log("Services Filter Verified successfully");	   
  	 super.clickButton(read.getObject("IQCons"));
     List<WebElement> linkcons=driver.findElements(By.xpath(read.getObject("IQtablesec")));
   	 Iterator<WebElement> i2=linkcons.iterator();
   	   while(i2.hasNext()){    	 
   	      WebElement ele1=i2.next();    	 
   	      String name=ele1.getText();	
   	      if((name.equals("Services")||name.equals("Consumer")||name.equals(""))){      	
   	    	 
   	      }else{
   	    	 	Assert.assertTrue(false, "no match");    	        
   	       }     	      
   	   }    Reporter.log("Consumer Filter Verified successfully");	   
   	 super.clickButton(read.getObject("IQFin"));
     List<WebElement> linkfin=driver.findElements(By.xpath(read.getObject("IQtablesec")));
   	 Iterator<WebElement> i3=linkfin.iterator();
   	   while(i3.hasNext()){    	 
   	      WebElement ele1=i3.next();    	 
   	      String name=ele1.getText();	
   	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals(""))){      	
   	    	 
   	      }else{
   	    	 	Assert.assertTrue(false, "no match");    	        
   	       }     	      
   	   }    Reporter.log("Financial Filter Verified successfully");
   	super.clickButton(read.getObject("IQEgy"));
    List<WebElement> linkegy=driver.findElements(By.xpath(read.getObject("IQtablesec")));
  	 Iterator<WebElement> i4=linkegy.iterator();
  	   while(i4.hasNext()){    	 
  	      WebElement ele1=i4.next();    	 
  	      String name=ele1.getText();	
  	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals(""))){      	
  	    	 
  	      }else{
  	    	 	Assert.assertTrue(false, "no match");    	        
  	       }     	      
  	   }    Reporter.log("Energy Filter Verified successfully");
  	 super.clickButton(read.getObject("IQHlt"));
     List<WebElement> linkhlt=driver.findElements(By.xpath(read.getObject("IQtablesec")));
   	 Iterator<WebElement> i5=linkhlt.iterator();
   	   while(i5.hasNext()){    	 
   	      WebElement ele1=i5.next();    	 
   	      String name=ele1.getText();	
   	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals(""))){      	
   	    	 
   	      }else{
   	    	 	Assert.assertTrue(false, "no match");    	        
   	       }     	      
   	   }    Reporter.log("Health Filter Verified successfully");
   	super.clickButton(read.getObject("IQIdg"));
    List<WebElement> linkidg=driver.findElements(By.xpath(read.getObject("IQtablesec")));
  	 Iterator<WebElement> i10=linkidg.iterator();
  	   while(i10.hasNext()){    	 
  	      WebElement ele1=i10.next();    	 
  	      String name=ele1.getText();	
  	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals(""))){      	
  	    	 
  	      }else{
  	    	 	Assert.assertTrue(false, "no match");    	        
  	       }     	      
  	   }    Reporter.log("Industrial Goods Filter Verified successfully"); 
   	super.clickButton(read.getObject("IQTec"));
    List<WebElement> linktec=driver.findElements(By.xpath(read.getObject("IQtablesec")));
  	 Iterator<WebElement> i6=linktec.iterator();
  	   while(i6.hasNext()){    	 
  	      WebElement ele1=i6.next();    	 
  	      String name=ele1.getText();	
  	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals(""))){      	
  	    	 
  	      }else{
  	    	 	Assert.assertTrue(false, "no match");    	        
  	       }     	      
  	   }    Reporter.log("Technology Filter Verified successfully");
  	 super.clickButton(read.getObject("IQBam"));
     List<WebElement> linkbam=driver.findElements(By.xpath(read.getObject("IQtablesec")));
   	 Iterator<WebElement> i9=linkbam.iterator();
   	   while(i9.hasNext()){    	 
   	      WebElement ele1=i9.next();    	 
   	      String name=ele1.getText();	
   	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals("Basic Materials")||name.equals(""))){      	
   	    	 
   	      }else{
   	    	 	Assert.assertTrue(false, "no match");    	        
   	       }     	      
   	   }    Reporter.log("Basic Materials Filter Verified successfully");
  	 super.clickButton(read.getObject("IQCom"));
     List<WebElement> linkcom=driver.findElements(By.xpath(read.getObject("IQtablesec")));
   	 Iterator<WebElement> i7=linkcom.iterator();
   	   while(i7.hasNext()){    	 
   	      WebElement ele1=i7.next();    	 
   	      String name=ele1.getText();	
   	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals("Basic Materials")||name.equals("Communications")||name.equals(""))){      	
   	    	 
   	      }else{
   	    	 	Assert.assertTrue(false, "no match");    	        
   	       }     	      
   	   }    Reporter.log("Communications Filter Verified successfully");
   	super.clickButton(read.getObject("IQUtl"));
    List<WebElement> linkutl=driver.findElements(By.xpath(read.getObject("IQtablesec")));
  	 Iterator<WebElement> i8=linkutl.iterator();
  	   while(i8.hasNext()){    	 
  	      WebElement ele1=i8.next();    	 
  	      String name=ele1.getText();	
  	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals("Basic Materials")||name.equals("Communications")||name.equals("Utilities")||name.equals(""))){      	
  	    	 
  	      }else{
  	    	 	Assert.assertTrue(false, "no match");    	        
  	       }     	      
  	   }    Reporter.log("Utilities Filter Verified successfully"); 	 
  	 
   }
    @Test(priority = 3)
    public void RemoveSectorfilter() throws Throwable { 	
    	 super.clickButton(read.getObject("IQUtl"));
         List<WebElement> linkutl=driver.findElements(By.xpath(read.getObject("IQtablesec")));
       	 Iterator<WebElement> i8=linkutl.iterator();
       	   while(i8.hasNext()){    	 
       	      WebElement ele1=i8.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals("Basic Materials")||name.equals("Communications")||name.equals(""))){     	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Utilities Filter Removed successfully"); 
       	super.clickButton(read.getObject("IQCom"));
        List<WebElement> linkcom=driver.findElements(By.xpath(read.getObject("IQtablesec")));
      	 Iterator<WebElement> i7=linkcom.iterator();
      	   while(i7.hasNext()){    	 
      	      WebElement ele1=i7.next();    	 
      	      String name=ele1.getText();	
      	    if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals("Basic Materials")||name.equals(""))){     	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Communications Filter Removed successfully");
      	 super.clickButton(read.getObject("IQBam"));
         List<WebElement> linkbam=driver.findElements(By.xpath(read.getObject("IQtablesec")));
       	 Iterator<WebElement> i9=linkbam.iterator();
       	   while(i9.hasNext()){    	 
       	      WebElement ele1=i9.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals("Technology")||name.equals(""))){      	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Basic Materials Filter Removed successfully");
      	 super.clickButton(read.getObject("IQTec"));
         List<WebElement> linktec=driver.findElements(By.xpath(read.getObject("IQtablesec")));
       	 Iterator<WebElement> i6=linktec.iterator();
       	   while(i6.hasNext()){    	 
       	      WebElement ele1=i6.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Industrial Goods")||name.equals(""))){        	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Technology Filter Removed successfully");
       	super.clickButton(read.getObject("IQIdg"));
        List<WebElement> linkidg=driver.findElements(By.xpath(read.getObject("IQtablesec")));
      	 Iterator<WebElement> i10=linkidg.iterator();
      	   while(i10.hasNext()){    	 
      	      WebElement ele1=i10.next();    	 
      	      String name=ele1.getText();	
      	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals(""))){      	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Industrial Goods Filter Removed successfully");
       	super.clickButton(read.getObject("IQHlt"));
        List<WebElement> linkhlt=driver.findElements(By.xpath(read.getObject("IQtablesec")));
      	 Iterator<WebElement> i5=linkhlt.iterator();
      	   while(i5.hasNext()){    	 
      	      WebElement ele1=i5.next();    	 
      	      String name=ele1.getText();	
      	    if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals("Energy")||name.equals(""))){    	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Health Filter Removed successfully");
      	 super.clickButton(read.getObject("IQEgy"));
         List<WebElement> linkegy=driver.findElements(By.xpath(read.getObject("IQtablesec")));
       	 Iterator<WebElement> i4=linkegy.iterator();
       	   while(i4.hasNext()){    	 
       	      WebElement ele1=i4.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Services")||name.equals("Consumer")||name.equals("Financial")||name.equals(""))){      	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Energy Filter Removed successfully");
       	super.clickButton(read.getObject("IQFin"));
        List<WebElement> linkfin=driver.findElements(By.xpath(read.getObject("IQtablesec")));
      	 Iterator<WebElement> i3=linkfin.iterator();
      	   while(i3.hasNext()){    	 
      	      WebElement ele1=i3.next();    	 
      	      String name=ele1.getText();	
      	      if((name.equals("Services")||name.equals("Consumer")||name.equals(""))){      	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Financial Filter Removed successfully");
      	 super.clickButton(read.getObject("IQCons"));
         List<WebElement> linkcons=driver.findElements(By.xpath(read.getObject("IQtablesec")));
       	 Iterator<WebElement> i2=linkcons.iterator();
       	   while(i2.hasNext()){    	 
       	      WebElement ele1=i2.next();    	 
       	      String name=ele1.getText();	
       	      if((name.equals("Services")||name.equals(""))){      	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Consumer Filter Removed successfully");
       	super.clickButton(read.getObject("IQServ"));
        List<WebElement> linkser=driver.findElements(By.xpath(read.getObject("IQtablesec")));
      	Iterator<WebElement> i1=linkser.iterator();
      	   while(i1.hasNext()){    	 
      	      WebElement ele1=i1.next();    	 
      	      String name=ele1.getText();	
      	      if((name.equals("Services")||name.equals("Consumer")||name.equals("Industrial Goods")||name.equals("Financial")||name.equals("Energy")||name.equals("Health")||name.equals("Communications")||name.equals("Utilities")||name.equals("Technology")||name.equals("Basic Materials")||name.equals(""))){      	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Services Filter Removed successfully");
    }
    @Test(priority = 4)
    public void Volatilityfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQLow"));
        List<WebElement> linklow=driver.findElements(By.xpath(read.getObject("IQtablevol")));
      	 Iterator<WebElement> i1=linklow.iterator();
      	   while(i1.hasNext()){    	 
      	      WebElement ele1=i1.next();    	 
      	      String name=ele1.getText();	
      	   if((name.equals("Low")||name.equals(""))){     	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Volatility Low Filter Verified successfully");
      	 super.clickButton(read.getObject("IQLow"));
      	 super.clickButton(read.getObject("IQAvg"));
         List<WebElement> linkavg=driver.findElements(By.xpath(read.getObject("IQtablevol")));
       	 Iterator<WebElement> i2=linkavg.iterator();
       	   while(i2.hasNext()){    	 
       	      WebElement ele1=i2.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Average")||name.equals(""))){     	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Volatility Average Filter Verified successfully"); 
       	super.clickButton(read.getObject("IQAvg"));
     	 super.clickButton(read.getObject("IQHgh"));
        List<WebElement> linkhgh=driver.findElements(By.xpath(read.getObject("IQtablevol")));
      	 Iterator<WebElement> i3=linkhgh.iterator();
      	   while(i3.hasNext()){    	 
      	      WebElement ele1=i3.next();    	 
      	      String name=ele1.getText();	
      	   if((name.equals("High")||name.equals(""))){     	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Volatility High Filter Verified successfully");
      	 super.clickButton(read.getObject("IQLow"));
         List<WebElement> linklowhgh=driver.findElements(By.xpath(read.getObject("IQtablevol")));
       	 Iterator<WebElement> i4=linklowhgh.iterator();
       	   while(i4.hasNext()){    	 
       	      WebElement ele1=i4.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("High")||name.equals("Low")||name.equals(""))){     	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Volatility Low, High Filter Verified successfully");
       	super.clickButton(read.getObject("IQLow"));
       	super.clickButton(read.getObject("IQAvg"));
        List<WebElement> linkavghgh=driver.findElements(By.xpath(read.getObject("IQtablevol")));
      	 Iterator<WebElement> i5=linkavghgh.iterator();
      	   while(i5.hasNext()){    	 
      	      WebElement ele1=i5.next();    	 
      	      String name=ele1.getText();	
      	   if((name.equals("High")||name.equals("Average")||name.equals(""))){     	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Volatility Average, High Filter Verified successfully"); 
      	 super.clickButton(read.getObject("IQHgh"));
      	super.clickButton(read.getObject("IQLow"));
         List<WebElement> linklowavg=driver.findElements(By.xpath(read.getObject("IQtablevol")));
       	 Iterator<WebElement> i6=linklowavg.iterator();
       	   while(i6.hasNext()){    	 
       	      WebElement ele1=i6.next();    	 
       	      String name=ele1.getText();	
       	   if((name.equals("Low")||name.equals("Average")||name.equals(""))){     	
       	    	 
       	      }else{
       	    	 	Assert.assertTrue(false, "no match");    	        
       	       }     	      
       	   }    Reporter.log("Volatility Low, Average Filter Verified successfully"); 
       	super.clickButton(read.getObject("IQHgh"));
        List<WebElement> linklowavghgh=driver.findElements(By.xpath(read.getObject("IQtablevol")));
      	 Iterator<WebElement> i7=linklowavghgh.iterator();
      	   while(i7.hasNext()){    	 
      	      WebElement ele1=i7.next();    	 
      	      String name=ele1.getText();	
      	   if((name.equals("High")||name.equals("Average")||name.equals("Low")||name.equals(""))){     	
      	    	 
      	      }else{
      	    	 	Assert.assertTrue(false, "no match");    	        
      	       }     	      
      	   }    Reporter.log("Volatility Low, Average, High Filter Verified successfully");
      	   super.clickButton(read.getObject("IQLow"));
      	   super.clickButton(read.getObject("IQAvg"));
      	   super.clickButton(read.getObject("IQHgh"));
    }
    @Test(priority = 5)
    public void Convicthighfilter() throws Throwable { 
    	super.clickButton(read.getObject("IQHghoy"));
    	Thread.sleep(1500);
    	super.clickButton(read.getObject("IQLargecap"));
    	super.clickButton(read.getObject("IQTec"));
    	super.clickButton(read.getObject("IQLow"));
    	List<WebElement> linkconvhi=driver.findElements(By.xpath(read.getObject("IQtabletick")));
     	 Iterator<WebElement> i1=linkconvhi.iterator();
     	   while(i1.hasNext()){    	 
     	      WebElement ele1=i1.next();    	 
     	      String name=ele1.getText();	
     	   if((name.equals("FB")||name.equals("GOOGL")||name.equals("MSFT")||name.equals(""))){     	
     	    	 
     	      }else{
     	    	 	Assert.assertTrue(false, "no match");    	        
     	       }     	      
     	   }    Reporter.log("High only with combination Filter Verified successfully");
     	  
     	  driver.quit();/*
    }    
    @Test(priority = 6)
    public void Convictposfilter() throws Throwable { 
    	super.browser();
    	super.getUrl(read.readData("Browser&URL", 32, 1));
     	   super.clickButton(read.getObject("IQPosoy"));
     	  Thread.sleep(1500);
     	 List<WebElement> linkconvpo=driver.findElements(By.xpath(read.getObject("IQtabletick")));
     	 Iterator<WebElement> i2=linkconvpo.iterator();
     	   while(i2.hasNext()){    	 
     	      WebElement ele1=i2.next();    	 
     	      String name=ele1.getText();	
     	   if((name.equals("SWKS")||name.equals("LNKD")||name.equals("ROP")||name.equals("Vi")||name.equals("EBAY")||name.equals("IBM")||name.equals(""))){     	
     	    	 
     	      }else{
     	    	 	Assert.assertTrue(false, "no match");    	        
     	       }     	      
     	   }    Reporter.log("Positive only with combination Filter Verified successfully");*/
     	 driver.quit();	  
    }  
}
