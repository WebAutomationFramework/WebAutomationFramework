package com.mainacad;

import com.mainacad.helpers.PropertyLoader;
import com.mainacad.wrapper_factories.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    private String timeout;
    public String ProuductIdStr = "FL-DLH-02";

    @BeforeMethod
    @Parameters({ "browserName" })
    public void setUp(String browserName) throws Exception {
        timeout = PropertyLoader.loadProperty("implicit-timeout");

        driver = BrowserFactory.getInstance(browserName);
        System.out.println(driver.toString());

        driver.manage().timeouts().implicitlyWait(Integer.valueOf(timeout), TimeUnit.SECONDS);

        System.out.println("Running tests on:" + browserName);
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        System.out.println("Closing browser");
        if(driver!= null){
            BrowserFactory.closeDriver();
        }
    }
}
