package primefactors;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class PrimeFactorsTest {

    @Test
    public void test() {

        PrimeFactorResolution primeFactorResulotion = new PrimeFactorResolution();

        Assert.assertEquals("Number: -16", 4, primeFactorResulotion.resolveWith2(-16));
        Assert.assertEquals("Number: -10", 1, primeFactorResulotion.resolveWith2(-10));
        Assert.assertEquals("Number: -9", 0, primeFactorResulotion.resolveWith2(-9));
        Assert.assertEquals("Number: 0", 0, primeFactorResulotion.resolveWith2(0));
        Assert.assertEquals("Number: 1", 0, primeFactorResulotion.resolveWith2(1));
        Assert.assertEquals("Number: 2", 1, primeFactorResulotion.resolveWith2(2));
        Assert.assertEquals("Number: 3", 0, primeFactorResulotion.resolveWith2(3));
        Assert.assertEquals("Number: 4", 2, primeFactorResulotion.resolveWith2(4));
        Assert.assertEquals("Number: 5", 0, primeFactorResulotion.resolveWith2(5));
        Assert.assertEquals("Number: 6", 1, primeFactorResulotion.resolveWith2(6));
        Assert.assertEquals("Number: 7", 0, primeFactorResulotion.resolveWith2(7));
        Assert.assertEquals("Number: 8", 3, primeFactorResulotion.resolveWith2(8));
        Assert.assertEquals("Number: 16", 4, primeFactorResulotion.resolveWith2(16));


    }
}
