package com.mainacad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithHeaderMenu extends WebPage {
    @FindBy(xpath = "//a[contains(@href, 'viewCart')]")
    private WebElement shoppingCart;

    @FindBy(xpath = "//input[@name='keyword']")
    private WebElement searchInputField;

    @FindBy(xpath = "//input[@name='searchProducts']")
    private WebElement searchSubmitButton;

    public PageWithHeaderMenu(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnShoppingCart () {
        this.shoppingCart.click();
        return new ShoppingCartPage(driver);
    }

    public PageWithHeaderMenu typeIntoSearchField(String searchQuery) {
        searchInputField.sendKeys(searchQuery);
        return this;
    }

    public CatalogPage clickSearchButton() {
        searchSubmitButton.click();
        return new CatalogPage(driver);
    }
}
