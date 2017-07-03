package theresatests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


/**
 * Created by theresa.neate on 3/07/2017.
 */

public class DriverInterrogationTest {

    static ChromeDriver driver = new ChromeDriver() ;
    String title;

    @BeforeClass
    public static void setupClass(){
        System.out.println("Before the class");
        driver.navigate().to("http://theresaneate.com");
    }

    @Before
    public void testString(){
        System.out.println("Before test");
    }

    @Test
    public void titleTest(){
        title = driver.getTitle();
        System.out.println("The driver title is: " + title);
    }


    @After
    public void afterTest(){
        System.out.println("After test"  + "\n");
    }

    @AfterClass
    public static void cleanUp(){
        System.out.println("After class cleanup");
    }
}
