package com.qa.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 9/3/17.
 */
public class MyAccountPage extends WebPage{
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Account.action?editAccountForm=";

    @FindBy(xpath = "//*[@id='Catalog']/form/table[1]/tbody/tr[1]/td[2]")
    private WebElement userID;

    @FindBy(name = "account.email")
    private WebElement userEmail;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserID() {
        return userID;
    }

    public WebElement getUserEmail() {
        return userEmail;
    }

    @Override
    public String getPageUrl() {
        return PAGE_URL;
    }
}
