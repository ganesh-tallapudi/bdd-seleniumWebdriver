package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pojos.CommObjects;

public class LoginStepDef {
    WebDriver driver = CommObjects.getDriver();

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() throws Exception{
        driver.get("https://www.google.com");
        Thread.sleep(5000);

    }
}
