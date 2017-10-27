package com.mainacad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithHeaderMenu extends WebPage {
    @FindBy(xpath = "//a[contains(@href, 'viewCart')]")
    private WebElement shoppingCart;

    @FindBy(linkText = "Sign In")
    private WebElement signIn;

    @FindBy(linkText = "My Account")
    private WebElement myAccount;

    public PageWithHeaderMenu(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnShoppingCart () {
        this.shoppingCart.click();
        return new ShoppingCartPage(driver);
    }


    public void clickOnSighIn () {
        this.signIn.click();
    }

    public void clickOnMyAccount () {
        myAccount.click();
    }


}
