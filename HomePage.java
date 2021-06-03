package com.ganesh.businessComponents;

import com.ganesh.businessObjects.HomePageRepo;
import com.ganesh.businessObjects.LoginPageObjectRepo;
import com.ganesh.commonComponents.ReusableComponents;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    ReusableComponents reusableComponents;
    HomePageRepo homePageRepo;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        reusableComponents = new ReusableComponents();
        homePageRepo = new HomePageRepo();
   }

    public void checkUserForHomePage() throws Exception {
        reusableComponents.waitForElementPresentByXPATH(this.driver,homePageRepo.homePageLogo);
    }


    public void clickOnTShirtTab() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.tShirtTab,"Clicked on TShirt Tab");
    }

    public void selectTheItem() throws Exception {
        reusableComponents.waitForElementPresentByXPATH(this.driver, homePageRepo.tShirtImage);
        reusableComponents.hOverElement(this.driver, homePageRepo.tShirtImage);
       // reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.tShirtImage,"MouseOver on Tshirt Image");
        reusableComponents.waitTillPageLoadCompleted(this.driver);

    }

    public void addItemsToCart() throws Exception {
       // reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.tShirtImage,"MouseOver on Tshirt Image");
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.addToCartButton,"Clicked on Add to Cart");
    }


    public void checkOutAndOrderConfirm() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.initialProceedToCheckoutButton,"Click on Proceed to Checkout Button at first step");
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.proceedToCheckoutButtonSummaryPage,"Click on Proceed to Checkout Button at Summary Page");
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.proceedToCheckoutButtonAddressPage,"Click on Proceed to Checkout Button at Address Page");
        reusableComponents.clickIfElementIdPresent(this.driver, homePageRepo.agreeTermsCheckBox);
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.proceedToCheckoutButtonShippingPage,"Click on Proceed to Checkout Button at Shipping Page");
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.payByCheckLink,"Click on Pay By Check Link");
        reusableComponents.clickForElementByXPATH(this.driver, homePageRepo.confirmOrderButton,"Click on Confirm Order");

    }

    public void orderPlaced() throws Exception {
        String orderConfirmationMessageObs = reusableComponents.getTextFromElement(this.driver, homePageRepo.alterOrderCompletionSuccessMessage);
        if(orderConfirmationMessageObs.contains("Your order on My Store is complete")){
            System.out.println("Order is placed successfully");
        }
    }

}
