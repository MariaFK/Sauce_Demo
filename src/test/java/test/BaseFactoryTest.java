package test;

import driverfactorymanager.DriverFactory;
import driverfactorymanager.DriverManager;
import driverfactorymanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class BaseFactoryTest {

    public WebDriver driver;
    public DriverManager driverManager;
    public final String USERNAME = "standard_user";
    public final String PASSWORD = "secret_sauce";

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory driverFactory = new DriverFactory();
        DriverType type = null;
        if (browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("edge")) {
            type = DriverType.EDGE;
        } else if (browser.equals("remote")) {
            type = DriverType.REMOTE;
        }
        driverManager = driverFactory.getManager(type);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver = driverManager.getDriver();

    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();

    }

}
