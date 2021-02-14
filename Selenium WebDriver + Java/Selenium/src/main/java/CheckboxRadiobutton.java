//Работа с чекбоксами и радиобаттонами

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CheckboxRadiobutton {

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

        //Выбираем бренды
        driver.findElement(By.xpath("//span[text()='Понятно']")).click();
        selectCheckBox("Производитель ATLANT"); //выделяем чекбоксы
        selectCheckBox("Производитель Beko");
        selectCheckBox("Производитель Candy");

        deselectCheckBox("Производитель Beko"); //снимаем выделение с чекбоксов

        System.out.println();

        //Выбираем способ доставки
        System.out.println(driver.findElement(By.xpath("//input[@id='offer-shipping_pickup']")).isSelected()); //проверка выбора до
        driver.findElement(By.xpath("//span[text()='Самовывоз']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='offer-shipping_pickup']")).isSelected()); //проверка выбора после
        driver.findElement(By.xpath("//span[text()='Доставка курьером']")).click();

        //driver.quit(); //завершение работы драйвера

    }
    //Метод выделения чекбоксов
    public static void selectCheckBox(String name){
        String rbXpath = "//input[@name='%s']/following-sibling::div/span";
        if (!driver.findElement(By.xpath(String.format(rbXpath, name)+ "/../../input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }
    //Метод снятия выделения с чекбоксов
    public static void deselectCheckBox(String name){
        String rbXpath = "//input[@name='%s']/following-sibling::div/span";
        if (driver.findElement(By.xpath(String.format(rbXpath, name)+ "/../../input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }
}