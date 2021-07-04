package com.vytrack.tests.d2_webDriverBasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3_CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

//      close(): close the current tab
//        driver.close();

//        quit(): close all tabs
        driver.quit();

        Thread.sleep(3000);
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

    }
}
