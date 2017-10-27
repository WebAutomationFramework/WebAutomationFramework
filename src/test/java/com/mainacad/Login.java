package com.mainacad;

import com.mainacad.pages.CatalogPage;
import com.mainacad.pages.SignInPage;
import com.mainacad.pages.UserAccountPage;
import com.mainacad.pages.WelcomePage;
import com.mainacad.user_management.UserCredentials;
import com.mainacad.user_management.UserPool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test
    public void validLogin() {

        UserCredentials userCredentials = UserPool.getInstance().getValidUser();

        WelcomePage welcomePage = new WelcomePage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        UserAccountPage userAccountPage = new UserAccountPage(driver);

        welcomePage.open();
        Assert.assertTrue(welcomePage.isPageDisplayed());

        welcomePage.enterStore();
        Assert.assertTrue(catalogPage.isPageDisplayed());

        catalogPage.clickOnSighIn();
        Assert.assertTrue(signInPage.isPageDisplayed());

        signInPage.typeIntoUsernameInput(userCredentials.getUsername());
        signInPage.typeIntoPasswordInput(userCredentials.getPassword());
        signInPage.clickLoginButton();
        Assert.assertTrue(catalogPage.isPageDisplayed());

        catalogPage.clickOnMyAccount();
        Assert.assertTrue(userAccountPage.isPageDisplayed());
        Assert.assertEquals(
                userAccountPage.getUserId(),
                userCredentials.getUsername());

    }

    @Test
    public void invalidLogin() {

        UserCredentials userCredentials = UserPool.getInstance().getInvalidUser();

        WelcomePage welcomePage = new WelcomePage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        SignInPage signInPage = new SignInPage(driver);

        welcomePage.open();
        Assert.assertTrue(welcomePage.isPageDisplayed());

        welcomePage.enterStore();
        Assert.assertTrue(catalogPage.isPageDisplayed());

        catalogPage.clickOnSighIn();
        Assert.assertTrue(signInPage.isPageDisplayed());

        signInPage.typeIntoUsernameInput(userCredentials.getUsername());
        signInPage.typeIntoPasswordInput(userCredentials.getPassword());
        signInPage.clickLoginButton();
        Assert.assertTrue(signInPage.isPageDisplayed());
        Assert.assertTrue(signInPage.isInvalidLoginMessageDisplayed());

    }

}
