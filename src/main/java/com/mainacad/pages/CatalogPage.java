package com.mainacad.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by alexey on 9/3/17.
 */
public class CatalogPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action";

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCategory(String nameCategoryId) {
        driver.findElement(By.xpath("//div[@id='SidebarContent']/a[contains (@href, 'categoryId="+nameCategoryId+"')]"))
                .click();


        System.out.println("Product is added to the basket");
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
