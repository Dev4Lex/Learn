import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typeConfirmEmailField(String email){
        driver.findElement(confirmEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeName(String name){
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage setMonth(String month){
        driver.findElement(monthDropDown).click();
        new WebDriverWait(driver,30).until(visibilityOfElementLocated(By.xpath(String.format(monthDropDownOption, month)))).click();
        return this;
    }

    public SignUpPage typeDay(String day){
        driver.findElement(dayField).sendKeys(day);
        return this;
    }

    public SignUpPage typeYear(String year){
        driver.findElement(yearField).sendKeys(year);
        return this;
    }

    public SignUpPage setGender(String value){
        driver.findElement(By.xpath(format(genderRadioButton, value))).click();
        return this;
    }

    public SignUpPage setMarketing(boolean value){
        WebElement checkbox = driver.findElement(marketingCheckbox);
        if (!checkbox.isSelected() == value){
            checkbox.click();
        }
        return this;
    }

    public SignUpPage setThirdParty(boolean value){
        WebElement checkbox = driver.findElement(thirdPartyCheckbox);
        if (!checkbox.isSelected() == value){
            checkbox.click();
        }
        return this;
    }

    public SignUpPage setConditions(boolean value){
        WebElement checkbox = driver.findElement(termsConditionsCheckbox);
        if (!checkbox.isSelected() == value){
            checkbox.click();
        }
        return this;
    }

    public void clickSignUpButton(){
        driver.findElement(registerButton).click();
    }

    public List<WebElement> getErrors(){
        return driver.findElements(errorLabel);
    }

    public String getErrorByNumber(int number){
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String message){
        return driver.findElements(By.xpath(format(errorByText, message))).size()>0
                && driver.findElements(By.xpath(format(errorByText, message))).get(0).isDisplayed();
    }

    public String getErrorByEmail(){
        return driver.findElement(By.xpath(errorByEmail)).getText();
    }

    public boolean isEmailErrorVisible(String message){
        return driver.findElements(By.xpath(format(errorByEmail, message))).size()>0
                && driver.findElements(By.xpath(format(errorByEmail, message))).get(0).isDisplayed();
    }

    public void getScroll(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, window.innerHeight)", "");
    }
}
