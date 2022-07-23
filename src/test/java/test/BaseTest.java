package test;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

public class BaseTest {
    public WebDriver driver;
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
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
