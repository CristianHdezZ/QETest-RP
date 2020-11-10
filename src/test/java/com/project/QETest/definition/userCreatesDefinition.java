package com.project.QETest.definition;

import com.project.QETest.steps.UserCreatesSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class userCreatesDefinition {

    @Steps
    private UserCreatesSteps userCreatesSteps;

    @Given("^The user is on Homepage$")
    public void the_user_is_on_Homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.GoOnHomepage();
    }

    @When("^the user clicks on Sign in$")
    public void the_user_clicks_on_Sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.OnClicksSignIn();
    }

    @When("^user enters email \"([^\"]*)\"$")
    public void user_enters_email(String strEmail) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.EntersEmail(strEmail);
    }

    @When("^User Clicks create an account$")
    public void user_Clicks_create_an_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.ClickCreateAnAccount();
    }

    @When("^User fills sign up form \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_fills_sign_up_form(String strGender,
                                        String strFirstname,
                                        String strLastname,
                                        String strPassword,
                                        String strDateofBirth,
                                        String strNewsletter,
                                        String strPartners,
                                        String strCompany,
                                        String strAddress,
                                        String strAddressII,
                                        String strCity,
                                        String strState,
                                        String strPostalCode,
                                        String strCountry,
                                        String strAdditInformation,
                                        String strHomePhone,
                                        String strMobilePhone,
                                        String strAddressAlias) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.FillsSignUpForm(strGender,strFirstname,strLastname,strPassword,strDateofBirth,strNewsletter,strPartners,strCompany,strAddress,strAddressII,strCity,strState,strPostalCode,strCountry,strAdditInformation,strHomePhone,strMobilePhone,strAddressAlias);
    }

    @When("^user clicks register$")
    public void user_clicks_register() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.ClickRegister();
    }

    @Then("^the user is taken my account page \"([^\"]*)\"$")
    public void the_user_is_taken_my_account_page(String strMjs) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userCreatesSteps.IsTakenMyAccoubtPage(strMjs);
    }

}
