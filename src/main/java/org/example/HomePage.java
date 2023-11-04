package org.example;

import org.openqa.selenium.By;

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


}
