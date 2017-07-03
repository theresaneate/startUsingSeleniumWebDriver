package theresatests;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by theresa.neate on 21/03/2017.
 */

public class myfirstJunitTest {

    @Test
    public void shouldresultinFour(){
        Assert.assertEquals("2+2=4", 4, 2+2);
    }
}
