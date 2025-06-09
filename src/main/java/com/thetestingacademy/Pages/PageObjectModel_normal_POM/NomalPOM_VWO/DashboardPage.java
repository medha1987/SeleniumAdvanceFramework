package com.thetestingacademy.Pages.PageObjectModel_normal_POM.NomalPOM_VWO;

import com.thetestingacademy.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    //Login Page constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
        // Step 1- Page Locators
        private By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
        private By Dashboardtab=By.xpath("//a[@class='navbar-group-btn selected']");
        private By Dashboard=By.xpath("//a[@vwo-async-click='updateSelectedTabViewState(TabViewStateEnum.DASHBOARD)']");
        // Step 2 - Page Actions
        public String loggedInUserName(){
            WaitHelpers.waitJVM(10000);
            driver.findElement(Dashboardtab).click();
            driver.findElement(Dashboard).click();
           // driver.get("https://app.vwo.com/#/dashboard");
            WaitHelpers.waitJVM(3000);
            return driver.findElement(userNameOnDashboard).getText();
        }



    }

