package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageValidations extends TestBase {
    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test(enabled = false)
    public void validateUserAbleToSignIn() {

        logInPage.signIn();
        logInPage.typeEmail();
        logInPage.typePassword();
        logInPage.clickOnLogInButton();
    }

    @Test(enabled = false)
    public void validateUserAbleToLogOut() {

        logInPage.clickLogOutButton();

    }
}
