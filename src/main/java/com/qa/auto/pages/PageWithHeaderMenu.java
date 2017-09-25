package com.qa.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithHeaderMenu extends WebPage {


    @FindBy(xpath = "//a[contains(@href, 'FISH')]")
    private WebElement fishCategory;

    @FindBy(xpath = "//a[contains(@href, 'DOGS')]")
    private WebElement dogsCategory;

    @FindBy(xpath = "//a[contains(@href, 'REPTILES')]")
    private WebElement reptilesCategory;

    @FindBy(xpath = "//a[contains(@href, 'CATS')]")
    private WebElement catsCategory;

    @FindBy(xpath = "//a[contains(@href, 'BIRDS')]")
    private WebElement birdsCategory;

    @FindBy(xpath = "//a[contains(@href, 'viewCart')]")
    private WebElement shoppingCart;






    @FindBy(linkText = "Sign In")
    protected WebElement signInBtn;

    @FindBy(linkText = "My Account")
    protected WebElement myAccountLink;


    public PageWithHeaderMenu(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnShoppingCart () {
        this.shoppingCart.click();
        return new ShoppingCartPage(driver);
    }


//    public void selectMenuItem(String item) {
//        driver.findElement(By.linkText(item)).click();
//    }

//    public void open(String pageUrl) {
//        driver.get(pageUrl);
//    }

//    public  clickShoppingCart


}
