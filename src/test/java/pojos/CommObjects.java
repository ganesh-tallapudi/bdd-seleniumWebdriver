package pojos;

import org.openqa.selenium.WebDriver;

public class CommObjects {

    private static WebDriver Driver;

    public static WebDriver getDriver() {
        return Driver;
    }

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
}
