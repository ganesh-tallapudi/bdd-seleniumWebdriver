package stepDefinitions;

import com.ganesh.businessComponents.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pojos.CommObjects;

public class LoginStepDef {
    WebDriver driver = CommObjects.getDriver();
    LoginPage loginPage = new LoginPage(this.driver);
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() throws Exception{
        driver.get("http://automationpractice.com");

    }

    @When("I enter username as {string}")
    public void iEnterUsernameAs(String userName) throws Exception {
        loginPage.clickOnSignInButton();
        loginPage.enterUserName(userName);

    }


    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) throws Exception {
        loginPage.enterPassword(password);
    }

    @Then("I should be able to see the home page")
    public void iShouldBeAbleToSeeTheHomePage() {

    }

    @And("I clicked on Login Button")
    public void iClickedOnLoginButton() throws Exception {

        loginPage.clickOnLogin();
    }
}
