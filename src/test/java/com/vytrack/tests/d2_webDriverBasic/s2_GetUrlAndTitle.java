package com.vytrack.tests.d2_webDriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class s2_GetUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // Get a title
        String title = driver.getTitle();
        System.out.println("title = " + title);

//        Get a currentURL
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

//        Get page-source
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
