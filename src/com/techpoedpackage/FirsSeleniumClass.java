package com.techpoedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirsSeleniumClass {
    public static void main(String[] args) {
//"webdriver.chrome.driver  bu hicbir zaman degismeyecek
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");
       WebDriver driver =new ChromeDriver();
       driver.get("https://www.google.com");
        driver.get("https://www.amazon.com");

    }

}
