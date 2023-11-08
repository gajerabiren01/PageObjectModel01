package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Utils extends BasePage
{

    //variable email declared
    static String email = "test" + timeStamp() + "@gmail.com";
    //variable password declared
    static String password = "jacksmith@1278";

    //timestamp method created
    public static String timeStamp()
    {

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;


    }

    //capture screenshot of the test which fails
    public static void captureScreenshot(String screenShotName)
    {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("ScreenshotsTS\\" + screenShotName + timeStamp() + ".png"));
            System.out.println("Screenshot taken");
        } catch (
                IOException e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }
    }

    //click on element method created
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //enter text via type text method
    public static void typeText(By by, String name)
    {
        driver.findElement(by).sendKeys(name);
    }

    //get text from inside an element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //wait for certain element to appear before further code run
    public static void waitForClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //wait for element to disappear from DOM
    public static void waitForElementToDisappear(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf((WebElement) by));
    }
    //wait for correct url to appear
    public static void urlToBe(String by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(by));
    }
    //select an element by visible text
    public static void selectByText(By by, String text)
    {
        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByVisibleText(text);
    }

    //to get web elements from DOM and add them in array list
    public static void getArrayList(By by)
    {
            // prices arraylist created which stores web elements
            List<WebElement> prices = driver.findElements(by);
            //print size of prices web element
            System.out.println(prices.size());
            //empty array list productsprice created
            List<String> productsPrice = new ArrayList<>();
            //for each loop which goes through each element in prices array and retrive text and add them to productsprice arraylist
            for (WebElement price:prices){
                productsPrice.add(price.getText());
            }
            //printing out products price array
            System.out.println(productsPrice);

    }

    public static void verifyCommentAddedAtLastPosition(By by)
    {

        // prices arraylist created which stores web elements
        List<WebElement> prices = driver.findElements(by);
        //print size of prices web element
        System.out.println(prices.size());
        //empty array list productsprice created
        List<String> productsPrice = new ArrayList<>();
        //for each loop which goes through each element in prices array and retrive text and add them to productsprice arraylist
        for (WebElement price:prices){
            productsPrice.add(price.getText());
        }


        System.out.println("All Comments: "+productsPrice);
        String lastElement = productsPrice.get(productsPrice.size()-1);
        System.out.println("Last Comment: "+lastElement);
        if (lastElement.contains("Test working"))
        {
            System.out.println("comment added succesfully at last position");
        }

    }



    public static void getArrayListSize(By by)
    {
        List<WebElement> prices = driver.findElements(by);
        System.out.println(prices.size());
    }


}
