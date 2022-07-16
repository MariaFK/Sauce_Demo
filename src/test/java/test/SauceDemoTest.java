package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest{
    @Test
    public void CartTest() {

        //add check
        String itemPrice = driver.findElement(By.cssSelector("[class='inventory_item_price']")).getText();
        String itemName = driver.findElement(By.cssSelector("[class='inventory_item_name']")).getText();

        Assert.assertEquals(itemName, "Sauce Labs Backpack");
        Assert.assertEquals(itemPrice, "$29.99");

    }
}
