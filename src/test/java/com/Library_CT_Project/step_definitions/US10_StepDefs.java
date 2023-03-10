package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.DashboardPageSG;
import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US10_StepDefs {

    LoginPage loginPage=new LoginPage();
    DashboardPageSG dashboardPageSA=new DashboardPageSG();






    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        loginPage.emailAddress.sendKeys(username);

    }

    @And("I enter password libraryUser")
    public void iEnterPasswordLibraryUser() {
        loginPage.password.sendKeys("libraryUser");
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.submit.click();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {


        dashboardPageSA.Dashboard.isDisplayed();



    }





}
