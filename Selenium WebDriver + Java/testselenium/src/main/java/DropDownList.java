//Работа с выпадающими списками

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DropDownList {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/Selenium WebDriver + Java/testselenium/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://vk.com/");

        selectOption("ij_bday", "Select.itemMouseDown(1, 5, this)"); //выбираем опцию из списка

        //driver.findElement(By.xpath("//div[@class='ij_bday']//td[2]")).click();
        //driver.findElement(By.xpath("//li[@onclick='Select.itemMouseDown(1, 5, this)']")).click();

        //driver.quit(); //завершение работы драйвера
    }
    //Метод выбора опции из списка
    public static void selectOption(String listName, String option) {
        String listXpath = String.format("//div[@class='%s']//td[2]", listName);
        String optionXpath = String.format("//li[@onclick='%s']", option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }

}
