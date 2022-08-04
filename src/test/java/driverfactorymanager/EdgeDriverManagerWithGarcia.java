package driverfactorymanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeDriverManagerWithGarcia extends DriverManager {

    @Override
    public void createDriver() {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
}
