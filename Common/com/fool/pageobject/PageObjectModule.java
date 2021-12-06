package com.fool.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.internal.seleniumemulation.WaitForCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxProfile;
import com.fool.input.InputRead;

public class PageObjectModule extends InputRead {

    public static WebDriver driver;
    protected String browser = null;
    public String title;
    public InputRead read = new InputRead();
    public WebElement myDynamicElement;

    public void browser() {
        try {
            browser = read.readData("Browser&URL", 1, 0);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (browser.equals("Firefox")) {
        	//FirefoxProfile profile = new FirefoxProfile();
            //profile.setPreference("javascript.enabled", true);
        	ProfilesIni ini = new ProfilesIni();
        	FirefoxProfile prof= ini.getProfile("default");
            driver = new FirefoxDriver(prof);
        } else if (browser.equals("IE")) {
            System.setProperty("webdriver.ie.driver", "BrowserExe\\IEDriverServer.exe");

        } else if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "BrowserExe\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public void getUrl(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void enterText(String xpathKey, String text) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath(xpathKey)).sendKeys(text);
    }

    public String findPost() throws Throwable {
        title = read.readData("PostMessage", 1, 0);
        String post = driver.findElement(By.xpath("//a[text()='" + title + "']")).getText();
        return post;

    }

    public void clickButton(String xpathKey) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath(xpathKey)).click();
    }

    public void selectList(String xpathKey) {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(xpathKey));
        org.openqa.selenium.interactions.Action moveto = builder.moveToElement(element).build();
        moveto.perform();
    }

    public void highlightElement(WebElement str) throws Throwable {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", str, "font-size:30px; color: green;");
            Thread.sleep(1000);
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", str, "font-size:23px; color: blue;");

        }
    }

    public void sync(String xpathKey) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathKey)));
    }


public void syncmore(String xpathKey) {

    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathKey)));
}

}
