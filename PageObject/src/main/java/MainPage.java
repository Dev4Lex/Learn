import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signInButton = By.xpath("//a[@href='/login']");
    private By signUpButton = By.xpath("//a[text()='Sign up']");
    private By emailField = By.xpath("//input[@id='user_email']");
    private By signUpFormButton = By.xpath("//button[@type='submit']");

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
