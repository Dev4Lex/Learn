package steps;

import net.thucydides.core.annotations.Step;
import pages.SignUpPage;

public class SignUpSteps {
    SignUpPage page;

    @Step("User types email (0)")
    public void type_email(String mail) {
        page.typeEmail(mail);
    }

    @Step
    public void type_confirmation_email(String mail) {
        page.typeConfirmEmailField(mail);
    }

    @Step
    public void type_password(String password) {
        page.typePassword(password);
    }

    @Step
    public void type_name(String name) {
        page.typePassword(name);
    }

    @Step
    public void type_month(String month){
        page.setMonth(month);
    }

    @Step
    public void type_day(String day){
        page.setMonth(day);
    }

    @Step
    public void type_year(String year){
        page.setMonth(year);
    }

    @Step
    public void select_gender(String gender) {
        page.setGender(gender);
    }

    @Step
    public void select_marketing() {
        page.setMarketing();
    }

    @Step
    public void click_signup(){
        page.clickSignUpButton();
    }


}
