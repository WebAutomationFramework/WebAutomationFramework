package com.mainacad.wrapper_factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Olexiy on 9/13/2017.
 */
public class BrowserFactory {
    private static WebDriver driver = null;

    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String REMOTE_CHROME = "remote-chrome";
    private static final String REMOTE_FIREFOX = "remote-firefox";

    private static final String REMOTE_DRIVER_HUB_URL = "http://localhost:4444/wd/hub";

    public static WebDriver getInstance(String browser) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (driver == null) {
            if (CHROME.equals(browser)) {

                capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
                driver = new ChromeDriver(capabilities);

            } else if (FIREFOX.equals(browser)) {

                capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
                driver = new FirefoxDriver();

            } else if (REMOTE_CHROME.equals(browser)) {

                capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
                driver = new RemoteWebDriver(new URL(REMOTE_DRIVER_HUB_URL), capabilities);

            } else if (REMOTE_FIREFOX.equals(browser)) {

                capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
                driver = new RemoteWebDriver(new URL(REMOTE_DRIVER_HUB_URL), capabilities);

            } else {
                throw new Exception("Invalid browser property");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
