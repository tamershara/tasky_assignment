package com.qacart.tasky.driver.managers;

import org.openqa.selenium.firefox.FirefoxDriver;

public final class FirefoxManager {
    private FirefoxManager() {}
    public static FirefoxDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }
}
