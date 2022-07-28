package test;

import driverfactorymanager.DriverFactory;
import driverfactorymanager.DriverManager;
import driverfactorymanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseFactoryTest {

    public WebDriver driver;
    public DriverManager driverManager;
    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";

    @BeforeMethod
    public void setUp() {
        DriverFactory driverFactory = new DriverFactory();
        driverManager = driverFactory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver = driverManager.getDriver();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();

    }

}
