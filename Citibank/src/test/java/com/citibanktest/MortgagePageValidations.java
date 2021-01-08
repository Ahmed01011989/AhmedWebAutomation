package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.MortgagePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MortgagePageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserAbleToFindMortgageCalculator() {
        MortgagePage mortgagePage = PageFactory.initElements(driver, MortgagePage.class);
        mortgagePage.findMortgageCalculator();
    }
}
