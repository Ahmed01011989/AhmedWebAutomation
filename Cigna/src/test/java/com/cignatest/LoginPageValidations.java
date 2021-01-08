package com.cignatest;

import com.base.TestBase;
import com.cigna.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {
    private LoginPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LoginPage.class);
    }


    @Test(enabled = false)
    public void validateUserUnableToLogInWithInvalidCredentials() {
        logInPage.userUnableToLogInWithInvalidCredentials();
    }
}
