package com.project.QETest.steps;

import com.project.QETest.pageObjects.UserCreatesPageObject;
import net.thucydides.core.annotations.Step;

public class UserCreatesSteps {

    private UserCreatesPageObject userCreatesPageObject;

    @Step
    public void GoOnHomepage() {
        userCreatesPageObject.open();
    }

    public void OnClicksSignIn() {
        userCreatesPageObject.ClickSignIn();
    }

    public void EntersEmail(String strEmail) {
        userCreatesPageObject.EnterEmail(strEmail);
    }

    public void ClickCreateAnAccount() {
        userCreatesPageObject.CreateAnAccount();
    }


    public void FillsSignUpForm(String strGender, String strFirstname, String strLastname, String strPassword, String strDateofBirth, String strNewsletter, String strPartners, String strCompany, String strAddress, String strAddressII, String strCity, String strState, String strPostalCode, String strCountry, String strAdditInformation, String strHomePhone, String strMobilePhone, String strAddressAlias) {
        userCreatesPageObject.FillsSignUpForm(strGender,strFirstname,strLastname,strPassword,strDateofBirth,strNewsletter,strPartners,strCompany,strAddress,strAddressII,strCity,strState,strPostalCode,strCountry,strAdditInformation,strHomePhone,strMobilePhone,strAddressAlias);
    }

    public void ClickRegister() {
        userCreatesPageObject.ClickRegister();
    }

    public void IsTakenMyAccoubtPage(String strMjs) {
        userCreatesPageObject.IsTakenMyAccoubtPage(strMjs);
    }
}
