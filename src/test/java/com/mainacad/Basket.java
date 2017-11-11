package com.mainacad;

import com.mainacad.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basket extends TestBase {
    private String baseUrl = "http://ec2-52-210-246-113.eu-west-1.compute.amazonaws.com:8080/";
    @Test
    public void testAddToBasket() throws Exception {
        //driver.get(baseUrl + "/jpetstore/");
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open();
        welcomePage.enterStore();
        //driver.findElement(By.linkText("Enter the Store")).click();
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickOnCategory("FISH");
        //driver.findElement(By.cssSelector("#QuickLinks > a > img")).click();

        FishCategoryPage fishCat = new FishCategoryPage(driver);
        fishCat.clickOnProduct("FI-SW-01");
        //driver.findElement(By.linkText("FI-SW-01")).click();

        AngelfishPage anglfish = new AngelfishPage(driver);
        anglfish.clickOnAddButton("EST-1");

        ShoppingCartPage shopCart = new ShoppingCartPage(driver);
        boolean isDisplayedIdProduct = shopCart.isProductIdDisplay("EST-1");
        Assert.assertTrue(isDisplayedIdProduct);


        //WebElement title = driver.findElement(By.xpath("//td [text()='FI-SW-01']"));
        //String productName=title.getText();
       // Assert.assertEquals(productName, "FI-SW-01");
       // System.out.println("Product is added to the basket");
    }
}
