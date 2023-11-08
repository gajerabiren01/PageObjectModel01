package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{

    public void enterLoginDetails()
    {
        //print email
        System.out.println("test20231105092616@gmail.com");
        //enter login credentials
        typeText(By.id("Email"), "test20231105092616@gmail.com");
        //enter password
        typeText(By.id("Password"), password);
        //click on login button
        clickOnElement(By.xpath("//button [contains(@class ,' login-button')]"));

    }

}
