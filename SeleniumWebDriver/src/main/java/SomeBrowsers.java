//Запуск тестов в разных браузерах

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeBrowsers {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера Chrome
        System.setProperty("webdriver.gecko.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/geckodriver"); //путь до драйвера Firefox
        System.setProperty("webdriver.edge.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/msedgedriver"); //путь до драйвера Edge

        driver = new ChromeDriver(); //инициализация драйвера Chrome;
        driver = new FirefoxDriver(); //инициализация драйвера Firefox;
        driver = new EdgeDriver(); //инициализация драйвера Firefox;

        driver.quit();

    }
}