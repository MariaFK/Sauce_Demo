package test;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;

public class SauceDemoTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void CartTest() {
        driver.get(Urls.LOGIN_FORM_URL);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(USERNAME);
        driver.findElement(By.cssSelector("#password")).sendKeys(PASSWORD);
        driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.cssSelector("[name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //add check
        String itemPrice = driver.findElement(By.cssSelector("[class='inventory_item_price']")).getText();
        String itemName = driver.findElement(By.cssSelector("[class='inventory_item_name']")).getText();

        Assert.assertEquals(itemName, "Sauce Labs Backpack");
        Assert.assertEquals(itemPrice, "$29.99");

    }
}
