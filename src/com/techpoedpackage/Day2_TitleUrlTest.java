package com.techpoedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1 - youtube.com'a gidelim.
// 2 - title (sayfa başlığı), video kelimesini içeriyor mu bakalım.
// 3 - driverı kapatalım.

public class Day2_TitleUrlTest {
    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");
              WebDriver driver =new ChromeDriver();
        // youtube.com'a gidelim.
        driver.get("http://youtube.com");

        // sayfanın title(yani başlığını) alalım.
        String sayfaBasligi = driver.getTitle();

        if(sayfaBasligi.contains("Video")){
            System.out.println("Var : " + sayfaBasligi);
        }else{
            System.out.println("Yok : " + sayfaBasligi);
        }

        // driver'ı kapattık.
        driver.quit();



    }

}
