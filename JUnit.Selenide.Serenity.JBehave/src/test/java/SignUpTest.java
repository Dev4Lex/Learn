import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
    WebDriver driver;
    SignUpPage page;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/ru-ru/signup/");
    }

    @Test
    public void typeInvalidYear(){
        page = new SignUpPage(driver);
        page.setMonth("5")
                .typeDay("10")
                .typeYear("85")
                .setMarketing(true);
        Assert.assertTrue(page.isErrorVisible("Укажите действительный год."));
        Assert.assertFalse(page.isErrorVisible("Выберите месяц.")
                && page.isErrorVisible("Укажите действительный день месяца."));
    }

    @Test
    public void

    @After
    public void tearDown(){
        driver.quit();
    }
}
