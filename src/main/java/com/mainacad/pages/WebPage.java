package com.mainacad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexey on 9/3/17.
 */
public abstract class WebPage {
    protected WebDriver driver;

    WebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract  <T extends WebPage> T open();
    public abstract  boolean isPageDisplayed();
}
