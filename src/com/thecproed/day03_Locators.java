package com.thecproed;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));

        signInLink.click();

        WebElement emailbox= driver.findElement(By.id("session_email"));

        emailbox.sendKeys("testtechproed@gmail.com");

        WebElement passbox= driver.findElement(By.id("session_password"));
        passbox.sendKeys("Test1234!");

        WebElement signbtn= driver.findElement(By.name("commit"));
        signbtn.click();



    }
}
