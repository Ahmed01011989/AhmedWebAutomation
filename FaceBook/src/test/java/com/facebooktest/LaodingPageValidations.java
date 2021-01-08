package com.facebooktest;


import com.base.TestBase;
import com.facebook.data.DataProviders;
import com.facebook.pages.LaodingPage;
import com.facebook.pages.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LaodingPageValidations extends TestBase {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToSignIn(String userName, String password) {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        LaodingPage lodingPage = PageFactory.initElements(driver, LaodingPage.class);
        signInPage.typeOnEmailField(userName);
        signInPage.typeOnPasswordField(password);
        signInPage.ClickOnSignInBtn();
        lodingPage.ChromeOption();
        lodingPage.ClickOnStatusTextArea();
        lodingPage.ChromeOption();

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToClickOnEventsBtn(String userName, String password) {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        LaodingPage lodingPage = PageFactory.initElements(driver, LaodingPage.class);
        signInPage.typeOnEmailField(userName);
        signInPage.typeOnPasswordField(password);
        signInPage.ClickOnSignInBtn();
        lodingPage.validateURL();
        lodingPage.ChromeOption();
    }
}