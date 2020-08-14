package com.thecproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.google.com");

        webDriver.navigate().to("https://www.amazon.com");

        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();



    }
}
