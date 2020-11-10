package com.project.QETest.steps;

import com.project.QETest.pageObjects.UserLogInAccountPageObject;
import net.thucydides.core.annotations.Step;

public class UserLogInAccountSteps {

    private UserLogInAccountPageObject userLogInAccountPageObject;

    @Step
    public void ValidateAccount() {
        userLogInAccountPageObject.open();

    }

    public void ClickOnSignIn() {
        userLogInAccountPageObject.ClickSignIn();
    }

    public void EntersEmail(String strEmail) {
        userLogInAccountPageObject.EntersEmail(strEmail);
    }

    public void EntersPasswd(String strPassWord) {
        userLogInAccountPageObject.EntersPasswd(strPassWord);
    }

    public void ClickSignInAccount() {
        userLogInAccountPageObject.ClickSignInAccount();
    }

    public void IsSuccessfullyLoggedIn(String strMjs) {
        userLogInAccountPageObject.IsSuccessfullyLoggedIn(strMjs);
    }
}
