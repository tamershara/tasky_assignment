package com.qacart.tasky.driver.managers;

import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {
    private ChromeManager() {}

    public static ChromeDriver getChromeDriver() {
        return new ChromeDriver();
    }
}
