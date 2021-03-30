//Работа с вкладками браузера

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserTabs {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://signup.live.com/");
        String mainTab = driver.getWindowHandle(); //сохранение имени первой вкладки в переменную mainTab

        driver.findElement(By.xpath("//a[text()='Условия использования']")).click();

        //Цикл перебора всех вкладок
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("//a[text()='Часто задаваемые вопросы']")).click();

        driver.switchTo().window(mainTab); //переключение на первую вкладку
        driver.findElement(By.xpath("//input[@aria-label='Создать адрес']")).sendKeys("SendText");


    }
}