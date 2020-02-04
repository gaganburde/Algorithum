
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

   @Test
    void revereseString() {

        String actualString="GAGAN";
       String expectedString="NAGAG";
         Utility instance= new Utility();
       String result=instance.RevereseString(actualString);
        assertEquals(expectedString,result);
    }

    @Test
    void revereseStringFailed() {

        String actualString="GAGAN";
        String expectedString="GAGAN";
        Utility instance= new Utility();
        String result=instance.RevereseString(actualString);
        assertNotEquals(expectedString,result);
    }
}