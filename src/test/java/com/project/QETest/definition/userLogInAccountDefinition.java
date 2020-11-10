package com.project.QETest.definition;

import com.project.QETest.steps.UserLogInAccountSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class userLogInAccountDefinition {
    @Steps
    private UserLogInAccountSteps userLogInAccountSteps;

    @Given("^the user has a valid account$")
    public void the_user_has_a_valid_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.ValidateAccount();

    }

    @When("^the clicks on sign in$")
    public void the_clicks_on_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.ClickOnSignIn();

    }

    @When("^enters email \"([^\"]*)\"$")
    public void enters_email(String strEmail) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.EntersEmail(strEmail);

    }

    @When("^enters password \"([^\"]*)\"$")
    public void enters_password(String strPassWord) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.EntersPasswd(strPassWord);

    }

    @When("^clicks sign in$")
    public void clicks_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.ClickSignInAccount();

    }

    @Then("^the user is successfully logged in \"([^\"]*)\"$")
    public void the_user_is_successfully_logged_in(String strMjs) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        userLogInAccountSteps.IsSuccessfullyLoggedIn(strMjs);

    }
}
