import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//div[text()='Join GitHub']")
    private WebElement heading;

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement userEmailField;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[@id='signup_button']")
    private WebElement signUpButton;

    public SignUpPage typeUserName(String username){
        userNameField.sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password){
        userPasswordField.sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email){
        userEmailField.sendKeys(email);
        return this;
    }

    public SignUpPage registerWithValidCreds(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        signUpButton.click();
        return new SignUpPage(driver);
    }
}
