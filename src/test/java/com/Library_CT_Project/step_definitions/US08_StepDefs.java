package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.BasePage;
import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.UserManagementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_StepDefs extends BasePage {

    LoginPage loginPage =new LoginPage();
    UserManagementPage userManagementPage = new UserManagementPage();

    @And("I log in using {string} and {string}")
    public void iLogInUsingAnd(String email, String password) {
        loginPage.login(email, password);
    }
    @Given("I click {string} Link")//I click "Users" Link
    public void i_click_link(String page) {
       navigateTo(page); //user in the Users page
    }

    @When("I search for {string}")
    public void iSearchFor(String ID) {

      userManagementPage.searchBox.sendKeys(ID);
    }

    @Then("Table should contain {string}, {string}, {string} data")
    public void tableShouldContainData(String expectedID, String expectedFullName, String expectedEmail) {

        String actualID = userManagementPage.accountHolderID.getText();
        Assert.assertEquals(expectedID,actualID);

        String actualFullName = userManagementPage.accountHolderFullName.getText();
        Assert.assertEquals(expectedFullName,actualFullName);

        String actualEmail = userManagementPage.accountHolderEmail.getText();
        Assert.assertEquals(expectedEmail,actualEmail);


    }



}
