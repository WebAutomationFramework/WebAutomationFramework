package com.mainacad.pages;

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

    @FindBy(xpath = "//div[@id='Content']/h2[text()='Welcome to JPetStore 6']")
    private WebElement welcomePageHeader;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return this.welcomePageHeader.isDisplayed();
    }

    @Override
    public WelcomePage open () {
        driver.get(PAGE_URL);
        return this;
    }

    public CatalogPage enterStore() {
        enterStoreLink.click();
        return new CatalogPage(driver);
    }
}
