package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.*;
import com.Library_CT_Project.utilities.ConfigurationReader;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDefinitions extends BasePage {
    @Given("I am on the login page YM")
    public void i_am_on_the_login_page_ym() {
    }

    LoginPage loginPage = new LoginPage();


    @Given("I login as a librarian YM")
    public void i_login_as_a_librarian_ym() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }

    @When("I click on Users module")
    public void i_click_on_users_module() {
        usersButton.click();
    }

    @Then("Users page should be displayed")
    public void users_page_should_be_displayed() {
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains("users"));

    }

    @When("I click on Books module")
    public void i_click_on_books_module() {
        booksButton.click();
    }

    @Then("Books page should be displayed")
    public void books_page_should_be_displayed() {
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains("books"));
    }

    @When("I click on Dashboard link YM")
    public void i_click_on_dashboard_link_ym() {
        dashboardButton.click();
    }

    @Then("Dashboard page should be displayed")
    public void dashboard_page_should_be_displayed() {
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
    }


}
