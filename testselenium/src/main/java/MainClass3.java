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
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //ввод текста в поле
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value")); //получение значения атрибута
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear(); //очистка поля

        driver.get("https://github.com");
        driver.findElement(By.xpath(".//*[@id='user[login]']")).sendKeys("testusername");
        driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys("testpass");WebElement button = driver.findElement(By.xpath("//button[@class = 'btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']"));
        button.submit(); //метод нажатия на кнопку
//        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
//
        driver.get("http://en-gb.facebook.com");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testusername");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("testpass");
        driver.findElement(By.xpath("//*[@id='u_0_b']")).submit();
        System.out.println("Mail is " + driver.findElement(By.xpath("//*[@id='email']")).getAttribute("value"));

        driver.quit();
    }
}