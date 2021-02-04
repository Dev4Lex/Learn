//Работа с чекбоксами и радиокнопками

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class CheckboxRadiobutton {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/Selenium WebDriver + Java/testselenium/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()='Понятно']")).click();
        driver.findElement(By.xpath("//a[@href='/catalog--bytovaia-tekhnika/54419']")).click();
        driver.findElement(By.xpath("//a[text()='Стиральные и сушильные машины']")).click();
        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();

        driver.findElement(By.xpath("//input[@name='Производитель ATLANT']/following-sibling::div/span")).click();

        driver.quit(); //завершение работы драйвера

    }
}