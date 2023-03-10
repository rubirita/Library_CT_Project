package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.UserManagementPage;
import com.Library_CT_Project.utilities.ConfigurationReader;
import com.Library_CT_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US01_StepDefs {
    LoginPage loginPage = new LoginPage();
    UserManagementPage userPage = new UserManagementPage();
    @Given("I login as a librarian MT")
    public void i_login_as_a_librarian_mt() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }
    @When("I click  on {string} link MT")
    public void i_click_on_link_mt(String string) {
        userPage.usersButton.click();
    }
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {

        List<WebElement> idList = Driver.getDriver().findElements(By.xpath("//table[@id='tbl_users']//tr/td[2]"));

        Set set = new HashSet();
        for (WebElement element : idList) {
            set.add(element);
        }
        if (idList.size() == set.size()) {
           System.out.println("All users IDs are unique");
        } else {
            System.out.println("There is duplicate in IDs");

        }

    }
}
