package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager extends Utils {


    String browserName = "chrome";

    //open browser method
    public void openBrowser() {

        //if else block for selecting browser
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name entered :" + browserName);
        }

        //for making browser full screen
        driver.manage().window().fullscreen();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for opening website
        driver.get("https://demo.nopcommerce.com/");
    }

    //close browser method
    public void closeBrowser() {

        //closes the currently focused window
        driver.close();
    }


}
