package com.Library_CT_Project.pages;

import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_US05 {

    public LoginPage_US05(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id ="inputEmail")
    public WebElement emailAdress;

    @FindBy (id ="inputPassword")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement SignInButton;





}
