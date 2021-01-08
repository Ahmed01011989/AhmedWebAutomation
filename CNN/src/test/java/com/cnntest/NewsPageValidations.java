package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.NewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageValidations extends TestBase {
    private NewsPage newsPage;

    @BeforeMethod
    public void pageFactorySetup() {

        newsPage = PageFactory.initElements(driver, NewsPage.class);
    }

    @Test(enabled = false)
    public void validateScrollToAfricaNews() {

        newsPage.scrollToNewsOnAfrica();
    }

    @Test(enabled = false)
    public void validateScrollAndClickAndValidateAsiaNews() {
        newsPage.scrollAndClickAsia();

    }

    @Test(enabled = false)
    public void validateUserCanTypeAndSearchNewsFromSearchBar() {

        newsPage.typeOnSearchBarForNews();
    }
}
