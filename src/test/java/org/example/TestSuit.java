package org.example;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    CategoriesPage categoriesPage = new CategoriesPage();

    LoginPage loginPage = new LoginPage();

    EmailResultPage emailResultPage = new EmailResultPage();


    @Test (priority = 1)
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){

        //click on register button
        homePage.clickOnRegisterButton();
        //check that user is on register page
        registerPage.verifyUserIsOnRegisterPage();
        //enter registration details
        registerPage.enterRegistrationInfo();
        //verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessFully();

    }


    @Test (priority = 2)
    public void verifyUserShouldLogIn(){


        //click on login button
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();

    }
@Test (priority = 3)
    public void UserReferringProductToFriend()

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
