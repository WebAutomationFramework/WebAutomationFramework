package com.mainacad.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by alexey on 9/3/17.
 */
public class CatalogPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action";

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CatalogPage open() {
        driver.get(PAGE_URL);
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        return driver.getCurrentUrl() == PAGE_URL;
    }
}
