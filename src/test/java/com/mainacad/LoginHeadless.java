package com.mainacad;

import com.mainacad.helpers.HeadlessLoginer;
import com.mainacad.pages.CatalogPage;
import com.mainacad.pages.UserAccountPage;
import com.mainacad.pages.WelcomePage;
import com.mainacad.user_management.UserCredentials;
import com.mainacad.user_management.UserPool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginHeadless extends TestBase {

    @Test
    public void loginHeadless() {
        // Initialize pages, users
        WelcomePage welcomePage = new WelcomePage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        UserAccountPage userAccountPage = new UserAccountPage(driver);
        UserCredentials validUser = UserPool.getInstance().getValidUser();

        // Open Welcome page
        welcomePage.open();
        Assert.assertTrue(welcomePage.isPageDisplayed());

        // Enter store
        welcomePage.enterStore();
        Assert.assertTrue(catalogPage.isPageDisplayed());

        // Perform login
        HeadlessLoginer.performLogin(validUser, driver);
        driver.navigate().refresh();

        // Go to MyAccount page and verify that you are logged in with correct user
        catalogPage.clickOnMyAccount();
        Assert.assertTrue(userAccountPage.isPageDisplayed());
        Assert.assertEquals(
                userAccountPage.getUserId(),
                validUser.getUsername());
    }
}
