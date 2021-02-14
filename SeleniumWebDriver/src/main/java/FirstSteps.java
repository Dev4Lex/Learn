//Создание тестового класса и запуск браузера

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //импорт для работы с драйвером браузера Chrome
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;  //импорт для работы с драйвером браузера Firefox

public class FirstSteps {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд

        driver.manage().window().maximize(); //окно на весь экран
        //driver.manage().window().setSize(new Dimension(900,500)); //указание размеров экрана


        driver.get("https://yandex.ru/"); //переход по ссылке
        driver.navigate().to("http://seleniumhq.org"); //альтернативный вариат перехода по ссылке
        driver.navigate().back(); //возврат на предыдущую страницу
        driver.navigate().forward(); //переход на страницу вперед
        driver.navigate().refresh(); //обновление страницы


        System.out.println(driver.getTitle()); //получение тайтла страницы
        System.out.println(driver.getCurrentUrl()); //получение url страницы

        driver.quit(); //завершение работы драйвера



    }
}
