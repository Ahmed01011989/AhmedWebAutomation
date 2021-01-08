package com.amazontest;

import com.amazon.pages.CartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CartPageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAleToClickOnProccedToCheckOut() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        homePage.clickOnCartButton();
        cartPage.clickSignInToYourAccount();
        signInPage.setClickOnSignInBtn();
        cartPage.setClickOnCheckBox();
        cartPage.validateDropDown();
        cartPage.clickproceedToCheckout();
    }
}
