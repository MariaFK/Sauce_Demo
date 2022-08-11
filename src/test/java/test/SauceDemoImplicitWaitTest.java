package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.LinkedInPage;
import pagefactorypages.LoginPage;
import pagefactorypages.ProductsPage;
import utils.RetryAnalyzer;

public class SauceDemoImplicitWaitTest extends BaseTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void clickLinkedInIconTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.inputUsername(USERNAME);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickLoginButton();
        removeImplicitlyWait();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickLinkedInIcon();
        productsPage.switchToNextTab();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test-id='nav-logo']")));
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        Assert.assertTrue(linkedInPage.isLinkedInLogoDisplayed());
    }
}
