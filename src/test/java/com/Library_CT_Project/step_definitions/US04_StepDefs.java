package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.*;
import com.Library_CT_Project.utilities.ConfigurationReader;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US04_StepDefs {

    UserManagementPage userManagementPage = new UserManagementPage();
    DashboardPage dashboardPage = new DashboardPage();

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page NO")
    public void i_am_on_the_login_page_no() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Given("I login as a librarian NO")
    public void i_login_as_a_librarian_no() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }


    @Given("I click on {string} link NO")
    public void i_click_on_link_no(String string) {
        dashboardPage.navigationBar(string);

    }

    @When("I select Show {int} record")
    public void i_select_show_record(Integer count) {
        userManagementPage.selectNumberOfRecords(count);


    }


    @Then("show record value should be {int}")
    public void show_record_value_should_be(Integer count) {
        userManagementPage.selectNumberOfRecords(count);


    }

    @Then("the users table must display {int} record")
    public void the_users_table_must_display_record(Integer count) {
        Assert.assertEquals(userManagementPage.chosenNumber(), Integer.toString(count));

    }


}
