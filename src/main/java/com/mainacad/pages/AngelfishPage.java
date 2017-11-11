package com.mainacad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AngelfishPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-01";

    public AngelfishPage(WebDriver driver) { super(driver); }


    public void clickOnAddButton (String productNumber) {
        driver.findElement(By.xpath("//a[contains (@href, 'ItemId="+productNumber+"')]"))
                .click();
    }


    @Override
    public <T extends WebPage> T open() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }
}