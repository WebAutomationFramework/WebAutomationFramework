package com.qa.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by alexey on 9/3/17.
 */
public class CatalogPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action";

    @FindBy(linkText = "Sign In")
    private WebElement signInBtn;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    CatalogPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getsignInButton(){
        return signInBtn;
    }

    public WebElement getMyAccountLink() {
        return myAccountLink;
    }

//    @Override
//    public String getPageUrl() {
//        return PAGE_URL;
//    }
}
