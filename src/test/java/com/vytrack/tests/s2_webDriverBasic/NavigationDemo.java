package com.vytrack.tests.s2_webDriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        // To go to different web page with using navigate
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        // To go back amazon web page
        driver.navigate().back();
        Thread.sleep(3000);
        // To go forward google again
        driver.navigate().forward();
        Thread.sleep(3000);
        // Refresh the current page
        driver.navigate().refresh();




    }
}
