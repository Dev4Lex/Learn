//Явные ожидания Explicit Wait

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    static WebDriver driver;
    static WebDriverWait wait;
    static WebDriverWait wait2;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/Selenium WebDriver + Java/testselenium/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://vk.com/");

        wait = (new WebDriverWait(driver,5)); //создали явное ожидание 5 секунд
        wait2 = (new WebDriverWait(driver, 10)); //создали явное ожидание 10 секунд

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2"))); //ждем пока появится элемент

        selectOption("ij_bday", "Select.itemMouseDown(1, 25, this)"); //выбираем опцию из списка (День 5)
        selectOption("ij_bmonth", "Select.itemMouseDown(2, 5, this)"); //выбираем опцию из списка (Месяц Май)
        selectOption("ij_byear", "Select.itemMouseDown(3, 15, this)"); //выбираем опцию из списка (Год 1993)

    }

    //Метод выбора опции из списка
    public static void selectOption(String listName, String option) {
        String listXpath = String.format("//div[@class='%s']//td[2]", listName);
        String optionXpath = String.format("//li[@onclick='%s']", option);
        driver.findElement(By.xpath(listXpath)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionXpath)));  //дожидаемся пока элемент станет видимым
        driver.findElement(By.xpath(optionXpath)).click();
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(optionXpath)));  //дожидаемся пока элемент станет невидимым

    }
}
