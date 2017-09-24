package com.qa.auto;

import com.qa.auto.pages.CatalogPage;
import com.qa.auto.pages.SignInPage;
import com.qa.auto.pages.SignUpPage;
import com.qa.auto.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserSignUpTest extends TestBase {


    @Test
    public void verifyUserSignUpWorks() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open(welcomePage.getPageUrl());

        CatalogPage catalogPage =  welcomePage.enterStore();
        catalogPage.selectMenuItem("Sign In");

        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = signInPage.navigateSignUpPage();
        signUpPage.signUpNewUser();
        Assert.assertEquals(catalogPage.getPageUrl(),driver.getCurrentUrl());
    }
}