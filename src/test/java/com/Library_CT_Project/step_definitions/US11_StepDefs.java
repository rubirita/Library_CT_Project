package com.Library_CT_Project.step_definitions;


import com.Library_CT_Project.pages.BasePage;
import com.Library_CT_Project.pages.DashboardPageAbdul;
import com.Library_CT_Project.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US11_StepDefs {

    LoginPage loginPage = new LoginPage();

  //  BasePage basePage = new BasePage(); abstract class and cant be instantiated
  DashboardPageAbdul dashboardPageAbdul = new DashboardPageAbdul();



    @When("I login using {string} and “libraryUser")
    public void i_login_using_and_library_user(String string) {
        loginPage.emailAddress.sendKeys(string);
        loginPage.password.sendKeys("libraryUser");
        loginPage.submit.click();

    }


    @Then("dashboard page should be displayed")
    public void dashboard_page_should_be_displayed() {
      dashboardPageAbdul.Dashboard.isDisplayed();

    }
/*
    @When("I login using {string} and “libraryUser” NA")
    public void i_login_using_and_library_user_na(String keyword) {
        loginPage.emailAddress.sendKeys(keyword);
        loginPage.password.sendKeys("libraryUser");
        loginPage.submit.click();

    }

 */

    @When("I login using {string} and {string} NA")
    public void iLoginUsingAndNA(String userName, String password) {
        loginPage.emailAddress.sendKeys(userName);
        loginPage.password.sendKeys(password);
        loginPage.submit.click();
    }

    @Then("books page should be displayed")
    public void books_page_should_be_displayed() {
        //  dashboardPageAbdul.Dashboard.isDisplayed();
        dashboardPageAbdul.booksButton.isDisplayed();

    }



}
