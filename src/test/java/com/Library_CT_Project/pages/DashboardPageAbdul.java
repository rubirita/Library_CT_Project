package com.Library_CT_Project.pages;

import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageAbdul {


    public DashboardPageAbdul(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Books']")
    public WebElement bookPage;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksButton;






}
