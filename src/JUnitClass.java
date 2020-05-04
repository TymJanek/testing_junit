//class that checks if 2.5 + 3.5 equals 6 (test for exercise 1)

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitClass {

    @Test
    public void check(){
        double var1 = 2.5;
        double var2 = 3.5;
        double result = var1 + var2;
        assertEquals(6, result, 0);
    }

}
