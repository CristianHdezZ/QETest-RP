package com.project.QETest.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://automationpractice.com/")
public class UserLogInAccountPageObject extends PageObject {

    @FindBy(how = How.XPATH,using = "//*/div/a[contains(text(),'Sign in')]")
    public WebElementFacade btnSignIn;

    @FindBy(how = How.ID,using = "email")
    public WebElementFacade txtEmail;

    @FindBy(how = How.ID,using = "passwd")
    public WebElementFacade txtPasswd;

    @FindBy(how = How.ID,using = "SubmitLogin")
    public WebElementFacade btnSubmitLogin;

    @FindBy(how = How.XPATH,using = "//*[@id='center_column']/h1")
    public WebElementFacade labelMyAccount;

    public void ClickSignIn() {
        btnSignIn.click();
    }

    public void EntersEmail(String strEmail) {
        txtEmail.sendKeys(strEmail);
    }

    public void EntersPasswd(String strPassWord) {
        txtPasswd.sendKeys(strPassWord);
    }

    public void ClickSignInAccount() {
        btnSubmitLogin.click();
    }

    public void IsSuccessfullyLoggedIn(String strMjs) {
        String strMyAccount = labelMyAccount.getText();
        assertThat(strMyAccount,containsString(strMjs));
    }
}
