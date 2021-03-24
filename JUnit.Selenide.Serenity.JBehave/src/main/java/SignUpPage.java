import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }

    By emailField = By.xpath("//input[@name='email']");
    By confirmEmailField = By.xpath("//input[@name='confirm']");
    By passwordField = By.xpath("//input[@id='password']");
    By nameField = By.xpath("//input[@id='displayname']");
    By monthDropDown = By.xpath("//select[@id='month']");
    String monthDropDownOption = "//select[@id='month']/option[text()='$s']";
    By dayField = By.xpath("//input[@id='day']");
    By yearField = By.xpath("//input[@id='year']");
    String genderRadioButton = "//div[@class='GenderSelect__FlexRow-v1a8zn-0 eHAjfo']/label/input[@value='$s']";
    By marketingCheckbox = By.xpath("//input[@name='marketing']");
    By thirdPartyCheckbox = By.xpath("//input[@name='thirdParty']");
    By termsConditionsCheckbox = By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[9]/label/input");
    By registerButton = By.xpath("//button[@type='submit']");
    By emailError = By.xpath("//span[text()='Введите адрес электронной почты.']");


}
