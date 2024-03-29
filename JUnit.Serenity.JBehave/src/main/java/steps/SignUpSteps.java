package steps;

import net.thucydides.core.annotations.Step;
import pages.SignUpPage;

public class SignUpSteps {
    SignUpPage page;

    @Step
    public void open_signup_page(){
        page.open();
    }

    @Step("User types email [0]")
    public void type_email(String mail) {
        page.typeEmail(mail);
    }

    @Step
    public void type_confirmation_email(String mail) {
        page.typeConfirmEmailField(mail);
    }

    @Step
    public void type_password(String password) {
        page.typeConfirmEmailField(password);
    }

    @Step
    public void type_name(String name) {
        page.typeName(name);
    }

    @Step
    public void set_month(String month) {
        page.setMonth(month);
    }

    @Step
    public void set_day(String day) {
        page.typeDay(day);
    }

    @Step
    public void set_year(String year) {
        page.typeYear(year);
    }

    @Step
    public void set_gender(String gender) {
        page.setGender(gender);
    }

    @Step
    public void set_marketing(boolean value) {
        page.setMarketing(value);
    }

    @Step
    public void click_signup() {
        page.clickSignUpButton();
    }

}
