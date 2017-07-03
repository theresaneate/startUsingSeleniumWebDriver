package theresatests;

/**
 * Created by theresa.neate on 2/05/2017.
 */

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExerciseTest {

    static WebDriver driver;
    static String name;

    private void internalMethod(){
        System.out.println("Current method is: " +name);
    }

    @BeforeClass
    public static void setupDriver(){
        driver = new ChromeDriver();
    }

    @Before
    public void testString(){
        System.out.println("Before test title: " + driver.getTitle());
    }

    @Test
    public void navigateToTest(){
        driver.navigate().to("http://www.google.com");
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }

    @Test
    public void navigateBackTest(){
        driver.navigate().to("http://theresaneate.com");
        driver.navigate().back();
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }

    @Test
    public void navigateForwardTest(){
        driver.navigate().to("http://theresaneate.com");
        driver.navigate().forward();
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }

    @Test
    public void navigateRefreshTest(){
        driver.navigate().refresh();
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }


    @After
    public void afterTest(){
        System.out.println("After test title: " + driver.getTitle() +"\n");
    }

    @AfterClass
    public static void cleanUp(){
        System.out.println("After class cleanup");
        driver.quit();
    }


}
