package com.mainacad;

import com.mainacad.pages.CatalogPage;
import com.mainacad.pages.SignInPage;
import com.mainacad.pages.UserAccountPage;
import com.mainacad.pages.WelcomePage;
import com.mainacad.user_management.UserCredentials;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviderInClass extends TestBase {

    @DataProvider(name = "inputData")
    public static Object[][] inputData() {
        return new Object[][]{
                {"j2ee", "j2ee", true},
                {"fake_user", "fake_pass", false}};

    }

    @Test(dataProvider = "inputData")
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
