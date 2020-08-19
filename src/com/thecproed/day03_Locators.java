package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        WebDriver.Timeouts timeouts = webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MICROSECONDS);
        webDriver.get("http://a.testaddressbook.com");
        webDriver.manage().window().maximize();


        WebElement signInLink =  webDriver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailBox = webDriver.findElement(By.id("session_email"));
        emailBox.sendKeys ("testtechproed@gmail.com");




         WebElement password =webDriver.findElement(By.id("session_password"));
         password.sendKeys("test1234!");

        WebElement signInButonu = webDriver.findElement(By.name("commit"));
        signInButonu.click();
    }
}
