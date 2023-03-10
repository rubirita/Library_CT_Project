package com.Library_CT_Project.pages;

import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarySearchPage {

    public LibrarySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement userLink;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//tr[@class=\"odd\"]/td[4]")
    public WebElement testsTable;







}
