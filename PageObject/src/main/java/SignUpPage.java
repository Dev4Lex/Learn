import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//div[text()='Join GitHub']");
    private By userNameField = By.xpath("//input[@id='user_login']");
    private By userEmailField = By.xpath("//input[@id='user_email']");
    private By userPasswordField = By.xpath("//input[@id='user_password']");

    private By signUpButton = By.xpath("//button[@id='signup_button']");

    public SignUpPage typeUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password){
        driver.findElement(userPasswordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email){
        driver.findElement(userEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage registerWithValidCreds(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }
}
