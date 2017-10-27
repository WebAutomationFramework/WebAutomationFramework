package com.mainacad;

import com.mainacad.pages.ShoppingCartPage;
import com.mainacad.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCart extends TestBase{
    @Test
    public void viewShoppingCart() {
        ShoppingCartPage shoppingCartPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(shoppingCartPage.isPageDisplayed());
    }
}
