package coins;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class CoinsTest {

    @Test
    public void test() {
        Exchange exchange = new Exchange();

        Converter<Integer, Integer> converter=exchange::exchangeWithMinimalNumberOfCoins;

        Assert.assertEquals("Exchange number: 1", new Integer(1), converter.convert(1));
        Assert.assertEquals("Exchange number: 2", new Integer(1), converter.convert(2));
        Assert.assertEquals("Exchange number: 5", new Integer(1), converter.convert(5));
        Assert.assertEquals("Exchange number: 10", new Integer(1), converter.convert(10));
        Assert.assertEquals("Exchange number: 20", new Integer(1), converter.convert(20));
        Assert.assertEquals("Exchange number: 50", new Integer(1), converter.convert(50));
        Assert.assertEquals("Exchange number: 100", new Integer(1), converter.convert(100));
        Assert.assertEquals("Exchange number: 200", new Integer(1), converter.convert(200));

        Assert.assertEquals("Exchange number: 8", new Integer(3), converter.convert(8));
        Assert.assertEquals("Exchange number: 11", new Integer(2), converter.convert(11));
        Assert.assertEquals("Exchange number: 207", new Integer(3), converter.convert(207));
        Assert.assertEquals("Exchange number: 208", new Integer(4), converter.convert(208));

    }
}
