package com.vytrack.tests.s1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_01 {

    public static void main(String[] args) {

        // We need to setup webdriver based on the browser that we will use
        WebDriverManager.chromedriver().setup();

        // We need to create object for using selenium driver
        WebDriver driver = new ChromeDriver();

        // To open browser
        driver.get("https://www.amazon.com");
        //To navigate
        driver.navigate().to("https://www.amazon.com");

        //To get a title
        String title = driver.getTitle();






    }
}
