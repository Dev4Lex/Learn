import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[text()='Sign up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpFormButton;

    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormButton() {
        signUpFormButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage register(String email) {
        this.typeEmail(email);
        this.clickSignUpFormButton();
        return new SignUpPage(driver);
    }


}
