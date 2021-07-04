package com.vytrack.tests.d2_webDriverBasic;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;


public class s4_CallWebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("safari");

        driver.get("https://www.google.com");

    }
}
