package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Tryst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http:///youtube.com");

        WebElement searchB= driver.findElement(By.xpath("//input[@id='search']"));
        searchB.sendKeys("nazende sevgilim yadima dustun");
        searchB.submit();

        WebElement pics= driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer'] "));
        pics.click();

        try{
            Thread.sleep(60000);// 60 saniye bekledi toplamda reklam dahil .
        }catch( InterruptedException e){
             e.printStackTrace();
        }
         driver.close();






    }
}
