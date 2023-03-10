package com.Library_CT_Project.step_definitions;

import com.Library_CT_Project.pages.LoginPage;
import com.Library_CT_Project.pages.SearchBookPageSS;
import com.Library_CT_Project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US09_StepDefs {

    LoginPage loginPage = new LoginPage();
    SearchBookPageSS searchBookPageSS = new SearchBookPageSS();



    @When("I navigate to {string} page")
    public void iNavigateToPage(String Books) {
        searchBookPageSS.booksBtn.click();
      //  System.out.println("2nd step");

    }

    @And("I search for the {string}")
    public void iSearchForThe(String nameOfBook) {

        searchBookPageSS.searchBooks.sendKeys(nameOfBook);
        BrowserUtils.sleep(1);
        searchBookPageSS.searchBooks.click();
       // System.out.println("3rd step");
    }

    @Then("books table should contain results matching The Goldfinch")
    public void booksTableShouldContainResultsMatchingTheGoldfinch(Map<String, String> expected) {

        Map<String, String> actual = new HashMap<>();

        BrowserUtils.sleep(1);

        for (int i = 1; i < searchBookPageSS.columnList.size()-1; i++) {
            actual.put(searchBookPageSS.columnList.get(i).getText(), searchBookPageSS.bookDataList.get(i).getText());
        }

     //   System.out.println("actual = " + actual);
       // System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);



      //  System.out.println("4th step");
      //  String actualBook = searchBookPageSS.searchBooks.getText();
      //  String expectedBook = "The Goldfinch";
      //  System.out.println("actualBook" + actualBook);
      //  System.out.println("expectedBook " + expectedBook);
//        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(searchBookPageSS.searchBooks);
//        System.out.println(actualOptions);
//      Assert.assertEquals(actualBook, expectedBook);

    }

}

