package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        WebElement searchB= driver.findElement(By.name("q"));
        searchB.sendKeys("city bike");
        searchB.submit();

       // WebElement resultN= driver.findElement(By.id("result-status"));
       // System.out.println(resultN.getText());

        WebElement shopLink= driver.findElement(By.partialLinkText("Shopping"));
        shopLink.click();

    }
}
