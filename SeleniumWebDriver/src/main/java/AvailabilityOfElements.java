//Проверка доступности элементов

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AvailabilityOfElements {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://www.e-katalog.ru/k91.htm");

        WebElement chb1 = driver.findElement(By.xpath("//*[@id=\"li_br4\"]/label"));
        chb1.click();
        System.out.println(chb1.isEnabled()); //проверка доступности (enable/disable) элемента true/false
        System.out.println(chb1.isSelected()); //проверка выбора элемента (checkbox, radiobutton)
        System.out.println(chb1.isDisplayed()); //проверка отображения элемента на экране

//        if(!chb1.isSelected()) chb1.click();


    }
}