import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
    WebDriver driver;
    SignUpPage page;

    @Before
    public void setUp(){
        System.setProperty();
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/ru-ru/signup/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
