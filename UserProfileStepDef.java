package stepDefinitions;


import com.ganesh.businessComponents.PersonalInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pojos.CommObjects;

public class UserProfileStepDef {
    WebDriver driver = CommObjects.getDriver();
    PersonalInfoPage personalInfoPage = new PersonalInfoPage(this.driver);


    @When("I should click on user profile page")
    public void iShouldClickOnUserProfilePage() throws Exception {
        personalInfoPage.clickOnUserProfileLink();
    }

    @And("click on personal information")
    public void clickOnPersonalInformation() throws Exception {
        personalInfoPage.clickOnPersonalInfoLink();
    }

    @And("updated firstName with randomString")
    public void updatedFirstNameWithRandomString() throws Exception {
        personalInfoPage.modifyFirstNameOfUser();
        personalInfoPage.modifyUserPassword();

    }

    @And("click on Save")
    public void clickOnSave() throws Exception {
        personalInfoPage.clickOnSaveButton();
    }

    @Then("should see a message on the screen with {string}")
    public void shouldSeeAMessageOnTheScreenWith(String message) throws Exception {
        personalInfoPage.verifyMessage(message);

    }
}
