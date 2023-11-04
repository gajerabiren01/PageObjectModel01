package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailResultPage extends Utils
{

    //variable declared for expected email sent message
    String expectedEmailMessage = "Your message has been sent.";
    //verify confirmation about sent email to friend

    public void verifyUserSuccessfullyReferredProduct ()
    {
        //actual message is stored in the variable
        String actualMessageForReferringProduct = getTextFromElement(By.className("result"));
        //confirming if actual message is equal to expected message
        Assert.assertEquals(actualMessageForReferringProduct,expectedEmailMessage,"Product not referred");
    }

}
