//Работа с Alert

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://learn.javascript.ru/alert-prompt-confirm");
        driver.findElement(By.xpath("//a[text()='Запустить демо']")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().dismiss(); //отмена алерта
        driver.switchTo().alert().accept(); //подтверждение на алерте


        driver.get("https://google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("confirm('Are you sure?')");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept(); //подтверждение на алерте

    }
}