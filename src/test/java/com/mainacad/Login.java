package com.mainacad;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends TestBase{
    private String baseUrl = "http://52.210.246.113:8080/jpetstore/";

    @Test
    public void testLoginWithoutUsername() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("11111");
        driver.findElement(By.name("signon")).click();
    }
}
