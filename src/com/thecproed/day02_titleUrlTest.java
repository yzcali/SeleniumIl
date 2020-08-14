package com.thecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_titleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http:/youtube.com");
        String page_title=webDriver.getTitle();
        System.out.println(page_title);

        if(page_title.contains("video")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        webDriver.quit();
    }
}
