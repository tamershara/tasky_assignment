package com.qacart.tasky.pages;

import com.qacart.tasky.base.BasePage;
import org.openqa.selenium.By;

import static com.qacart.tasky.config.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public class DashboardPage implements BasePage {
    private final By renewButton = By.id(":r5:");
    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/dashboard");
    }

    public boolean isRenewButtonDisplayed() {
        return false;
    }
}
