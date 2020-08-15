import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_DriverMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/user/Documents/Selenium dependencies/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com"); // google.com'a gittik
        webDriver.navigate().to("http://amazon.com");

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl   = webDriver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

        webDriver.quit();



    }
}
