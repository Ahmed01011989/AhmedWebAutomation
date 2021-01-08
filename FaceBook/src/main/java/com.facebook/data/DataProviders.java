package com.facebook.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"9179160875", "test1234"}};
    }


}
