package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06Denim {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

      WebElement emailB= driver.findElement(By.xpath("//input[@type='text'] "));
      emailB.sendKeys("techproed@gmail.com");

        WebElement passB= driver.findElement(By.xpath("//input[@type='password'] "));
      passB.sendKeys("Test1234");
      //passB.submit();
        WebElement loginB= driver.findElement(By.xpath("//button[@value=1]"));
        loginB.click();

        try{
            Thread.sleep(3000);
        }catch( InterruptedException e){

        }

      String url = driver.getCurrentUrl();
        System.out.println(url);

      if(url.contains("facebook.com/login")){
          System.out.println("giris basarisiz");
      }else{
          System.out.println("giris basarili");
      }
    }
}
