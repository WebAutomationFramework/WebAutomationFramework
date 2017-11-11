package com.mainacad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithHeaderMenu extends WebPage {
    @FindBy(xpath = "//a[contains(@href, 'viewCart')]")
    private WebElement shoppingCart;

    public PageWithHeaderMenu(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnShoppingCart () {
        this.shoppingCart.click();
        return new ShoppingCartPage(driver);
    }
}
