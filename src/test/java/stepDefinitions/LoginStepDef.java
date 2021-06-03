package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pojos.CommObjects;

public class LoginStepDef {
    WebDriver driver = CommObjects.getDriver();

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() throws Exception{
        driver.get("http://automationpractice.com");

    }

    @When("I enter username as {string}")
    public void iEnterUsernameAs(String arg0) {

    }


    @And("I enter password as {string}")
    public void iEnterPasswordAs(String arg0) {

    }

    @Then("I should be able to see the home page")
    public void iShouldBeAbleToSeeTheHomePage() {

    }
}
