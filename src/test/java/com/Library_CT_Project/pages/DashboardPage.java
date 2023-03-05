package com.Library_CT_Project.pages;

import com.Library_CT_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DashboardPage extends BasePage{


    public void navigationBar(String link){
        WebElement navigationBarLink = Driver.getDriver().findElement(By.xpath("//span[.='"+link+"']"));
        navigationBarLink.click();
    }
}
