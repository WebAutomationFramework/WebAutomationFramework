package com.mainacad;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Basket extends TestBase {
    private String baseUrl="http://52.210.246.113:8080/";
    @Test
    public void test() throws Exception {
        driver.get(baseUrl + "/jpetstore/");
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.xpath("//div[@id='SidebarContent']/a[2]/img")).click();
        driver.findElement(By.linkText("K9-PO-02")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
    }







}
