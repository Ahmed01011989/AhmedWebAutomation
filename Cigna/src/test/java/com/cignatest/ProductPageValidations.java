package com.cignatest;

import com.base.TestBase;
import com.cigna.pages.ProductPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageValidations extends TestBase {
    private ProductPage productPage;

    @BeforeMethod
    public void pageFactorySetup() {

        productPage = PageFactory.initElements(driver, ProductPage.class);
    }


    @Test(enabled = false)
    public void validateUserAbleToClickProductsTheyOffer() {
        productPage.checkTheirProducts();

    }

    @Test(enabled = false)
    public void validateUseAbleToClickOnProductForDentalPlans() {
        productPage.checkProductForDentalPlans();
    }
}
