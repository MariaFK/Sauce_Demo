package driverfactorymanager;

public class DriverFactory {

    public DriverManager getManager(DriverType driverType) {

        DriverManager driverManager;

        switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            default:
                throw new IllegalStateException("Unexpected driver type" + driverType);
        }
        return driverManager;
    }
}
