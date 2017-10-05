package com.qa.auto;

import com.qa.auto.pages.ShoppingCartPage;
import com.qa.auto.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCart extends TestBase{
    @Test
    public void viewShoppingCart() {
        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
    }
}
