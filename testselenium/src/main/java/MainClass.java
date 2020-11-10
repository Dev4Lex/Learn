import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/alexs/Desktop/git/Learn/testselenium/drivers/geckodriver"); //путь до драйвера

        WebDriver driver = new FirefoxDriver(); //инициализация драйвера

        driver.get("https://yandex.ru/"); //переход по ссылке
    }
}
