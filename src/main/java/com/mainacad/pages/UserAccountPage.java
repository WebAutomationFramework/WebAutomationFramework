package com.mainacad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPage extends PageWithHeaderMenu {


    @FindBy(xpath = "//div[@id='Catalog']/form/h3[contains(text(),'User Information')]")
    private WebElement userAccountPageHeader;

    @FindBy(xpath = "//td[text()='User ID:']/following-sibling::td")
    private WebElement userId;

    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public <T extends WebPage> T open() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return userAccountPageHeader.isDisplayed();
    }

    public String getUserId () {
        return userId.getText();
    }
}
