package com.thecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Driver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        String page_title= webDriver.getTitle();
        System.out.println(page_title);

        webDriver.navigate().to("http://youtube.com");
        String page_title1= webDriver.getTitle();
        System.out.println(page_title1);

        String page_url= webDriver.getCurrentUrl();
        System.out.println(page_url);

        webDriver.navigate().back();
        String page_url1= webDriver.getCurrentUrl();
        System.out.println(page_url1);

        webDriver.quit();

        //Google
        //Youtube
        //https://www.youtube.com/
        //https://www.google.com/?gws_rd=ssl


    }
}
