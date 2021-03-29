import com.codeborne.selenide.WebDriverRunner;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SignUpTest {
    private SignUpPage page;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/alexs/Desktop/git/Learn/SeleniumWebDriver/drivers/chromedriver");
        baseUrl = "https://www.spotify.com/ru-ru/signup";
        browser = "chrome";

    }


    @Test
    public void typeInvalidYear(){
        page = new SignUpPage();
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
        page = new SignUpPage();
        page.typeName("test@mail.test")
                .typeConfirmEmailField("wrong@mail.test")
                .typeName("Testname")
                .clickSignUpButton();
        Assert.assertTrue(page.isErrorVisible("Адреса электронной почты не совпадают."));
    }

    @Test
    public void signUpWithEmptyPassword(){
        page = new SignUpPage();
        page.typeEmail("test@mail.test")
                .typeConfirmEmailField("test@mail.test")
                .typeName("Testname")
                .clickSignUpButton();
        Assert.assertTrue(page.isErrorVisible("Введите пароль."));
    }

    @Test
    public void typeInvalidValues(){
        page = new SignUpPage();
        JavascriptExecutor jse = (JavascriptExecutor)getWebDriver();
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

}
