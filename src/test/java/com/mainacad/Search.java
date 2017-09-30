package com.mainacad;


import com.mainacad.pages.CatalogPage;
import com.mainacad.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by alexey on 9/30/17.
 */
public class Search extends TestBase {

    @Test
    public void verifySearchWithoutWords(){
        CatalogPage catalogPage =
                new WelcomePage(driver)
                        .open()
                        .enterStore()
                        .typeIntoSearchField(" ")
                        .clickSearchButton();

         Assert.assertTrue(catalogPage.isPageDisplayed());
         Assert.assertTrue(catalogPage.isEmptySearchErrorMessageDisplayed());
    }
}
