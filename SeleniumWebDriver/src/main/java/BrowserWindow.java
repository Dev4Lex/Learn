//Работа с окнами браузера

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserWindow {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://javascript.info/popup-windows");
        String mainWindow = driver.getWindowHandle(); //записываем имя окна в переменную mainWindow

        driver.findElement(By.xpath("//*[@id=\"in46nfzr1t\"]/div/div[1]/div[1]/a")).click();
        //Метод для перебора окон
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/a[1]")).click();

        driver.switchTo().window(mainWindow); //переключение на предыдущее окно mainWindow
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[1]/nav/ul/li/a")).click();


    }
}