package com.fool.us.evlstks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fool.login.LoginToFool;
import com.fool.pageobject.PageObjectModule;

public class Dateverify extends PageObjectModule{
	Date date;
	 LoginToFool login = new LoginToFool();
	@Test(priority=1)
	public void Everlasting_verify() throws Throwable{		
		 login.loginUSAct();
		 Thread.sleep(5000);
		 super.getUrl(read.readData("Browser&URL", 33, 1));
		  
		  Thread.sleep(20000);

		  String str1=driver.findElement(By.xpath(read.getObject("Ever_LtDate"))).getText();

		  //String str2=str1.substring(0, 16);
		  //System.out.println(str2);
		  

		  SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		  String dateInString = str1; 
		   
		  try{
		   
		   date = formatter.parse(dateInString);
		   System.out.println("Everlasting Dates:");
		  System.out.println("Report Date: "+date);
		 // System.out.println(formatter.format(date));  
		   
		  }catch(Throwable e){
			  System.out.println("cought parse exception");
		  //e.printStackTrace();
		  }
		  
		  Date dt = new Date();
		  System.out.println("Todays Date: "+dt.toString());
		  Date startDate = date;// Set start date
		    Date endDate  = dt; // Set end date

		    long duration  = endDate.getTime() - startDate.getTime();

		   
		    long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		  //System.out.println(duration+" "+diffInHours);
		  int days=(int) (diffInHours/24);
		  System.out.println("Everlasting Days Difference: "+days);
		  System.out.println(" ");
		  if(days>=8){
			//  driver.close();
			  Reporter.log("Latest date failed for Everlasting");
		   Assert.assertTrue(false);
		   
		   
		  }
		  Reporter.log("Latest date verifed for Everlasting");
		//  driver.close();
		  
		 } 
	@Test(priority=2)
	public void Yourstocks_verify() throws Throwable{

		
		//  super.browser();
		  super.getUrl(read.readData("Browser&URL", 34, 1));
	     //driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/section/div/section[2]/div[1]/ul/li[3]/a")).click();
		  driver.navigate().refresh();
		  Thread.sleep(20000);

		  String str1=driver.findElement(By.xpath(read.getObject("Yourstocks_Ltdate"))).getText();

		 
		 
		  SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		  String dateInString = str1; 
		   
		  try{
		   
		   date = formatter.parse(dateInString);
		   System.out.println("Your Stocks Dates:");
		   System.out.println("Report Date: "+date);
		 // System.out.println(formatter.format(date));  
		   
		  }catch(Throwable e){
		  e.printStackTrace();
		  }
		  
		  Date dt = new Date();
		  System.out.println("Todays Date: "+dt.toString());
		//  System.out.println(dt.toString());
		  Date startDate = date;// Set start date
		    Date endDate  = dt; // Set end date

		    long duration  = endDate.getTime() - startDate.getTime();

		   
		    long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		  
		  int days=(int) (diffInHours/24);
		  System.out.println("Your Stocks Days Difference: "+days);
		  System.out.println(" ");
		//  System.out.println(days);
		  if(days>=6){
			  driver.close();
			  Reporter.log("Latest date failed for Your Stocks");
		   Assert.assertTrue(false);
		   
		  }
		  Reporter.log("Latest date verified for Your Stocks");
		// driver.close();
		  
		 
	}
	@Test(priority=3)
	public void Mindset_verify() throws Throwable{


		
		//  super.browser();
		  super.getUrl(read.readData("Browser&URL", 35, 1));
		  driver.navigate().refresh();
		  Thread.sleep(20000);

		  String str1=driver.findElement(By.xpath(read.getObject("Mindset_Ltdate"))).getText();

		  
		 
		  SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		  String dateInString = str1; 
		   
		  try{
		   
		   date = formatter.parse(dateInString);
		   System.out.println("Mindset Stocks Dates:");
		   System.out.println("Report Date: "+date);
		//  System.out.println(date);
		  
		   
		  }catch(Throwable e){
		  e.printStackTrace();
		  }
		  
		  Date dt = new Date();
		  System.out.println("Todays Date: "+dt.toString());
		//  System.out.println(dt.toString());
		  Date startDate = date;// Set start date
		    Date endDate  = dt; // Set end date

		    long duration  = endDate.getTime() - startDate.getTime();

		   
		    long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		  
		  int days=(int) (diffInHours/24);
		  System.out.println("Mindset Days Difference: "+days);
		  System.out.println(" ");
		//  System.out.println(days);
		  if(days>=6){
			  Reporter.log("Latest date failed for Mindset");
		   Assert.assertTrue(false);
		  }
		  Reporter.log("latest date verfied for Mindset");
		  
		  
		  driver.quit(); 
	
	}

		

		  

	}

