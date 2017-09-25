package com.qa.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 9/9/17.
 */
public class WelcomePage extends WebPage {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/";

    @FindBy(linkText = "Enter the Store")
    private WebElement enterStoreLink;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return PAGE_URL;
    }

    public CatalogPage enterStore() {
        enterStoreLink.click();
        return new CatalogPage(driver);
    }

}
