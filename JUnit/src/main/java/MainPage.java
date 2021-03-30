import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }


    private By signInButton = By.xpath ("//a[@href='/login']");

    private By signUpButton = By.xpath ("//a[text()='Sign up'][1]");

    private By emailField = By.xpath ("//input[@id='user_email_control']");

    private By signUpFormButton = By.xpath ("/html/body/div[4]/main/div/div[1]/div[1]/div[1]/div/div/div[1]/form[1]/div/button");

    public LoginPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormButton() {
        driver.findElement(signUpFormButton).click();
        return new SignUpPage(driver);
    }

    public MainPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage register(String email) {
        this.typeEmail(email);
        this.clickSignUpFormButton();
        return new SignUpPage(driver);
    }


}
