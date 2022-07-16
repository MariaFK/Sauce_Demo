package test;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

public class BaseTest {
    WebDriver driver;
    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";

    public BaseTest() {
    }

    @BeforeMethod
    public void setUp() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_DRIVER"));
        driver = new ChromeDriver();
        driver.get(Urls.LOGIN_FORM_URL);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.cssSelector("#password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.cssSelector("[name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }

    @AfterMethod(
            alwaysRun = true
    )
    public void tearDown() {

        driver.quit();
    }

}
