package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{

    //expected registration message saved in a variable
    String expectedRegistrationMessage = "Your registration completed";

    //verify is user is registered successfully
    public void verifyUserRegisteredSuccessFully()
    {
        //storing actual registration message in variable
        String actualRegistrationMessage = getTextFromElement(By.className("result"));
        //comparing actual registration message with expected registration method
        Assert.assertEquals(actualRegistrationMessage, expectedRegistrationMessage, "Your registration is not completed");
    }


}
