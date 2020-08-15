import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://amazon.com");


        String sayfaBasligi = driver.getTitle();    // ilk önce sayfanın başlığını alalım.

        if( sayfaBasligi.contains("Car") ){
            System.out.println("Car kelimesini içeriyor.");
        }else{
            System.out.println("Car kelimesini içermiyor.");
        }

        driver.quit();

        }

    }



