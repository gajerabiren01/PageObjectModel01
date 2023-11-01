package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils{

    public  void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
    }

    public  void closeBrowser() {

        driver.close();  //closes the currently focused window/
    }


}
