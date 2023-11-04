package org.example;

import org.openqa.selenium.By;

public class CategoriesPage extends Utils

{

    // selecting camera and photo option from category page
    public void selectCameraAndPhotoImage()
    {
        // click on camera and photo
        clickOnElement(By.xpath("//img[@alt='Picture for category Camera & photo']"));
    }
    // selecting digital camera option
    public void selectDigitalCameraPhoto()
    {
        // click on digital camera photo
        clickOnElement(By.xpath("//div[@class='picture']/a[@href='/leica-t-mirrorless-digital-camera']"));
    }

    //Referring product to friend method
    public void sendEmailToFriendForReferringProduct()
    {
        // click on send email button
        clickOnElement(By.xpath("//div[@class='email-a-friend']/button"));
        // type friend email
        typeText(By.id("FriendEmail"),"hello567@gmail.com");
        // enter message to a friend in textarea
        typeText(By.id("PersonalMessage"),"Hello my friend check this product on demo ecommerce website it is at very affordable price");
        // click on send email button
        clickOnElement(By.xpath("//button[@name=\"send-email\"]"));
    }

}
