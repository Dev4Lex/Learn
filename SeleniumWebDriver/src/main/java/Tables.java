//Работа с таблицами

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Tables {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://www.w3schools.com/html/html_tables.asp");

        WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));

        Table table = new Table(tableElement, driver);

        System.out.println("Rows number is: " + table.getRows().size()); //сколько строк в нашей таблице

        System.out.println(table.getValueFromCell(2,3)); //значение ячейки по номеру строки и номеру столбца
        System.out.println(table.getValueFromCell(4,1)); //значение ячейки по номеру строки и номеру столбца

        System.out.println(table.getValueFromCell(4,"Company")); //значение ячейки по номеру строки и имени столбца
        System.out.println(table.getValueFromCell(1,"Country")); //значение ячейки по номеру строки и имени столбца
        System.out.println(table.getValueFromCell(2,"Contact")); //значение ячейки по номеру строки и имени столбца

        driver.quit();
    }
}
