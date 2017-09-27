package com.mainacad;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Basket extends TestBase {
    private String baseUrl = "http://ec2-52-210-246-113.eu-west-1.compute.amazonaws.com:8080/";
    @Test
    public void testAddToBasket() throws Exception {
        driver.get(baseUrl + "/jpetstore/");
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.cssSelector("#QuickLinks > a > img")).click();
        driver.findElement(By.linkText("FI-SW-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
    }
}
