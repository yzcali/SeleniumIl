package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04LLinkTex {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement homeLink = driver.findElement(By.partialLinkText("Ho"));// if we write home or part of home it doesn't matter it works same as well.
        homeLink.click();





    }
}
