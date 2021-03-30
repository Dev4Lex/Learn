//Имитация нажатия клавиш клавиатуры

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class SendKeys {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

        String select = Keys.chord(Keys.COMMAND,"a");
        String cut = Keys.chord(Keys.COMMAND,"x");
        String paste = Keys.chord(Keys.COMMAND,"v");

        searchInput.sendKeys("test text");
        searchInput.sendKeys(select); //Выделить текст
        searchInput.sendKeys(cut); //Вырезать текст
        searchInput.sendKeys(paste); //Вставить текст

        //Ввод текста
        searchInput.sendKeys("test text");

        //Метод chord - сочетание клавиш
        searchInput.sendKeys(Keys.chord(Keys.SHIFT,"test"));

        //Нажатие Enter
        searchInput.sendKeys(Keys.ENTER);


        driver.quit();
    }
}