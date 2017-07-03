package theresatests;

/**
 * Created by theresa.neate on 2/05/2017.
 */

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterrogateExerciseTest {

    static WebDriver driver;
    static String name;

    private void internalMethod(){
        System.out.println("Current method is: " +name);
    }

    @BeforeClass
    public static void setupDriver(){
        driver = new ChromeDriver();
        driver.navigate().to("http://theresaneate.com");
    }


    @Before
    public void testString(){
        System.out.println("Before test title: " + driver.getTitle());
    }

    @Test
    public void getTitleTest(){
        driver.getTitle();
        String output = driver.getCurrentUrl();
        System.out.println("Title is: " + output);
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }

    @Test
    public void getCurrentULRTest(){
        String output = driver.getCurrentUrl();
        System.out.println("Current URL is: " + output);
        name = new Object(){}.getClass().getEnclosingMethod().getName();
        internalMethod();
    }

    @Test
    public void getPageSourceTest(){
        String output = driver.getPageSource();
        System.out.println("Page source is: " + output);
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
