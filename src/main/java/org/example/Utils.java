package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage {


    static String email = "test" + timeStamp() + "@gmail.com";
    static String password= "jacksmith@1278";
    public static String timeStamp() {

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;


    }
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public static void typeText(By by, String name) {
        driver.findElement(by).sendKeys(name);
    }
    public static String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }
    public static void waitForClickable(By by, int time) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForElementToDisappear(By by, int time) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf((WebElement) by));
    }
    public static void urlToBe(String by, int time) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(by));
    }

    public static void selectByText(By by, String text) {
        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByVisibleText(text);

    }


}
