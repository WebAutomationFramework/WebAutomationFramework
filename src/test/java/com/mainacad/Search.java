package com.mainacad;


import com.mainacad.pages.SearchResultsPage;
import com.mainacad.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by alexey on 9/30/17.
 */
public class Search extends TestBase {

    @Test
    @Parameters({"searchQuery"})
    public void verifySearchWithoutWords(String searchQuery){
        SearchResultsPage searchResultsPage =
                new WelcomePage(driver)
                        .open()
                        .enterStore()
                        .typeIntoSearchField(searchQuery)
                        .clickSearchButton();

         Assert.assertTrue(searchResultsPage.isPageDisplayed());
         Assert.assertTrue(searchResultsPage.isEmptySearchErrorMessageDisplayed());
    }
}
