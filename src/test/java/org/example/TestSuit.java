package org.example;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{

    //homePage object created
    HomePage homePage = new HomePage();
    //registerPage object created
    RegisterPage registerPage = new RegisterPage();
    //registerResultPage object created
    RegisterResultPage registerResultPage = new RegisterResultPage();
    //categoriesPage object created
    CategoriesPage categoriesPage = new CategoriesPage();
    //loginPage object created
    LoginPage loginPage = new LoginPage();
    //emailResultPage object created
    EmailResultPage emailResultPage = new EmailResultPage();
    //homepage object created


    @Test(priority = 1)
    public void verifyUserShouldBeAbleToRegisterSuccessfully()
    {

        //click on register button
        homePage.clickOnRegisterButton();
        //check that user is on register page
        registerPage.verifyUserIsOnRegisterPage();
        //enter registration details
        registerPage.enterRegistrationInfo();
        //verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessFully();

    }


    @Test(priority = 2)
    public void verifyUserShouldLogIn()
    {
        //click on login button
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();

    }

    @Test(priority = 3)
    public void verifyRegisteredUserShouldReferProductToFriend()
    {
        //user should logged in
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //click on electronics option
        homePage.clickOnElectronicsButton();
        //click on camera and photo option
        categoriesPage.selectCameraAndPhotoImage();
        //click on digital camera option
        categoriesPage.selectDigitalCameraPhoto();
        //sending email to friend for referring
        categoriesPage.sendEmailToFriendForReferringProduct();
        //confirmation for successfully referring product
        emailResultPage.verifyUserSuccessfullyReferredProduct();

    }


}
