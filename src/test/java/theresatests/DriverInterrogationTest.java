package theresatests;

import org.junit.*;


/**
 * Created by theresa.neate on 3/07/2017.
 */
public class DriverInterrogationTest {

    @BeforeClass
    public static void setupClass(){
        System.out.println("Before the class");
    }

    @Before
    public void testString(){
        System.out.println("Before test");
    }

    @Test
    public void myTrueTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void myFalseTest(){
        Assert.assertFalse(false);


        @After
        public void afterTest(){
            System.out.println("After test"  + "\n");
        }

        @AfterClass
        public static void cleanUp(){
            System.out.println("After class cleanup");
        }
}
