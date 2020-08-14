package com.thecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();

        webDriver.get("http://amazon.com");


        String page_title= webDriver.getTitle();
        String page_url= webDriver.getCurrentUrl();
        System.out.println(page_title);//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        System.out.println(page_url);//https://www.amazon.com/

        webDriver.quit();
    }
}
