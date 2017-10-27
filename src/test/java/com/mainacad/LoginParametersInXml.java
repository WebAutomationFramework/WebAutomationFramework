package com.mainacad;

import com.mainacad.pages.CatalogPage;
import com.mainacad.pages.SignInPage;
import com.mainacad.pages.WelcomePage;
import com.mainacad.user_management.UserCredentials;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParametersInXml extends TestBase {

    @Test
    @Parameters({"username","password", "shouldBeLoggedIn"})
    public void login(String username, String password, boolean shouldBeLoggedIn) {

        UserCredentials userCredentials =
                new UserCredentials(username, password);

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
        Assert.assertTrue(catalogPage.isPageDisplayed() == shouldBeLoggedIn);

    }
}
