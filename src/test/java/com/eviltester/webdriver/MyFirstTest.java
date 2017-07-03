package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){


        /**  NOTE:
         * This test will work on
         *     - WebDriver 2.53.1
         *     - Firefox v < 48
         * And on
         *     - WebDriver 3
         *     - Firefox 48+
         *     - geckodriver.exe on the path
         */

        //the below recommendation came from http://stackoverflow.com/questions/38751525/firefox-browser-is-not-opening-with-selenium-webbrowser-code
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/geckodriver/0.11.1/bin/geckodriver");
        driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        System.out.println();
        driver.close();
        driver.quit();
    }
}
