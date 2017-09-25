package com.qa.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageWithHeaderMenu {

    @FindBy(xpath = "//div[@id='Cart']/h2[text()='Shopping Cart']")
    private WebElement shoppingCartPageHeader;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed () {
        return shoppingCartPageHeader.isDisplayed();
    }

}
