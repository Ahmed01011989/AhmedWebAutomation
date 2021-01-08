package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.BooksPage;
import com.amazon.pages.HomePage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BooksPageValidations extends TestBase {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchBooks", enabled = false)
    public void validateUserBeingAleToAddItemToCart(String data) {
        BooksPage booksPage = PageFactory.initElements(driver, BooksPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.validateDropDown();
        homePage.clickOnSearchButton();
        booksPage.clickOnObamaBook();
        booksPage.clickOnAddToCartBtn();
    }

}
