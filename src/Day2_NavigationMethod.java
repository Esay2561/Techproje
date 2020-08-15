import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_NavigationMethod {

    public static void main(String[] args) { //projemize chromedriveri tanittik

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();// driverın tüm ekranı kaplamasını sağlıyor.

        webDriver.get("http://google.com"); // driver'a google.com'a gitmesini söyledik.

        webDriver.navigate().to("http://amazon.com"); // get methodu ile aynı işlemi yapıyor

        webDriver.navigate().back();  // navigate().back() methodu bir önceki sayfaya geri dönmeye yarıyor.

        // navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        webDriver.navigate().refresh();



    }
}
