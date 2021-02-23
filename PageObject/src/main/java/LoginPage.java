import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    @FindBy(xpath = "//input[@id='login_field']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//h1")
    private WebElement heading;

    @FindBy(xpath = "//div[@class='container-lg px-2']/button[@aria-label='Dismiss this message']")
    private WebElement error;

    @FindBy(xpath = "//a[text()='Create an account']")
    private WebElement createAccLink;

    public LoginPage typeUsername(String username) {
        loginField.sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage loginWithInvalidCreds(String username, String password) {
        this.typeUsername(username);
        this.typePassword(password);
        signInButton.click();
        return new LoginPage(driver);
    }

    public String getHeadingText () {
        return heading.getText();
    }

    public String getErrorText(){
        return error.getText();
    }

    public SignUpPage createAccount() {
        createAccLink.click();
        return new SignUpPage(driver);
    }
}

