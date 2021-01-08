package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAleToClickOnSignInBtn() {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.clickOnCreateAnAccountBtn();
    }

    @Test(enabled = false)
    public void validateUserBeingAleToCreateAnAccount() {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        signInPage.clickOnCreateAnAccountBtn();
        signInPage.setCreateAnAccountBtn();
        signInPage.clickOnCreateyourAmazonAccountBtn();
    }

    @Test(enabled = false)
    public void validateUserBeingAleToSignIn() {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        signInPage.setClickOnSignInBtn();
        signInPage.validateCreateAccountURL();


    }

}
