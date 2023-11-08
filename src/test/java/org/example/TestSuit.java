package org.example;

import net.bytebuddy.build.Plugin;
import org.testng.Assert;
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
    //newcomment page object created
    NewCommnetPage newCommnetPage = new NewCommnetPage();



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
    @Test
    public void printPrice(){
        //print prices of products on homepage
        homePage.productPrices();
    }

    @Test
    public void alertAcceptHomePageSearch()
    {
        //click on search button without entering anything to get alert popup
        homePage.clickOnSearchButton();
        //accept the alert popup
        driver.switchTo().alert().accept();
    }

    @Test
    public void clickOnVoteToConfirmAlertMessage()
    {
        //click on vote button at the bottom for popup
        homePage.clickOnVoteButton();
        //verify correct alert message
        homePage.verifyCorrectAlertMessage();

    }

    @Test
    public void currencyChangeToEuroDropDown()
    {

        homePage.productPrices();
        //product prices before selecting euro option
        homePage.clickOnEuroButtonFromDropDown();
        //select euro option from dropdown menu
        homePage.productPrices();
        //verify if currency changed to euro or not

    }

    @Test
    public void verifyAddCommentAtBottomInNopCommerceNewRelease()
    {
        //click on details button on news new release
        homePage.clickOnDetailsButtonOnNewsNewRelease();
        // add comment and verify it got added
        newCommnetPage.addCommentOnNewRelease();

    }


    @Test
    public void verifyProductNameStartWithCorrectSearchInput()
    {
        //enter nike in searchbox and click
        homePage.searchNikeOrAppleOnHomepage();
        //verify all product start with correct string

    }


}
