package com.qa.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 9/7/17.
 */
public class SearchPage extends WebPage {

    @FindBy(name = "keyword")
    private WebElement keyWordField;

    @FindBy(name = "searchProducts")
    private WebElement searchProductsBtn;

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[2]/b/a/font")
    private WebElement productIdElem;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public String getProductIdStr(){
        return productIdElem.getText();
    }

    public void searchForProductName(String persian) {
        keyWordField.sendKeys(persian);
        searchProductsBtn.click();
    }

//    @Override
//    public String getPageUrl() {
//        return null;
//    }

}
