package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.LoginPage;
import pagefactorypages.ProductsPage;
import pagefactorypages.ShoppingCartPage;
import test.BaseTest;

public class SauceDemoFactoryTest extends BaseTest {

    @Test
    public void CartTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.inputUsername(USERNAME);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickLoginButton();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickAddItemToCartButton();
        productsPage.clickShoppingCartButton();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        Assert.assertEquals(shoppingCartPage.itemName(), shoppingCartPage.expectedItemName(),
                "The name isn't the same");
        Assert.assertEquals(shoppingCartPage.itemPrice(), shoppingCartPage.expectedItemPrice(),
                "The price isn't the same");
    }
}
