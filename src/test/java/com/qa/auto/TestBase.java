package com.qa.auto;

import com.qa.auto.pages.WelcomePage;
import com.qa.auto.wrapper_factories.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    public String ProuductIdStr = "FL-DLH-02";

    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.initDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void quitDriver(){
     //   BrowserFactory.closeDriver();
    }
}
