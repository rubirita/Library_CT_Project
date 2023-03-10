package com.Library_CT_Project.pages;


import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "span.title-level-1")
    public List<WebElement> libraryButton;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    //Library project - some located web elements: dashboardButton, User/Books Button

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public List<WebElement> libraryMain;


    @FindBy(xpath = "//span[text()='Dashboard']")
    protected WebElement dashboardButton;

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement usersButton;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksButton;

    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logOutButton;

    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='" + page + "']"));
        linkToPage.click();
    }
}
