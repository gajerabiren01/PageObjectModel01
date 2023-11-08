package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utils {

    // click on register button
    public void clickOnRegisterButton()
    {
        clickOnElement(By.className("ico-register"));
    }

    // click on login button
    public void clickOnLoginButton()
    {
        clickOnElement(By.className("ico-login"));
    }

    // click on electronics button
    public void clickOnElectronicsButton()
    {
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[contains(@class,'notmobile')]/li/a[@href='/electronics']"));
    }

    public void productPrices()
    {
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='prices']/span"));
        System.out.println(prices.size());
        List<String> productsPrice = new ArrayList<>();
        for (WebElement price:prices){
//            System.out.println();
            productsPrice.add(price.getText());
        }
        System.out.println(productsPrice);
    }

    public void clickOnSearchButton()
    {
        clickOnElement(By.xpath("//form[@id='small-search-box-form']/button"));
    }

    public void verifyCorrectAlertMessage()
    {
        //get the answer in popup for verifying text
        String actualAlertText = driver.switchTo().alert().getText();
        //expected alert message
        String expectedAlertText = "Please select an answer";
        //print alert message
        System.out.println(actualAlertText);
        //verify alert message
        Assert.assertEquals(actualAlertText,expectedAlertText,"Alert message in not correct");
    }

    //click on vote button
    public void clickOnVoteButton()
    {
        //click on vote button on homepage
        clickOnElement(By.id("vote-poll-1"));
    }


    public void clickOnEuroButtonFromDropDown()
    {
        //click on dropdown menu
        clickOnElement(By.id("customerCurrency"));
        //select euro from given option
        clickOnElement(By.xpath("//option[text()='Euro']"));

    }

    public void clickOnDetailsButtonOnNewsNewRelease()
    {
        //click on details button at bottom in nop commerce new release
        clickOnElement(By.xpath("//div[@class='buttons']/a[@href=\"/nopcommerce-new-release\"]"));


    }


    public void searchNikeOrAppleOnHomepage()
    {
        //type nike on search
        typeText(By.id("small-searchterms"),"Nike");
        //click on search button
        clickOnElement(By.xpath("//form[@id='small-search-box-form']/button[@type=\"submit\"]"));
        //verify product name start with correct letters
        getArrayList(By.xpath("//h2[@class='product-title']"));

    }




}
