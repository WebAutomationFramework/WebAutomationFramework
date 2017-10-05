package com.qa.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by alexey on 9/3/17.
 */
public abstract class WebPage {
    protected WebDriver driver;
    protected String pageUrl;

    WebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public abstract String getPageUrl();
}
