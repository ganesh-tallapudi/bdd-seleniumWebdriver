package com.ganesh.businessComponents;

import com.ganesh.businessObjects.LoginPageObjectRepo;
import com.ganesh.businessObjects.PersonalInfoRepo;
import com.ganesh.commonComponents.ReusableComponents;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPage {
    WebDriver driver;
    ReusableComponents reusableComponents;
    PersonalInfoRepo personalInfoRepo;

    public PersonalInfoPage(WebDriver driver) {
        this.driver = driver;
        reusableComponents = new ReusableComponents();
        personalInfoRepo = new PersonalInfoRepo();

    }

    public void clickOnUserProfileLink() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, personalInfoRepo.userProfileLink,"Clicked on User Profile Link");
    }

    public void clickOnPersonalInfoLink() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, personalInfoRepo.personalInfoButton,"Clicked on User Profile Link");
    }

    public void modifyFirstNameOfUser() throws Exception {
        String updatedName = "Ganesh "+reusableComponents.generateRandomNumber();
        reusableComponents.typeForElementByXPATH(this.driver, personalInfoRepo.firstNameInput, updatedName, "Enter UserName");
    }

    public void modifyUserPassword() throws Exception {

        reusableComponents.typeForElementByXPATH(this.driver, personalInfoRepo.oldPwdInput, "Password1234", "Enter Old Password");
        reusableComponents.typeForElementByXPATH(this.driver, personalInfoRepo.newPwdInput, "Password1234", "Enter New Password");
        reusableComponents.typeForElementByXPATH(this.driver, personalInfoRepo.confirmPwdInput, "Password1234", "Enter Confirm Password");

    }

    public void clickOnSaveButton() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, personalInfoRepo.saveButton,"Clicked on Save Button");
    }

    public void verifyMessage(String expMessage) throws Exception {
        String messageObserved = reusableComponents.getTextFromElement(this.driver, personalInfoRepo.alertMessageSaveSuccess);
        if(expMessage.contains(messageObserved))
            System.out.println("Save is success");
    }

}
