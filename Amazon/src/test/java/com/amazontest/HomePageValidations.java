package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAleToClickOnSignInBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchButton();
    }

    @Test
    public void validateUserBeingAleToClickOnCartBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCartButton();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchBooks", enabled = false)
    public void validateUserBeingAleToDropDownSortBy(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.validateDropDown();
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateDragAndDoop() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateDragAndDrop();
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateMouseHoverAndSignOut() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.clickOnSignInButton();
        signInPage.setClickOnSignInBtn();
        homePage.validateMouseHoverAccontAndList();


        homePage.scrollToElement();
    }
}