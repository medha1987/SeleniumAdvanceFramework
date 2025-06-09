package com.thetestingacademy.pages.pageFactory.vwo;

import com.thetestingacademy.Base.CommonToAllPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thetestingacademy.Utils.WaitHelpers.visibilityOfElement;

public class Dashboard_PF extends CommonToAllPage {
    WebDriver driver;

    public Dashboard_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css ="[data-qa='lufexuloga']")
    private WebElement userNameOnDashboard;


    // Page Actions
    public String loggedInUserName() {
        visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}