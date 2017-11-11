package com.mainacad;

import com.mainacad.wrapper_factories.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    public String ProuductIdStr = "FL-DLH-02";

    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.initDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterMethod
    public void quitDriver(){
        BrowserFactory.closeDriver();
    }
}
