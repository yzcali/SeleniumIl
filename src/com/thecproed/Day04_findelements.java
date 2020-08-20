package com.thecproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // a tagname e sahip tum elemanalri bulalim.list yontemini kullanacagiz .
        //for dongusu bilmeniz lazim

       List<WebElement> list1 =driver.findElements(By.tagName("a"));
       for (WebElement w: list1){
           System.out.println(w.getText());//Home(current) Sign in
       }




    }
}
