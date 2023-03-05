package com.Library_CT_Project.pages;


import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="inputEmail")
    public WebElement emailAddress;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy( xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "(//span)[6]")
    public WebElement nameOfUser;

    @FindBy(xpath = "(//span)[8]")
    public WebElement nameofLibrarian;


    public void login(String emailStr, String passwordStr) {
        emailAddress.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        submit.click();

    }

}
