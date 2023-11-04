package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends Utils
{

    // verify if user is on register page
    public void verifyUserIsOnRegisterPage()
    {
        //confirm if user is on correct url
        Assert.assertTrue(driver.getCurrentUrl().contains(("register")));

    }


    //enter registration details
    public void enterRegistrationInfo()
    {
        // wait for button to appear
        waitForClickable(By.id("register-button"), 10);
        // enter first name
        typeText(By.id("FirstName"), "FirstName");
        // enter last name
        typeText(By.id("LastName"), "Patel");
        //select birthday
        selectByText(By.name("DateOfBirthDay"),"15");
        //select birth month
        selectByText(By.name("DateOfBirthMonth"),"July");
        // select birth year
        selectByText(By.name("DateOfBirthYear"),"2000");
        //print email
        System.out.println(email);
        // type email
        typeText(By.id("Email"),email );
        // company name
        typeText(By.id("Company"), "Hello");
        // enter password
        typeText(By.name("Password"), password);
        // enter confirm password
        typeText(By.id("ConfirmPassword"), password);
        // click on register button
        clickOnElement(By.name("register-button"));


    }

}
