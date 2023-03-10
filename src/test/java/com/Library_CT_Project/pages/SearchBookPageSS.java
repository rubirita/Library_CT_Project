package com.Library_CT_Project.pages;

import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchBookPageSS {


    public SearchBookPageSS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="inputEmail")
    public WebElement emailAddress;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy( xpath = "//button[@type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBooks;


    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a")
    public  WebElement booksBtn;

    @FindBy(xpath = "//th")
    public List<WebElement> columnList;

    @FindBy(xpath = "//td")
    public List<WebElement> bookDataList;



}

