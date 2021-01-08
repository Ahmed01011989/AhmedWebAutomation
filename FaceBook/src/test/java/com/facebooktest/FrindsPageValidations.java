package com.facebooktest;

import com.base.TestBase;
import com.facebook.data.DataProviders;
import com.facebook.pages.FrindsPage;
import com.facebook.pages.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FrindsPageValidations extends TestBase {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToAddNewFrind(String userName, String password) {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        FrindsPage frindsPage = PageFactory.initElements(driver, FrindsPage.class);
        signInPage.typeOnEmailField(userName);
        signInPage.typeOnPasswordField(password);
        signInPage.ClickOnSignInBtn();
        frindsPage.typeOnsearchFiled();
        frindsPage.ChromeOption();
        frindsPage.clickOnsearchBtn();
        frindsPage.clickOnAddFrindBtn();


    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToClickOnFindFriendsBtn(String userName, String password) {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        FrindsPage frindsPage = PageFactory.initElements(driver, FrindsPage.class);
        signInPage.typeOnEmailField(userName);
        signInPage.typeOnPasswordField(password);
        signInPage.ClickOnSignInBtn();
        frindsPage.clickOnFindFrindsbtn();
        frindsPage.validateScrollPage();
    }


}
