package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String userName, String password) {

        loginPage.login(userName, password);

    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedName) {


        String actualName = loginPage.nameOfUser.getText();
        Assert.assertEquals(actualName, expectedName);

        System.out.println(actualName);
        System.out.println(expectedName);


    }


    @Then("account holder name is librarian should be {string}")
    public void accountHolderNameIsLibrarianShouldBe(String librarianName) {

        String actualLibrarianName = loginPage.nameofLibrarian.getText();
        Assert.assertEquals(actualLibrarianName, librarianName);
    }
}



