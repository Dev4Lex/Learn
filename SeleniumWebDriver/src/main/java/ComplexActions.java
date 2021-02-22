//Выполнение сложных действий

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class ComplexActions {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://www.ebay.com/");

        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Электроника']"));
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Электроника']"));

        //Метод наведения курсора на элемент
        //build()- собирает действия; perform()-выполняет
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();  //навели курсор на элемент

        //Метод Drag-and-drop (перетаскивание элемента)
        actions.dragAndDrop(element, link).build().perform(); //указываем откуда и куда

        //Метод двойного нажатия на элемент
        actions.doubleClick(element);

        //Метод вызова контекстного меню (клик правой кнопкой мыши)
        actions.contextClick(element);

        //Метод зажатия кнопкой мыши
        actions.clickAndHold(element).moveToElement(link).release().build().perform(); //release отпускает кнопку мыши

        Action action = actions.clickAndHold(element).moveToElement(link).release().build();
        action.perform();





    }
}