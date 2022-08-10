package test;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";


    @BeforeMethod
    public void setUp() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_CHROME"));
        driver = new ChromeDriver();
        setImplicitlyWait();
    }

    public void setImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void removeImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
