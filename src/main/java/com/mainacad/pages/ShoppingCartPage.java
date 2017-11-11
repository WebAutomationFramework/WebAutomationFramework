package com.mainacad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Cart.action?viewCart=";

    @FindBy(xpath = "//div[@id='Cart']/h2[text()='Shopping Cart']")
    private WebElement shoppingCartPageHeader;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ShoppingCartPage open() {
        driver.get(PAGE_URL);
        return this;
    }

    @Override
    public boolean isPageDisplayed () {
        return shoppingCartPageHeader.isDisplayed();
    }

    public boolean isProductIdDisplay(String productNumberCart) {
        boolean isDisplayed = !(driver.findElements(By.xpath("//a[contains (@href, 'itemId="+productNumberCart+"')]")).isEmpty());
        //boolean isDisplayed = driver.findElement(By.xpath("//a[contains (@href, 'itemId="+productNumberCart+"')]")).isDisplayed();
        return isDisplayed;
}
    public void clickOnRemoveButton (String productNumberCart) {
        driver.findElement(By.xpath("//a[contains (@href, 'cartItem="+productNumberCart+"')]"))
                .click();
    }
}
