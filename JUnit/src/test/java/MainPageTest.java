import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void signUpTest(){
        SignUpPage signUpPage = mainPage.clickSignUpFormButton();
        String heading = signUpPage.getHeading();
        Assert.assertEquals("Join GitHub", heading);
    }

    @Test
    public void registerFailTest(){
        LoginPage loginPage = mainPage.clickSignInButton();
        String head = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", head);

    }

    @After
    public void tearDown(){
        driver.quit();
    }




}
