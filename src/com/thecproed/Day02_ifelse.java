package com.thecproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Day02_ifElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/yzc/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");
        String page_title=webDriver.getTitle();// in the title it has a word that "Car" or not we are testing
        System.out.println(page_title);       //Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
                                              // no , it hasn't the word "Car"
        if(page_title.contains("Car")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        webDriver.quit();
    }
}
