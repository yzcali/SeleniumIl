package com.thecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver= new ChromeDriver();

        webDriver.get("https://www.amazon.com");

        //webDriver.close();
        //webDriver.quit();







    }
}
