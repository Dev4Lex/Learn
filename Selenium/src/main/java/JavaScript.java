//Выполнение JavaScript

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class JavaScript {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/Selenium WebDriver + Java/testselenium/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        JavascriptExecutor jse = (JavascriptExecutor)driver; //создали executor скрипта
//        jse.executeScript("alert('Hello World!')");
        jse.executeScript("window.scrollBy(0,1000)",""); //скролл страницы вниз на 1000px
        jse.executeScript("window.scrollBy(0,-1000)",""); //скролл страницы вверх на 1000px



//        driver.quit(); //завершение работы драйвера
    }
}