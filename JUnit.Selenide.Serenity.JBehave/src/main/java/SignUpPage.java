import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.String.format;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SignUpPage {

    private By emailField = By.xpath("//input[@name='email']");
    private By confirmEmailField = By.xpath("//input[@name='confirm']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By nameField = By.xpath("//input[@id='displayname']");
    private By monthDropDown = By.xpath("//select[@id='month']");
    private String monthDropDownOption = "//option[text()='%s']";
    private By dayField = By.xpath("//input[@id='day']");
    private By yearField = By.xpath("//input[@id='year']");
    private String genderRadioButton = "//input[@name='gender']/following-sibling::span[text()='%s']";
    private By marketingCheckbox = By.xpath("//input[@name='marketing']/following-sibling::span[1]");
    private By thirdPartyCheckbox = By.xpath("//input[@name='thirdParty']");
    private By termsConditionsCheckbox = By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[9]/label/input");
    private By registerButton = By.xpath("//button[@type='submit']");
    private By emailErrorLabel = By.xpath("//div[contains(@class, 'InputErrorMessage')]/span[string-length(text())>0]");
    private String errorByEmail = "//div[contains(@class, 'InputErrorMessage')]/span[text()='Введите адрес электронной почты.']";
    private By errorLabel = By.xpath("//div[contains(@class, 'InputErrorMessage') and string-length(text()>0)]");
    private String errorByText = "//div[contains(@class, 'InputErrorMessage') and text()='%s']";

    public SignUpPage open() {
        Selenide.open("/");
        return this;
    }

    public SignUpPage typeEmail(String email){
        $(emailField).setValue(email);
        return this;
    }

    public SignUpPage typeConfirmEmailField(String email){
        $(confirmEmailField).setValue(email);
        return this;
    }

    public SignUpPage typePassword(String password){
        $(passwordField).setValue(password);
        return this;
    }

    public SignUpPage typeName(String name){
        $(nameField).setValue(name);
        return this;
    }

    public SignUpPage setMonth(String month){
        $(monthDropDown).selectOption(month);
        return this;
    }

    public SignUpPage typeDay(String day){
        $(dayField).setValue(day);
        return this;
    }

    public SignUpPage typeYear(String year){
        $(yearField).setValue(year);
        return this;
    }

    public SignUpPage setGender(String value){
        $(By.xpath(format(genderRadioButton, value))).click();
        return this;
    }

    public SignUpPage setMarketing(boolean value){
        $(marketingCheckbox).setSelected(value);
        return this;
    }

    public SignUpPage setThirdParty(boolean value){
        WebElement checkbox = $(thirdPartyCheckbox);
        if (!checkbox.isSelected() == value){
            checkbox.click();
        }
        return this;
    }

    public SignUpPage setConditions(boolean value){
        WebElement checkbox = $(termsConditionsCheckbox);
        if (!checkbox.isSelected() == value){
            checkbox.click();
        }
        return this;
    }

    public void clickSignUpButton(){
        $(registerButton).click();
    }

    public ElementsCollection getErrors(){
        return $$(errorLabel);
    }

    public String getErrorByNumber(int number){
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String message){
        return $$(By.xpath(format(errorByText, message))).size()>0
                && $$(By.xpath(format(errorByText, message))).get(0).isDisplayed();
    }

    public String getErrorByEmail(){
        return $(By.xpath(errorByEmail)).getText();
    }

    public boolean isEmailErrorVisible(String message){
        return $$(By.xpath(format(errorByEmail, message))).size()>0
                && $$(By.xpath(format(errorByEmail, message))).get(0).isDisplayed();
    }

    public void getScroll(){
        JavascriptExecutor jse = (JavascriptExecutor)getWebDriver();
        jse.executeScript("window.scrollBy(0, window.innerHeight)", "");
    }
}
