package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailB= driver.findElement(By.xpath("//input[@type='email']"));
        emailB.sendKeys("testtechproed@gmail.com");

       WebElement passB= driver.findElement(By.xpath("//input[@placeholder='Password']"));
       passB.sendKeys("Test1234!");
       passB.submit();



      WebElement sign_O= driver.findElement(By.xpath("//a[@rel='nofollow']"));
      sign_O.click();





    }
}
