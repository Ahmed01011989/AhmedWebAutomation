package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Deals ", "Books ", "Men "};
    }

    @DataProvider(name = "searchBooks")
    public Object[] getSearchBook() {
        return new Object[]{"barack obama"};
    }


}
