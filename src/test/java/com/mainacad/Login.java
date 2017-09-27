package com.mainacad;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;



public class Login extends TestBase {

    private String baseUrl = "http://52.210.246.113:8080/jpetstore";

    @Test
    // This is test created using Selenium IDE
    
    public void loginWrongPassword() {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("8888");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("wrong");
        driver.findElement(By.name("signon")).click();

        Assert.assertTrue(driver.findElement(By.linkText("Sign In")).isDisplayed());
    }
}
