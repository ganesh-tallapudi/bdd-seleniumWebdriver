package stepDefinitions;

import com.ganesh.businessComponents.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pojos.CommObjects;

public class OrderItemStepDef {
    WebDriver driver = CommObjects.getDriver();
    HomePage homePage = new HomePage(this.driver);


    @When("I click on Tshirt tab")
    public void iClickOnTshirtTab() throws Exception {
        homePage.clickOnTShirtTab();
    }


    @And("selected the Item")
    public void selectedTheItem() throws Exception {
        homePage.selectTheItem();

    }

    @And("Added Item to Cart")
    public void addedItemToCart() throws Exception {
        homePage.addItemsToCart();

    }

    @And("Proceed to Checkout across pages and Confirm the Order")
    public void proceedToCheckoutAcrossPagesAndConfirmTheOrder() throws Exception {
        homePage.checkOutAndOrderConfirm();

    }

    @Then("I should see order is successfully placed")
    public void iShouldSeeOrderIsSuccessfullyPlaced() throws Exception {
        homePage.orderPlaced();
    }
}
