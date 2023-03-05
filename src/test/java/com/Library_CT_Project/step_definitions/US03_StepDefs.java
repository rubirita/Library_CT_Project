package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.DashboardPage;
import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.UserManagementPage;
import com.Library_CT_Project.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage login_page = new LoginPage();
    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {}

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        login_page.login(ConfigurationReader.getProperty("librarian_email"),ConfigurationReader.getProperty("librarian_password"));
        //     login_page.emailAddress.sendKeys(ConfigurationReader.getProperty("librarian_email"));
        //   login_page.password.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        //   login_page.submit.click();
    }

    @Given("I click on {string} link")
    public void i_click_on_link(String link) {
        dashboardPage.navigationBar(link);
    }

    @When("I select Show {int} records")
    public void i_select_show_records(Integer number) {
        userManagementPage.selectNumberOfRecords(number);
    }

    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer chosenNumberFromFeature) {
        Assert.assertEquals(userManagementPage.chosenNumber(), Integer.toString(chosenNumberFromFeature));
    }

    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer int1) {
        Assert.assertEquals(userManagementPage.numbersOfRows.size(), (int) int1);
    }


}