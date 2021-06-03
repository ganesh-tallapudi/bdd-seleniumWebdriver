package com.ganesh.businessComponents;

import com.ganesh.businessObjects.LoginPageObjectRepo;
import com.ganesh.commonComponents.ReusableComponents;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    ReusableComponents reusableComponents;
    LoginPageObjectRepo loginPageRepo;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        reusableComponents = new ReusableComponents();
        loginPageRepo = new LoginPageObjectRepo();

    }


    public void enterUserName(String username) throws Exception {
        reusableComponents.typeIfElementIdPresent(this.driver, loginPageRepo.username, username, "Enter UserName");
    }

    public void enterPassword(String password) throws Exception{
        reusableComponents.typeIfElementIdPresent(this.driver, loginPageRepo.password, password, "Enter Password");
    }

    public void clickOnLogin() throws Exception {
        reusableComponents.clickIfElementIdPresent(this.driver, loginPageRepo.submit);
    }
    public void clickOnSignInButton() throws Exception {
        reusableComponents.clickForElementByXPATH(this.driver, loginPageRepo.signInButton,"Clicked on SignIN Button");
    }


}
