package com.Library_CT_Project.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserManagementPage extends BasePage {

    @FindBy(name = "tbl_users_length")
    public WebElement dropdownRecords;


    @FindBy(xpath = "//a[.=' Edit User']/../..")
    public List<WebElement> numbersOfRows;


    public String chosenNumber() {
        Select select = new Select(dropdownRecords);
        return select.getFirstSelectedOption().getText();
    }

    public void selectNumberOfRecords(int numberOfRecords) {
        Select select = new Select(dropdownRecords);
        select.selectByValue(Integer.toString(numberOfRecords));
    }


}