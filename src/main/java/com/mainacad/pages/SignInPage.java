package com.mainacad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageWithHeaderMenu {

    @FindBy(xpath = "//div[@id='Catalog']/form/p[contains(text(),'Please enter')]")
    private WebElement signInPageHeader;

    @FindBy(name = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='Content']/ul/li[contains(text(), 'Signon failed.')]")
    private WebElement invalidLoginMessage;



    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public <T extends WebPage> T open() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return signInPageHeader.isDisplayed();
    }

    public void typeIntoUsernameInput( String username ){
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void typeIntoPasswordInput( String password ){
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isInvalidLoginMessageDisplayed() {
        return invalidLoginMessage.isDisplayed();
    }

}
