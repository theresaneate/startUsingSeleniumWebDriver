package theresatests;

/**
 * Created by theresa.neate on 18/04/2017.
 */



import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationExampleTest {

    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
        driver.navigate().to("http://google.com");

    }

    @Test
    public void navigateWithNavigateTo(){

        //driver.navigate().to("http://google.com");
        assertTrue(driver.getTitle().startsWith("Google"));

    }

    @Test
    public void navigateWithGet(){

        driver.get("http://realestate.com.au");
        assertTrue(driver.getTitle().contains("Real"));

    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }


}
