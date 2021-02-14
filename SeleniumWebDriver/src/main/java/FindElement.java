//Поиск элементов
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class FindElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver"); //путь до драйвера

        WebDriver driver = new ChromeDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://en.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Log in")); //поиск по тексту ссылки
        WebElement link2 = driver.findElement(By.partialLinkText("Donate")); //поиск ссылки по части текста ссылки
        WebElement searchField = driver.findElement(By.name("search")); //поиск по значению атрибута name
        WebElement searchButton = driver.findElement(By.className("searchButton")); //поиск по имени класса
        WebElement li = driver.findElement(By.id("ca-viewsource")); //поиск по значению id элкмента
        WebElement input = driver.findElement(By.tagName("input")); //поиск по названию html-тега
        WebElement element = driver.findElement(By.cssSelector("div#SimpleSearch input#searchButton")); // поиск по CSS-селектору
        WebElement logo = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a")); //поиск по XPath

        driver.quit();
    }
}