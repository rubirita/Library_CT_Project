package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.UserManagementPage;
import com.Library_CT_Project.utilities.BrowserUtils;
import com.Library_CT_Project.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US02_StepDefs{

    LoginPage loginPage = new LoginPage();

    UserManagementPage userPage = new UserManagementPage();


//    @Given("I am on the login page_AS")
//    public void i_am_on_the_login_page_as() {
//    }
    @Given("I login as a librarian_AS")
    public void i_login_as_a_librarian_as() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }
    @When("I click on \"Users\" link_AS")
    public void i_click_on_link_as() {userPage.usersButton.click();}
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(int defaultValue) {

        Select select = new Select(userPage.dropdownRecords);
        String defaultRecordAsText = select.getFirstSelectedOption().getText();

        int defaultRecordAsInt = Integer.parseInt(defaultRecordAsText);

        Assert.assertEquals(defaultRecordAsInt, defaultValue);
    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedRecords) {
        List<String> actualRecords= BrowserUtils.dropdownOptions_as_STRING(userPage.dropdownRecords);

        Assert.assertEquals(expectedRecords, actualRecords);
    }


}
