//Проверка наличия элемента

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ExistenceOfElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://github.com/");

        //Сколько элементов на странице с заданным xpath
        System.out.println(driver.findElements(By.xpath("//a[@data-ga-click='(Logged out) Header, clicked Sign in, text:sign-in']")).size());
        //Сколько элементов с xpath //a
        System.out.println(driver.findElements(By.xpath("//a")).size());

        //Проверка на наличие элемента через size() > 0
        if (driver.findElements(By.xpath("//a[@data-ga-click='(Logged out) Header, clicked Sign in, text:sign-in']")).size() > 0)
            System.out.println("Such element is presented");
        else System.out.println("Cannot find such element");




        driver.quit();






    }
}