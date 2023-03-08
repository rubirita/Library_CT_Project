package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LibrarySearchPage;
import com.Library_CT_Project.pages.LoginPage_US05;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US05_StepDefinitions {

    LoginPage_US05 LoginPage_US05 = new LoginPage_US05();

    @Given("I am on the login pageUS05")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get("https://library2.cydeo.com/login.html");

    }
    @Given("I login as a librarianUS05")
    public void i_login_as_a_librarian() {

        LoginPage_US05.emailAdress.sendKeys("librarian11@library");
        LoginPage_US05.password.sendKeys("libraryUser");
        LoginPage_US05.SignInButton.click();

    }

    LibrarySearchPage librarySearchPage = new LibrarySearchPage();
    @Given("I click on Users link")
    public void i_click_on_link() {

        librarySearchPage.userLink.click();

    }
    @When("i search for {string}")
    public void i_search_for(String str1) {

        librarySearchPage.searchBox.sendKeys(str1);

    }
    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with(String string) {

        String expected = string;
        Assert.assertTrue(librarySearchPage.testsTable.getText().contains(string));

    }


    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> tableColumns) {

        System.out.println("TableColumns" + tableColumns);

    }


}
