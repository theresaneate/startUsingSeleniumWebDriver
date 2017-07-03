package theresatests;

import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class MyFirstTestREA {

    @Test
    public void driverIsKing() {

        WebDriver driver = new HtmlUnitDriver(false);

        driver.get("http://www.google.com.au");

        assertTrue(driver.getTitle().startsWith("Google"));

    }

    @Test

    public void firefoxIsTheDriver() {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com.au");

        assertTrue(driver.getTitle().startsWith("Google"));

        //driver.close();

        driver.quit();

    }

}
