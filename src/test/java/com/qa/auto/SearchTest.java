package com.qa.auto;

import com.qa.auto.pages.CatalogPage;
import com.qa.auto.pages.SearchPage;
import com.qa.auto.pages.SignInPage;
import com.qa.auto.pages.WelcomePage;
import com.qa.auto.wrapper_factories.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by alexey on 9/7/17.
 */
public class SearchTest {
    private WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = BrowserFactory.initDriver("chrome");
    }

    @Test
    public void verifySearchAsUnauthorizedUserWorks() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open(WelcomePage.APP_INDEX_PAGE_URL);

        CatalogPage catalogPage =  welcomePage.enterStore();

        Assert.assertTrue(catalogPage.signInBtn.isDisplayed());

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForProductName("Persian");

        Assert.assertEquals(searchPage.ProductIdElem.getText(),searchPage.ProuductIdStr);
    }

    @Test
    public void verifySearchAsAuthorizedUserWorks() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open(WelcomePage.APP_INDEX_PAGE_URL);
        CatalogPage catalogPage =  welcomePage.enterStore();
        catalogPage.selectMenuItem("Sign In");

        SignInPage signInPage = new SignInPage(driver);
        catalogPage = signInPage.loginAs(User.userID,User.userPass);

        Assert.assertTrue(catalogPage.myAccountLink.isDisplayed());

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForProductName("Persian");
        Assert.assertEquals(searchPage.ProductIdElem.getText(),searchPage.ProuductIdStr);
    }

    @AfterMethod
    public void quitDriver(){
        BrowserFactory.closeDriver();
    }
}
