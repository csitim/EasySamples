package biggestdiff;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class BiggestDiffTest {

    @Test
    public void testBiggestDiffWithOneElement() {

        int[] array = new int[1];
        array[0] = 10;

        DiffCalculator calculator = new DiffCalculator();
        int biggestDiff = calculator.calculateBiggestDiff(array);

        Assert.assertEquals("", 0, biggestDiff);
    }

    @Test
    public void testBiggestDiffWithTwoElement() {

        int[] array = new int[2];
        array[0] = 10;
        array[1] = 5;

        DiffCalculator calculator = new DiffCalculator();
        int biggestDiff = calculator.calculateBiggestDiff(array);

        Assert.assertEquals("", 5, biggestDiff);
    }

    @Test
    public void testBiggestDiffWithMoreThanTwoElement() {

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 9;
        array[2] = 7;
        array[3] = 4;
        array[4] = -1;

        DiffCalculator calculator = new DiffCalculator();
        int biggestDiff = calculator.calculateBiggestDiff(array);

        Assert.assertEquals("", 5, biggestDiff);
    }
}
