package com.mainacad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishCategoryPage extends PageWithHeaderMenu {
    private final String PAGE_URL = "http://52.210.246.113:8080/jpetstore/actions/Catalog.action?viewCategory=&categoryId=FISH";
    public FishCategoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='Catalog']/h2[text()='Fish']")
    private WebElement titleFish;

    public void clickOnProduct(String product) {

        driver.findElement(By.xpath("//a[contains(@href, 'productId') and text()='" + product + "']" ))
                .click();
    }

    @Override
    public <T extends WebPage> T open() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return titleFish.isDisplayed();
    }
}
