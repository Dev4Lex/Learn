//Работа с текстовыми полями

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class MainClass3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/alexs/Desktop/git/Learn/testselenium/drivers/geckodriver"); //путь до драйвера

        WebDriver driver = new FirefoxDriver(); //инициализация драйвера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание 10 секунд
        driver.manage().window().maximize(); //окно на весь экран

        driver.get("http://en.wikipedia.org");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //вводит текста в поле
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value")); //получение значения атрибута
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear(); //очистка поля

        /*driver.get("https://github.com");
        WebElement button = driver.findElement(By.xpath("//button[@class = 'btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']"));
        button.submit(); //метод нажатия на кнопку
        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();

        driver.get("http://en-gb.facebook.com");
        driver.findElement(By.xpath("//button[@id='u_0_b']")).submit();*/

        //driver.quit();
    }
}