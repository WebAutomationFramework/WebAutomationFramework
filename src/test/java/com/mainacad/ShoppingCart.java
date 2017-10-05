package com.mainacad;

import com.mainacad.pages.ShoppingCartPage;
import com.mainacad.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ShoppingCart extends TestBase {
    @Test
    public void viewShoppingCartChrome1() throws MalformedURLException {
        System.out.println("Starting chrome test1");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test1");
    }

    @Test
    public void viewShoppingCartChrome2() throws MalformedURLException {
        System.out.println("Starting chrome test2");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test2");
    }


    @Test
    public void viewShoppingCartFirefox1() throws MalformedURLException {
        System.out.println("Starting ff test1");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test1");
    }

    @Test
    public void viewShoppingCartFirefox2() throws MalformedURLException {
        System.out.println("Starting ff test2");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test2");
    }


    @Test
    public void viewShoppingCartChrome11() throws MalformedURLException {
        System.out.println("Starting chrome test11");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test11");
    }

    @Test
    public void viewShoppingCartChrome12() throws MalformedURLException {
        System.out.println("Starting chrome test12");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test12");
    }


    @Test
    public void viewShoppingCartFirefox11() throws MalformedURLException {
        System.out.println("Starting ff test11");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test11");
    }

    @Test
    public void viewShoppingCartFirefox12() throws MalformedURLException {
        System.out.println("Starting ff test12");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test12");
    }
    @Test
    public void viewShoppingCartChrome21() throws MalformedURLException {
        System.out.println("Starting chrome test21");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test21");
    }

    @Test
    public void viewShoppingCartChrome22() throws MalformedURLException {
        System.out.println("Starting chrome test22");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test22");
    }


    @Test
    public void viewShoppingCartFirefox21() throws MalformedURLException {
        System.out.println("Starting ff test21");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test21");
    }

    @Test
    public void viewShoppingCartFirefox22() throws MalformedURLException {
        System.out.println("Starting ff test22");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test22");
    }
    @Test
    public void viewShoppingCartChrome31() throws MalformedURLException {
        System.out.println("Starting chrome test31");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test31");
    }

    @Test
    public void viewShoppingCartChrome32() throws MalformedURLException {
        System.out.println("Starting chrome test32");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing chrome test32");
    }


    @Test
    public void viewShoppingCartFirefox31() throws MalformedURLException {
        System.out.println("Starting ff test31");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test31");
    }

    @Test
    public void viewShoppingCartFirefox32() throws MalformedURLException {
        System.out.println("Starting ff test32");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        ShoppingCartPage catalogPage =
                new WelcomePage(driver).open()
                        .enterStore()
                        .clickOnShoppingCart();

        Assert.assertTrue(catalogPage.isPageDisplayed());
        System.out.println("Finishing ff test32");
    }




}
