package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pojos.CommObjects;

public class Hooks {


    public static WebDriver Driver;
    @Before
    public void InitializeTest(Scenario scenario) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        this.Driver = new ChromeDriver(chromeOptions);
       // CommObjects commObjects = new CommObjects();
        CommObjects.setDriver(this.Driver);
    }
}
