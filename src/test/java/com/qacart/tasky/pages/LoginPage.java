package com.qacart.tasky.pages;

import com.qacart.tasky.base.BasePage;

import static com.qacart.tasky.config.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public class LoginPage implements BasePage {
    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/login");
    }

    public String loginUsingAPI() {
        return "";
    }
}
