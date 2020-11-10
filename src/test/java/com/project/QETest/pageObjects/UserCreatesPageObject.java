package com.project.QETest.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://automationpractice.com/")
public class UserCreatesPageObject extends PageObject {

    String [] arrDateofBirth;
   // Actions action = new Actions(getDriver());

    //Sign In
    //@FindBy(xpath = "//*/div/a[contains(text(),'Sign in')]")
    @FindBy(how = How.XPATH,using = "//*/div/a[contains(text(),'Sign in')]")
    public WebElementFacade btnSignIn;

    //Enters Email
    //@FindBy(id="//*[@id='email_create']")
    @FindBy(how = How.ID,using = "email_create")
    public WebElementFacade txtEmail;

    //Click Create an Account
    @FindBy(how = How.ID,using = "SubmitCreate")
    public WebElementFacade btnCreateAccount;

    //Sign up form
    @FindBy(how = How.ID,using = "id_gender1")
    public WebElementFacade checkGenderMale;

    @FindBy(how = How.ID,using = "id_gender2")
    public WebElementFacade checkGenderFemale;

    @FindBy(how = How.ID,using = "customer_firstname")
    public WebElementFacade txtFirstName;

    @FindBy(how = How.ID,using = "customer_lastname")
    public WebElementFacade txtLastName;

    @FindBy(how = How.ID,using = "passwd")
    public WebElementFacade txtPassWd;

    @FindBy(how = How.XPATH,using = "//*[@id='days']/option")
    public List<WebElementFacade> listDays;

    @FindBy(how = How.XPATH,using = "//*[@id='months']/option")
    public List<WebElementFacade> listMonths;

    @FindBy(how = How.XPATH,using = "//*[@id='years']/option")
    public List<WebElementFacade> listYears;

    @FindBy(how = How.ID,using = "firstname")
    public WebElementFacade txtFirstnameII;

    @FindBy(how = How.ID,using = "lastname")
    public WebElementFacade txtLastNameII;

    @FindBy(how = How.ID,using = "company")
    public WebElementFacade txtCompany;

    @FindBy(how = How.ID,using = "address1")
    public WebElementFacade txtAddress1;

    @FindBy(how = How.ID,using = "address2")
    public WebElementFacade txtAddress2;

    @FindBy(how = How.ID,using = "city")
    public WebElementFacade txtCity;

    @FindBy(how = How.XPATH,using = "//*[@id='id_state']/option")
    public List<WebElementFacade> listState;

    @FindBy(how = How.ID,using = "postcode")
    public WebElementFacade txtPostCode;

    @FindBy(how = How.XPATH,using = "//*[@id='id_country']/option")
    public List<WebElementFacade> listCountry;

    @FindBy(how = How.ID,using = "other")
    public WebElementFacade txtOther;

    @FindBy(how = How.ID,using = "phone")
    public WebElementFacade txtPhone;

    @FindBy(how = How.ID,using = "phone_mobile")
    public WebElementFacade txtPhoneMobile;

    @FindBy(how = How.ID,using = "alias")
    public WebElementFacade txtAddressAlias;

    @FindBy(how = How.ID,using = "submitAccount")
    public WebElementFacade btnSubmitAccount;

    @FindBy(how = How.XPATH,using = "//*[@id='center_column']/h1")
    public WebElementFacade labelMyAccount;

    @FindBy(how = How.XPATH,using = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    public WebElementFacade btnSignOut;



    public void ClickSignIn() {
        btnSignIn.click();
    }

    public void EnterEmail(String strEmail) {
        txtEmail.sendKeys(strEmail);
    }

    public void CreateAnAccount() {
        btnCreateAccount.click();
    }

    public void FillsSignUpForm(String strGender, String strFirstname, String strLastname, String strPassword, String strDateofBirth, String strNewsletter, String strPartners, String strCompany, String strAddress, String strAddressII, String strCity, String strState, String strPostalCode, String strCountry, String strAdditInformation, String strHomePhone, String strMobilePhone, String strAddressAlias) {

        //Select of Gender
        if ("Mr.".equals(strGender))checkGenderMale.click();
        else if ("Mrs.".equals(strGender))checkGenderFemale.click();

        //Insert text
        txtFirstName.sendKeys(strFirstname);
        txtLastName.sendKeys(strLastname);
        txtPassWd.sendKeys(strPassword);

        //Select Date of Birth
        arrDateofBirth = strDateofBirth.split("-");
        SelecionarLista(listDays,arrDateofBirth[0]);
        SelecionarLista(listMonths,arrDateofBirth[1]);
        SelecionarLista(listYears,arrDateofBirth[2]);

        //Select checkbox
        if ("yes".equalsIgnoreCase(strNewsletter.trim()))getDriver().findElement(By.xpath("//*/input[contains(@id, 'newsletter')][@type='checkbox']")).click();
        if ("yes".equalsIgnoreCase(strPartners.trim()))getDriver().findElement(By.xpath("//*/input[contains(@id, 'optin')][@type='checkbox']")).click();

        //Insert text
        txtFirstnameII.sendKeys(strFirstname);
        txtLastNameII.sendKeys(strLastname);
        txtCompany.sendKeys(strCompany);
        txtAddress1.sendKeys(strAddress);
        txtAddress2.sendKeys(strAddressII);
        txtCity.sendKeys(strCity);
        SelecionarLista(listState,strState);
        txtPostCode.sendKeys(strPostalCode);
        SelecionarLista(listCountry,strCountry);
        txtOther.sendKeys(strAdditInformation);
        txtPhone.sendKeys(strHomePhone);
        txtPhoneMobile.sendKeys(strMobilePhone);
        txtAddressAlias.sendKeys(strAddressAlias);
    }

    public void ClickRegister() {
        btnSubmitAccount.click();

    }

    public void IsTakenMyAccoubtPage(String strMjs) {
        String strMyAccount = labelMyAccount.getText();
        assertThat(strMyAccount,containsString(strMjs));
        btnSignOut.click();
        //waitFor(30).seconds();
    }


    public void SelecionarLista(List<WebElementFacade> listaWebElementFacade, String strOption){
        Actions action = new Actions(getDriver());
        for(int i=0;i<listaWebElementFacade.size();i++){
            if (strOption.trim().equals(listaWebElementFacade.get(i).getText().trim())){
                action.moveToElement(listaWebElementFacade.get(i)).click().perform();
                listaWebElementFacade.get(i).click();
            }
        }
    }



}
