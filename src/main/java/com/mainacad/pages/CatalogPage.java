package com.mainacad.pages;

import com.mainacad.helpers.UrlParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 9/3/17.
 */
public class CatalogPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action";
    private final String VALIDATION_MESSAGE_EMPTY_SEARCH = "Please enter a keyword to search for, then press the search button.";

    @FindBy(xpath = "//*[@id='Content']/ul[1]/li")
    private WebElement catalogPageEmptySearchLabel;

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
        return UrlParser.cleanUpURL(driver.getCurrentUrl()).equals(PAGE_URL);
    }

    public boolean isEmptySearchErrorMessageDisplayed() {
        return catalogPageEmptySearchLabel.getText().equals(VALIDATION_MESSAGE_EMPTY_SEARCH);
    }
}
