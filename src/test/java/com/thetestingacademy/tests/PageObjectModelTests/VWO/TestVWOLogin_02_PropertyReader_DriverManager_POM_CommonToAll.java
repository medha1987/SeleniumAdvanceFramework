package com.thetestingacademy.tests.PageObjectModelTests.VWO;

import com.thetestingacademy.Driver.DriverManager;
import com.thetestingacademy.Pages.PageObjectModel_normal_POM.improvedPOM_VWO.DashboardPageimproved;
import com.thetestingacademy.Pages.PageObjectModel_normal_POM.improvedPOM_VWO.LoginPageImproved;
import com.thetestingacademy.Utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.thetestingacademy.Driver.DriverManager.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_02_PropertyReader_DriverManager_POM_CommonToAll {
    @Description("TC#1- Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {

        // Page Class Code (POM Code) - 2
        LoginPageImproved loginPage  = new LoginPageImproved(DriverManager.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }

    @Owner("PRAMOD")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {
        LoginPageImproved loginPage_VWO = new LoginPageImproved(DriverManager.getDriver());
        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashboardPageimproved dashBoardPage  = new DashboardPageimproved(driver);
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));

    }
}
