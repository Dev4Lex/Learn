//Поиск списка элементов

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/Selenium WebDriver + Java/testselenium/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://market.yandex.ru/");

        //Идем по каталогу до Стиральных машин
        driver.findElement(By.xpath("//span[text()='Понятно']")).click();
        driver.findElement(By.xpath("//a[@href='/catalog--bytovaia-tekhnika/54419']")).click();
        driver.findElement(By.xpath("//a[text()='Стиральные и сушильные машины']")).click();
        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, window.innerHeight)", ""); //Скролл вниз
        driver.findElement(By.xpath("//span[text()='Понятно']")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//fieldset[@data-autotest-id='7893318']//input[@type='checkbox']/following-sibling::div/span"));

        //checkboxes.get(3).click(); //клик по элементу с индексом 3

        //Проверка соответствия количества чекбоксов
        if (checkboxes.size() == 12) System.out.println("It's okay!");
        else System.out.println("Fail!");

        //Отметить все найденные чекбоксы
        for(WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }
}
