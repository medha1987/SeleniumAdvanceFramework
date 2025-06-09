package com.thetestingacademy.Pages.PageObjectModel_normal_POM.improvedPOM_VWO;

import com.thetestingacademy.Base.CommonToAllPage;
import com.thetestingacademy.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPageimproved extends CommonToAllPage {
    WebDriver driver;

    public DashboardPageimproved(WebDriver driver) {
        this.driver = driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}

