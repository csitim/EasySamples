package datehandling;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class DateHandlerTest {

    @Test
    public void whatTimeIsItTest() {
        DateHandler dateHandler = new DateHandler();
        Assert.assertEquals("Wrong time conversion!", new String("05:33:20"), dateHandler.whatTimeIsIt(20000));
    }

    @Test
    public void isAfternoonTest() {
        DateHandler dateHandler = new DateHandler();
        Assert.assertEquals("After noon", true, dateHandler.isAfternoon(LocalDate.now(), 20000));
    }

    @Test
    public void isNorAfternoonTest() {
        DateHandler dateHandler = new DateHandler();
        Assert.assertEquals("Before noon", false, dateHandler.isAfternoon(LocalDate.now(), 200));
    }
}
