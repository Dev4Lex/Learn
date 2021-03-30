//Запуск тестов без открытия браузера

import io.github.bonigarcia.wdm.managers.PhantomJsDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class RunTestsWithoutBrowser {

    static WebDriver driver;

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера
        System.setProperty("phantomjs.binary.path", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/phantomjs");


        driver = (WebDriver) new PhantomJsDriverManager(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("https://www.e-katalog.ru/k91.htm");

        WebElement chb1 = driver.findElement(By.xpath("//*[@id=\"li_br4\"]/label"));
        chb1.click();
        System.out.println(chb1.isEnabled()); //проверка доступности (enable/disable) элемента true/false
        System.out.println(chb1.isSelected()); //проверка выбора элемента (checkbox, radiobutton)
        System.out.println(chb1.isDisplayed()); //проверка отображения элемента на экране
    }
}