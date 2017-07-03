package theresatests;

import org.junit.*;

import static org.hamcrest.CoreMatchers.*;


/**
 * Created by theresa.neate on 28/03/2017.
 */
public class firstpracJUnitTest {

    int a = 2;

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
        internalMethod();
    }

    @Test
    public void myFalseTest(){
        Assert.assertFalse(false);
        internalMethod();
    }

    @Test
    public void myEqualTest(){
        Assert.assertEquals(2, a=2);
        internalMethod();
    }

    @Test
    public void myAsserThatTest(){
        boolean variable = true;
        Assert.assertThat("variable is not true", !variable, is(not(true)));
        internalMethod();
    }

    private void internalMethod(){
        System.out.println("internal method text");
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
