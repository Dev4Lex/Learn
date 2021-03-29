import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpTest {
    private WebDriver driver;
    private SignUpPage page;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.spotify.com/ru-ru/signup/");
        driver.findElement(By.xpath("//button[contains(@class,\"mh-close\")]")).click();
        driver.findElement(By.xpath("//button[contains(@class,\"banner-close-button\")]")).click();
    }


    @Test
    public void typeInvalidYear(){
        page = new SignUpPage(driver);
        page.getScroll();
        page.setMonth("Май")
                .typeDay("10")
                .typeYear("85");
        page.getScroll();
        page.setMarketing(true);
        Assert.assertTrue(page.isErrorVisible("Укажите действительный год."));
        Assert.assertFalse(page.isErrorVisible("Выберите месяц.")
                && page.isErrorVisible("Укажите действительный день месяца."));
    }

    @Test
    public void typeInvalidEmail(){
        page = new SignUpPage(driver);
        page.typeName("test@mail.test")
                .typeConfirmEmailField("wrong@mail.test")
                .typeName("Testname")
                .clickSignUpButton();
        Assert.assertTrue(page.isErrorVisible("Адреса электронной почты не совпадают."));
    }

    @Test
    public void signUpWithEmptyPassword(){
        page = new SignUpPage(driver);
        page.typeEmail("test@mail.test")
                .typeConfirmEmailField("test@mail.test")
                .typeName("Testname")
                .clickSignUpButton();
        Assert.assertTrue(page.isErrorVisible("Введите пароль."));
    }

    @Test
    public void typeInvalidValues(){
        page = new SignUpPage(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, window.innerHeight)", "");
        page.typeEmail("testmail")
                .typeConfirmEmailField("wrong@test.mail")
                .typePassword("qweqwe123!")
                .typeName("Name")
                .getScroll();
        page.setGender("Мужчина");
        page.getScroll();
        page.setMarketing(false);
        page.clickSignUpButton();
        Assert.assertEquals(7,page.getErrors().size());
        Assert.assertEquals("Выберите месяц.", page.getErrorByNumber(4) );
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
