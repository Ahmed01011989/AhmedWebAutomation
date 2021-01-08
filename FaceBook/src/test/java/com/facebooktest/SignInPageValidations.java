package com.facebooktest;


import com.base.TestBase;
import com.facebook.data.DataProviders;
import com.facebook.pages.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToSignIn(String userName, String password) {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.typeOnEmailField(userName);
        signInPage.typeOnPasswordField(password);
        signInPage.ClickOnSignInBtn();

    }

}