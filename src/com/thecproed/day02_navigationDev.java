package com.thecproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_navigationDev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.google.com");
        webDriver.navigate().to("https://www.youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();


    }
}
