package com.techpoedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


       public class Day2_Homework {
/*
 ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,
  Değilse, doğru başlığı(Actual title) yazdırın.
 3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
 4. Ardından Navigate to https://www.walmart.com/
 5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
 6. Navigate back to facebook
 7. Sayfayı yenileyin(refresh)
 8. Maximize the window
 9. Close the browse
 */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.contains("Url")) {
            System.out.println("Url title.");
        } else {
            System.out.println("Actual url.");
        }
        driver.navigate().to("https:www.walmart.com");
        if (sayfaBasligi.contains("walmart.com")) {
            System.out.println("iceriyor");
        } else {
            System.out.println("icermiyor.");
            driver.navigate().to("https:www.facebook.com");
            driver.navigate().refresh();
            driver.manage().window().maximize();
        }
            driver.quit();

        }
    }