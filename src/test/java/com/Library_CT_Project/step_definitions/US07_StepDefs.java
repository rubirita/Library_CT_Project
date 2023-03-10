package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.DashboardPage;
import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.utilities.BrowserUtils;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US07_StepDefs {

    LoginPage login_page = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map<String, String> loginCredentials) {

        login_page.emailAddress.sendKeys(loginCredentials.get("email"));
        login_page.password.sendKeys(loginCredentials.get("password"));
        login_page.submit.click();
    }

    @Given("I click on {string} module")
    public void i_click_on_module(String string) {
        dashboardPage.navigationBar(string);

    }

    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {
        WebElement addUsers = Driver.getDriver().findElement(By.xpath("//*[@id=\"users\"]/div[1]/div[1]/span/a"));
        addUsers.click();
    }


    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map<String, String> expectedPlaceholders) {

        BrowserUtils.sleep(3);
        List<WebElement> actualsList_as_WEBELEMENT = Driver.getDriver().findElements(By.xpath("//input[@class='form-control']"));
        List<String> actualPlaceholders_as_STRING = new ArrayList<>();


        for (WebElement each : actualsList_as_WEBELEMENT) {

            actualPlaceholders_as_STRING.add(each.getAttribute("placeholder"));
        }

        ArrayList<String> allExpectedNames = new ArrayList<String>(Arrays.asList("Full Name", "Email", "Password"));

        if (actualPlaceholders_as_STRING.containsAll(allExpectedNames)) {
            System.out.println("All placeholders are verified");
        } else {
            System.out.println("Failed");


        }



    }
}









