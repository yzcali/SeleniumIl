package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04Lgiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailB=  driver.findElement(By.className("form-control"));
        emailB.sendKeys("testtechproed@gmail.com");

        WebElement passW= driver.findElement(By.id("session_password"));
        passW.sendKeys("Test1234!");

        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();





    }
}
