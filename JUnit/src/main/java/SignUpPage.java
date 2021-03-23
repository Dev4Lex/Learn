import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headingSignUp = By.xpath("//h1[text()='Create your account']");


    private By userNameField = By.xpath("//input[@id='user_login']");


    private By userEmailField = By.xpath("//input[@id='user_email']");

    private By userPasswordField = By.xpath("//input[@id='user_password']");

    private By signUpButton = By.xpath("//button[@id='signup_button']");

    private By passwordError = By.xpath("//dd[@class='error']");

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

    public String getPasswordErrorText() {
        return driver.findElement(passwordError).getText();
    }


    public SignUpPage registerWithValidCreds(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public String getHeading () {
       return  driver.findElement(headingSignUp).getText();
    }
}
